-- Script de creación de tablas para PostgreSQL (Neon).
-- Ejecutarlo una sola vez en el SQL Editor de Neon.
-- Las columnas siguen los atributos de las clases en com.example.model y com.example.Productos.

CREATE TABLE IF NOT EXISTS usuarios (
    id              BIGSERIAL PRIMARY KEY,
    nombre          VARCHAR(100) NOT NULL,
    apellido        VARCHAR(100) NOT NULL,
    email           VARCHAR(150) NOT NULL UNIQUE,
    telefono        VARCHAR(20),
    direccion       VARCHAR(200),
    rol             VARCHAR(20)  NOT NULL DEFAULT 'usuario',
    estado          VARCHAR(20)  NOT NULL DEFAULT 'activo',
    fecha_registro  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS cupones (
    id              BIGSERIAL PRIMARY KEY,
    codigo          VARCHAR(50)  NOT NULL UNIQUE,
    porcentaje      NUMERIC(5,2) NOT NULL CHECK (porcentaje > 0 AND porcentaje <= 100),
    usos            INTEGER      NOT NULL DEFAULT 0 CHECK (usos >= 0),
    estado          VARCHAR(20)  NOT NULL DEFAULT 'activo',
    fecha_creacion  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS administradores (
    id                     BIGSERIAL PRIMARY KEY,
    usuario_administrador  VARCHAR(50)  NOT NULL UNIQUE,
    contrasena             VARCHAR(100) NOT NULL,
    estado                 VARCHAR(20)  NOT NULL DEFAULT 'activo',
    fecha_registro         TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS proveedores (
    id_proveedor           VARCHAR(20)  PRIMARY KEY,
    contrasena             VARCHAR(100) NOT NULL,
    nombre_completo        VARCHAR(150) NOT NULL,
    telefono               VARCHAR(20),
    fecha_creacion_cuenta  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS productos (
    id_producto        VARCHAR(20)    PRIMARY KEY,
    id_proveedor       VARCHAR(20)    REFERENCES proveedores (id_proveedor),
    nombre_producto    VARCHAR(150)   NOT NULL,
    precio             NUMERIC(10,2)  NOT NULL CHECK (precio >= 0),
    marca              VARCHAR(100),
    stock              INTEGER        NOT NULL DEFAULT 0 CHECK (stock >= 0),
    activo             BOOLEAN        NOT NULL DEFAULT TRUE,
    descripcion        TEXT,
    fecha_publicacion  TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP
);
