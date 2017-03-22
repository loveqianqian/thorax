package com.herench.utils

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 * com.herench.utils
 * @author zhiwei
 * @create 2017-03-22 21:13.
 */
class DbUtils {

    init {
        Class.forName("oracle.jdbc.driver.OracleDriver")
    }

    val connection: Connection
        @Throws(SQLException::class)
        get() = DriverManager.getConnection("url", "username", "")
}