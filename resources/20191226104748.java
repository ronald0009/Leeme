ScrollableResults rs = null;
rs = sql.scroll(ScrollMode.FORWARD_ONLY);
if(rs.next()){
	rs.get();
	bean.setDescripcion(rs[0].toString());
}
