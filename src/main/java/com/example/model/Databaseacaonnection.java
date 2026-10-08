package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseacaonnection {
    // Las credenciales se leen de variables de entorno para no subirlas a GitHub.
    // Ejemplo de DB_URL: jdbc:postgresql://ep-xxxx.us-east-2.aws.neon.tech/neondb?sslmode=require
    private static final String URL = System.getenv("DB_URL");
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    public static Connection getConnection() throws SQLException {
        if (URL == null || USER == null || PASSWORD == null) {
            throw new SQLException("Faltan las variables de entorno DB_URL, DB_USER y/o DB_PASSWORD");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
