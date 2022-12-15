package com.example.viaticosonline.controladores;

import com.example.viaticosonline.entidades.Empleado;
import com.example.viaticosonline.servicios.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // REST: arquitctura que permite controlar el intercambio de datos entre cliente y servidor
@RequestMapping("api/uribe/empleados") // como las rutas en express (endpoit)

public class ControladorEmpleado {

    @Autowired // llamado a las clases en los paquetes
    ServicioEmpleado servicioEmpleado;
    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Empleado empleado){
        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioEmpleado.registrar(empleado));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Revisa la peticion}");

        }

    }
    @GetMapping
    public ResponseEntity<?>buscarEmpleados(){

        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioEmpleado.buscarTodos());

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Revisa la peticion}");

        }

    }







}// fin clase
