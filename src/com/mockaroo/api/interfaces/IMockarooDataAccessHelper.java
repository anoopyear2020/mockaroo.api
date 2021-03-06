package com.mockaroo.api.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Interface that provide base methods to data access
 * @author Dennis Hernández Vargas
 * @version 1.0.0 - 19/July/2014
 * @since 1.0.0
 */
public interface IMockarooDataAccessHelper {

	/**
	 * Insert into a data base
	 * @param tableName Table name
	 * @param jsonObject JSONObject to insert
	 * @param values Columns of the table
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	void Insert(String tableName, JSONObject jsonObject, String[] values, Connection connection) 
			throws ClassNotFoundException, SQLException;
	
	/**
	 * Insert into a data base
	 * @param tableName Table name
	 * @param jsonArray JSONArray to insert
	 * @param values Columns of the table
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	void Insert(String tableName, JSONArray jsonArray, String[] values, Connection connection)
			throws ClassNotFoundException, SQLException;
}
