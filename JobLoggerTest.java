package com.rab.crr;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JobLoggerTest {

	@Test
	public void testConfig() {
		boolean logToFile = true;
		boolean logToConsole = false;
		boolean logToDatabase = false;
		boolean logMessage = true;
		boolean logWarning = false;
		boolean logError = false;
		Map<String, String> dbParams = new HashMap<String, String>();
		dbParams.put("userName", "sa");
		dbParams.put("password", "");
		dbParams.put("dbms", "hsqldb");
		dbParams.put("serverName", "D:\\shared\\temp");
//		dbParams.put("portNumber", "4003");
		String str = null;

		JobLogger.config(logToFile, logToConsole, logToDatabase, logMessage, logWarning, logError, dbParams);
		str = "OK";

		assertNotNull(str);
	}

	@Test
	public void testLogMessage() throws Exception {
		String messageText = "This is a test";
		boolean message = true;
		boolean warning = false;
		boolean error = false;
		String str = null;

		JobLogger.logMessage(messageText, message, warning, error);
		str = "OK";

		assertNotNull(str);
	}

}
