package com.codigo.proyectoinicio2.controller;

import com.codigo.proyectoinicio2.controller.Model.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codigo/claseMiercoles")
public class MiPrimeraApp {
    @GetMapping("/saludar")
    public String saludos(){
        return "hola es mi primer endPoint";
    }
    @Value("${correo}")
    private String correo;
@GetMapping("/persona")
    public Persona getPersona(){
    Persona persona = new Persona();
    persona.setNombre("Paul");
    persona.setApellidos("Martins");
    persona.setCorreo(correo);
    persona.setEdad(32);
    persona.setDistrito("Ate");

    return persona;
}
}
