package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.Productos;
import com.example.model.Databaseacaonnection;

// DAO (Data Access Object): aquí va todo el SQL de la tabla productos.
// Las vistas de Vaadin solo llaman a estos métodos y nunca escriben SQL.
public class ProductoDAO {

    // CREATE: inserta un producto nuevo. Devuelve true si se guardó.
    public boolean insertar(Productos producto) throws SQLException {
        String sql = "INSERT INTO productos (id_producto, id_proveedor, nombre_producto, precio, marca, stock, "
                + "activo, descripcion, fecha_publicacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        if (producto.getFechaPublicacion() == null) {
            producto.setFechaPublicacion(LocalDateTime.now());
        }

        try (Connection con = Databaseacaonnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, producto.getIdProducto());
            ps.setString(2, producto.getIdProveedor());
            ps.setString(3, producto.getNombreProducto());
            ps.setDouble(4, producto.getPrecio());
            ps.setString(5, producto.getMarca());
            ps.setInt(6, producto.getStock());
            ps.setBoolean(7, producto.isActivo());
            ps.setString(8, producto.getDescripcion());
            ps.setObject(9, producto.getFechaPublicacion());
            return ps.executeUpdate() == 1;
        }
    }

    // READ: busca un producto por su código. Devuelve null si no existe.
    public Productos buscarPorId(String idProducto) throws SQLException {
        String sql = "SELECT * FROM productos WHERE id_producto = ?";

        try (Connection con = Databaseacaonnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idProducto);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapearProducto(rs);
                }
                return null;
            }
        }
    }

    // READ: devuelve todos los productos (para llenar el Grid de la vista).
    public List<Productos> listarTodos() throws SQLException {
        String sql = "SELECT * FROM productos ORDER BY nombre_producto";
        List<Productos> lista = new ArrayList<>();

        try (Connection con = Databaseacaonnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(mapearProducto(rs));
            }
        }
        return lista;
    }

    // UPDATE: actualiza los datos de un producto existente. Devuelve true si encontró el código.
    public boolean actualizar(Productos producto) throws SQLException {
        String sql = "UPDATE productos SET id_proveedor = ?, nombre_producto = ?, precio = ?, marca = ?, "
                + "stock = ?, activo = ?, descripcion = ? WHERE id_producto = ?";

        try (Connection con = Databaseacaonnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, producto.getIdProveedor());
            ps.setString(2, producto.getNombreProducto());
            ps.setDouble(3, producto.getPrecio());
            ps.setString(4, producto.getMarca());
            ps.setInt(5, producto.getStock());
            ps.setBoolean(6, producto.isActivo());
            ps.setString(7, producto.getDescripcion());
            ps.setString(8, producto.getIdProducto());
            return ps.executeUpdate() == 1;
        }
    }

    // DELETE: elimina un producto por su código. Devuelve true si lo borró.
    public boolean eliminar(String idProducto) throws SQLException {
        String sql = "DELETE FROM productos WHERE id_producto = ?";

        try (Connection con = Databaseacaonnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idProducto);
            return ps.executeUpdate() == 1;
        }
    }

    // Convierte la fila actual del ResultSet en un objeto Productos.
    private Productos mapearProducto(ResultSet rs) throws SQLException {
        return new Productos(
                rs.getString("id_producto"),
                rs.getString("id_proveedor"),
                rs.getString("nombre_producto"),
                rs.getDouble("precio"),
                rs.getString("marca"),
                rs.getInt("stock"),
                rs.getBoolean("activo"),
                rs.getString("descripcion"),
                rs.getObject("fecha_publicacion", LocalDateTime.class));
    }
}
