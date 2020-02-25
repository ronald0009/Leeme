package com.rab.crr;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobLogger {
	private static boolean logToFile;
	private static boolean logToConsole;
	private static boolean logMessage;
	private static boolean logWarning;
	private static boolean logError;
	private static boolean logToDatabase;
	private static boolean initialized = false;
	private static Map<String, String> dbParams;
	private static Logger logger = Logger.getLogger("MyLog");

	private JobLogger() {
	}

	public static void config(boolean logToFileParam, boolean logToConsoleParam, boolean logToDatabaseParam,
			boolean logMessageParam, boolean logWarningParam, boolean logErrorParam, Map<String, String> dbParamsMap) {
		logToFile = logToFileParam;
		logToConsole = logToConsoleParam;
		logToDatabase = logToDatabaseParam;
		logMessage = logMessageParam;
		logWarning = logWarningParam;
		logError = logErrorParam;
		dbParams = dbParamsMap;
		initialized = true;
	}

	public static void logMessage(String pMessageText, boolean message, boolean warning, boolean error)
			throws Exception {
		if (!initialized) {
			throw new Exception("Initialize the class");
		}

		String messageText = pMessageText.trim();
		if (messageText == null || messageText.length() == 0) {
			return;
		}

		if (!logToConsole && !logToFile && !logToDatabase) {
			throw new Exception("Invalid configuration");
		}

		if ((!logError && !logMessage && !logWarning) || (!message && !warning && !error)) {
			throw new Exception("Error or Warning or Message must be specified");
		}

		if (logToConsole) {
			ConsoleHandler ch = new ConsoleHandler();
			logger.addHandler(ch);
			logger.log(Level.INFO, messageText);
		}

		if (logToFile || logToDatabase) {
			Class.forName("org.hsqldb.jdbcDriver");

			Connection connection = null;
			Statement stmt = null;
			Properties connectionProps = new Properties();
			connectionProps.put("user", dbParams.get("userName"));
			connectionProps.put("password", dbParams.get("password"));

			try {
				String conn = "jdbc:" + dbParams.get("dbms") + "://" + dbParams.get("serverName") + ":"
						+ dbParams.get("portNumber") + "/";
				System.out.println(conn);
//				connection = DriverManager.getConnection(conn, connectionProps);
				connection = DriverManager.getConnection("jdbc:hsqldb:tempdb", "sa", "");

				stmt = connection.createStatement();

				String l = null;
				if (error && logError) {
					l = l + "error " + DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
				}

				if (warning && logWarning) {
					l = l + "warning " + DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
				}

				if (message && logMessage) {
					l = l + "message " + DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
				}

				if (logToFile) {
					File logFile = new File(dbParams.get("logFileFolder") + "/logFile.txt");
					if (!logFile.exists()) {
						l = l + "message " + logFile.createNewFile();
					}

					FileHandler fh = new FileHandler(dbParams.get("logFileFolder") + "/logFile.txt");
					logger.addHandler(fh);
					logger.log(Level.INFO, messageText);
				}

				if (logToDatabase) {
					int t = 0;
					if (message && logMessage) {
						t = 1;
					}

					if (error && logError) {
						t = 2;
					}

					if (warning && logWarning) {
						t = 3;
					}

					stmt.executeUpdate("insert into Log_Values('" + message + "', " + t + ")");
				}
			} finally {
				try {
					if (stmt != null) {
						stmt.close();
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				try {
					if (connection != null) {
						connection.close();
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
}
