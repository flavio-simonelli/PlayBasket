package it.uniroma2.dicii.ispw.utils.db;

import it.uniroma2.dicii.ispw.utils.exceptions.SystemException;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {

    private static ConnectionDB instance;

    public static ConnectionDB getInstance() {
        if (instance == null)
            instance = new ConnectionDB();
        return instance;
    }

    private Connection connection;

    public Connection connect() throws SystemException {

        String user;
        String pass;
        String dbUrl;
        String driverClassName;

        try {
            if (connection == null || connection.isClosed()) {
                String resourceName = "config.properties";
                InputStream inputStream = ConnectionDB.class.getClassLoader().getResourceAsStream(resourceName);
                Properties props = new Properties();
                props.load(inputStream);
                pass = props.getProperty("PASS");
                user = props.getProperty("USER");
                dbUrl = props.getProperty("DB_URL");
                driverClassName = props.getProperty("DRIVER_CLASS_NAME");
                Class.forName(driverClassName);
                DriverManager.setLoginTimeout(5);
                connection = DriverManager.getConnection(dbUrl, user, pass);
            }
        } catch (SQLException e) {
            /*Trigger trigger = new Trigger();
            trigger.throwDBConnectionFailedException(e);*/
        } catch (ClassNotFoundException | IOException e) {
            throw new SystemException();
        }
        return connection;
    }


    public void closeConnection() throws SQLException { connection.close(); }
}
