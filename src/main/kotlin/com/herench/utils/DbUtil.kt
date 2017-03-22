package com.herench.utils

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * com.herench.utils

 * @author zhiwei
 * *
 * @create 2017-03-22 21:38.
 */
object DbUtil {

    private var connection: Connection? = null

    init {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver")
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }

    }

    fun getConnection(url: String, username: String, password: String): Connection? {
        try {
            connection = DriverManager.getConnection(url, username, password)
            return connection
        } catch (e: SQLException) {
            e.printStackTrace()
            return null
        }

    }


}
