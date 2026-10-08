package com.example.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseacaonnection {
private static final String URL = "jdbc:postgresql://ep-example.us-east-2.aws.neon.tech/neondb?sslmode=require";
    private static final String USER = "tu_usuario_neon";
    private static final String PASSWORD = "tu_password_neon";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver PostgreSQL no encontrado", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

