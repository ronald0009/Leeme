ScrollableResults sr = sql.scroll();
while (sr.next()) {
	conSr++;
}
sr.beforeFirst();
while (sr.next()) {
	field.setValue(sr.get(j));
}
