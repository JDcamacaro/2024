package com.example.demo.Controllers;

import com.example.demo.models.Models;
import com.example.demo.services.GuiaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Restcontroller
@RequestMapping(path = "/guia")
public class GuiaController {
    @Autowired
    GuiaServices guiaServices;

    @GetMapping(path = "/leer")
    public Models getModelo(){

        Models modelo = new Models();
        modelo.setID(1);
        modelo.setNombre("jesus");
        modelo.setApellido("camacaro");
        modelo.setPais("venezuela");
        modelo.setTelefono(41203000);
        return modelo;
    }

    @PostMapping(path = "/crear")
    public ArrayList<Models> crearInfo(@RequestBody Models crear){
        return guiaServices.crearInfo(crear);
    }

}
