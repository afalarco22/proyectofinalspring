package com.example.viaticosonline.controladores;

import com.example.viaticosonline.entidades.Viaje;
import com.example.viaticosonline.servicios.ServicioViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // REST: arquitctura que permite controlar el intercambio de datos entre cliente y servidor
@RequestMapping("api/uribe/viajes") // como las rutas en express (endpoit)

public class ControladorViaje {

    @Autowired // llamado a las clases en los paquetes
    ServicioViaje servicioViaje;
    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Viaje viaje){
        try{
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioViaje.registrar(viaje));

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
                    .body(servicioViaje.buscarTodos());

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje: Revisa la peticion}");

        }

    }







}
