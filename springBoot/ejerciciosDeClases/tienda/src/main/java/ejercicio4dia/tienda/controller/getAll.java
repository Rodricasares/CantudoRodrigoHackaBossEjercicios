package ejercicio4dia.tienda.controller;

import ejercicio4dia.tienda.model.ControllerCliente;
import ejercicio4dia.tienda.model.ControllerProveedor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class getAll {
ControllerCliente clientControl = new ControllerCliente();
ControllerProveedor provControl = new ControllerProveedor();

@GetMapping
public String Prueba(){
    return "Hola desde MAIN";
}

    @GetMapping("/proveedores")
    public List<ControllerProveedor> obtenerProveedor(){
        List<ControllerProveedor> listProveedores = List.of(
                new ControllerProveedor(1,"Manuel","Mercadona","Agua"),
                new ControllerProveedor(2,"Paco","Super","Café"),
        new ControllerProveedor(3,"María","Coviran","Lechugas")
        );
        return listProveedores;
    }

    @GetMapping("/clientes")
    public List<ControllerCliente> obtenerTodos(){
        List<ControllerCliente> listClientes = List.of(
                new ControllerCliente(1,"Fernado","Mena"),
                new ControllerCliente(1,"Ester","Gomez"),
                new ControllerCliente(1,"María","Ruin")

        );
        return listClientes;
    }

    @GetMapping("/all")
    public Map<String, Object> obtenerTodosYProveedor() {
        Map<String, Object> resultado = new HashMap<>();

        List<ControllerCliente> listClientes = obtenerTodos();
        List<ControllerProveedor> listProveedores = obtenerProveedor();

        resultado.put("clientes", listClientes);
        resultado.put("proveedores", listProveedores);

        return resultado;
    }
}
