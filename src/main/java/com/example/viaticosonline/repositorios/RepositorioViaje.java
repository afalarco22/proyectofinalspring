package com.example.viaticosonline.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.viaticosonline.entidades.Viaje;

// se hereda de la clase JpaRepository y dentro de los diamentes va la clase y el tipo de dato de la llave primaria

public interface RepositorioViaje extends JpaRepository<Viaje,Integer> {




}
