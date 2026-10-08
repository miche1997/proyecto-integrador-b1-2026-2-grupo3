package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Eat and Bite - DB")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Eat and Bite - Gestión de Entidades (CRUD)");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("Clientes", crearSeccionClientes());
        tabSheet.add("Proveedores", crearSeccionProveedores());
        tabSheet.add("Productos", crearSeccionProductos());
        tabSheet.add("Administrador", crearSeccionAdministrador());
        tabSheet.add("Cupones", crearSeccionCupones());

        add(titulo, tabSheet);
    }

    // Método privado para gestionar la primera entidad
    private Component crearSeccionClientes() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField emailField = new TextField("Email");
        TextField telefonoField = new TextField("Teléfono");
        TextField direccionField = new TextField("Dirección");
            

        FormLayout form = new FormLayout(idField, nombreField, emailField, telefonoField, direccionField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Clientes - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Clientes - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Clientes - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Clientes - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            emailField.clear();
            telefonoField.clear();
            direccionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Email").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Teléfono").setAutoWidth(true);


        layout.add(form, acciones, grid);
        return layout;
    }

    // Método privado para gestionar la segunda entidad
    private Component crearSeccionProveedores() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID Proveedor");
        TextField descripcionField = new TextField("Descripción");
        TextField correoField = new TextField("Correo");
        TextField direccionField = new TextField("Dirección");
        Select<String> aprobacionField = new Select<>();
        aprobacionField.setLabel("Aprobación");
        aprobacionField.setItems("Aprobado", "Pendiente", "Rechazado");
        aprobacionField.setPlaceholder("Seleccione...");

        FormLayout form = new FormLayout(idField, descripcionField, correoField, direccionField, aprobacionField);

        Button btnCrear = new Button("Crear", e ->
            Notification.show("Proveedores - Crear: " + idField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e ->
            Notification.show("Proveedores - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e ->
            Notification.show("Proveedores - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e ->
            Notification.show("Proveedores - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            descripcionField.clear();
            correoField.clear();
            direccionField.clear();
            aprobacionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID Proveedor").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Descripción").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Correo").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Dirección").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Aprobación").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }
 private Component crearSeccionProductos() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID Producto");
        TextField idProveedorField = new TextField("ID Proveedor");
        TextField categoriaField = new TextField("Nombre Producto");
        TextField precioField = new TextField("Precio");
        TextField marcaField = new TextField("Marca");
        TextField stockField = new TextField("Stock");
        TextField descripcionField = new TextField("Descripción");
        Select<String> aprobacionField = new Select<>();
        aprobacionField.setLabel("Activo");
        aprobacionField.setItems("Sí", "No");
        aprobacionField.setPlaceholder("Seleccione...");

        FormLayout form = new FormLayout(idField, idProveedorField, categoriaField, precioField, marcaField, stockField, descripcionField, aprobacionField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Productos - Crear: " + idField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Productos - Consultar Código: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Productos - Actualizar Código: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Productos - Eliminar Código: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            idProveedorField.clear();
            categoriaField.clear();
            precioField.clear();
            marcaField.clear();
            stockField.clear();
            descripcionField.clear();
            aprobacionField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Código / ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Usuario Administrador").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Contraseña").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Estado").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }
 private Component crearSeccionAdministrador() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField usuarioField = new TextField("Usuario Administrador");
        TextField contrasenaField = new TextField("Contraseña");
        Select<String> estadoField = new Select<>();
        estadoField.setLabel("Estado");
        estadoField.setItems("Activo", "Inactivo");
        estadoField.setPlaceholder("Seleccione...");

        FormLayout form = new FormLayout(idField, usuarioField, contrasenaField, estadoField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Administrador - Crear: " + usuarioField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Administrador - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Administrador - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Administrador - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            usuarioField.clear();
            contrasenaField.clear();
            estadoField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Código / ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Usuario Administrador").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Contraseña").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Estado").setAutoWidth(true);
        layout.add(form, acciones, grid);
        return layout;
    }
 private Component crearSeccionCupones() {
    VerticalLayout layout = new VerticalLayout();
    layout.setPadding(false);

    TextField codigoField = new TextField("Código Cupón");
    TextField porcentajeField = new TextField("Porcentaje Descuento");
    TextField usosField = new TextField("Usos Permitidos");
    Select<String> estadoField = new Select<>();
    estadoField.setLabel("Estado");
    estadoField.setItems("Activo", "Inactivo");
    estadoField.setPlaceholder("Seleccione...");

    FormLayout form = new FormLayout(codigoField, porcentajeField, usosField, estadoField);

    Button btnCrear = new Button("Crear", e -> 
        Notification.show("Cupones - Crear: " + codigoField.getValue())
    );
    btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

    Button btnConsultar = new Button("Consultar", e -> 
        Notification.show("Cupones - Consultar Código: " + codigoField.getValue())
    );

    Button btnActualizar = new Button("Actualizar", e -> 
        Notification.show("Cupones - Actualizar Código: " + codigoField.getValue())
    );

    Button btnEliminar = new Button("Eliminar", e -> 
        Notification.show("Cupones - Eliminar Código: " + codigoField.getValue())
    );
    btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

    Button btnLimpiar = new Button("Limpiar", e -> {
        codigoField.clear();
        porcentajeField.clear();
        usosField.clear();
        estadoField.clear();
    });

    HorizontalLayout acciones = new HorizontalLayout(
        btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
    );
    acciones.getStyle().set("flex-wrap", "wrap");

    Grid<String[]> grid = new Grid<>();
    grid.addColumn(row -> row[0]).setHeader("Código").setAutoWidth(true);
    grid.addColumn(row -> row[1]).setHeader("Porcentaje").setAutoWidth(true);
    grid.addColumn(row -> row[2]).setHeader("Usos").setAutoWidth(true);
    grid.addColumn(row -> row[3]).setHeader("Estado").setAutoWidth(true);

    layout.add(form, acciones, grid);
    return layout;
}

}
