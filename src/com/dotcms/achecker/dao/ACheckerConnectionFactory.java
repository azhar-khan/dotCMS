package com.dotcms.achecker.dao;
				LOG.debug(  "Connection opened for thread "  );
			}
			return connection;
		} catch (Exception e) {
			LOG.error(  "---------- DBConnectionFactory: error : " + e);
			throw new SQLException(e.toString());
		}
	}
	private static Connection getConn() throws Exception {

	/**
	 * This method closes all the possible opened connections
	 */
	public static void closeConnection() throws SQLException {
		try {
			if ( connection!= null  ) {
			LOG.error(  "---------- DBConnectionFactory: error closing the db dbconnection ---------------", e);
			throw new SQLException(e.toString());
		}

	}
 
}