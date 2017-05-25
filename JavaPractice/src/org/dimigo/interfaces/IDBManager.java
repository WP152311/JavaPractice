/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * 	 |_ IDBManager
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	public static IDBManager getDBObject(String database){
		IDBManager obj = null;
		if(ORACLE_DATABASE.equals(database)){
			obj = new OracleDB();
		}
		else if(SYBASE_DATABASE.equals(database)){
			obj = new SybaseDB();
		}
		return obj;
	}
}
