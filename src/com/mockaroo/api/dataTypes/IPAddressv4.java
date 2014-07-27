/**
 * 
 */
package com.mockaroo.api.dataTypes;

import org.json.JSONObject;

import com.mockaroo.api.enums.MockarooType;
import com.mockaroo.api.exceptions.MockarooExceptionName;

/**
 * IPAddressv4 mockaroo object
 * @author Dennis Hernández Vargas
 * @version 2.0.0 - 27/07/2014
 * @since 2.0.0
 */
public class IPAddressv4 implements IMockarooObject {

	private static IPAddressv4 instance = null;
	private String columnName;

	/**
	 * Constructor
	 * @param columnName Column name
	 */
	private IPAddressv4(String columnName) {
		this.setColumnName(columnName);
	}

	/**
	 * Get the {@link IPAddressv4} object
	 * @param columnName Column name
	 * @return {@link IPAddressv4} object
	 * @throws MockarooExceptionName 
	 */
	public static IPAddressv4 getInstance(String columnName)
			throws MockarooExceptionName {
		VALIDATOR.validateColumnName(columnName, messageExceptionName);
		if (instance == null) {
			instance = new IPAddressv4(columnName);
		}

		return instance;
	}

	/**
	 * Get the columnName
	 * @return the columnName
	 */
	private String getColumnName() {
		return columnName;
	}

	/**
	 * Set the columnName
	 * @param columnName the columnName to set
	 */
	private void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	/* (non-Javadoc)
	 * @see com.mockaroo.api.dataTypes.IMockarooObject#getJSONObject()
	 */
	@Override
	public JSONObject getJSONObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(NAME, this.getColumnName());
		jsonObject.put(TYPE, this.getType());

		return jsonObject;
	}

	/* (non-Javadoc)
	 * @see com.mockaroo.api.dataTypes.IMockarooObject#getType()
	 */
	@Override
	public String getType() {
		return MockarooType.IP_Address_v4.toString().replace(UNDERSCORE, SPACE);
	}
}
