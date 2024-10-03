package com.example.demo.services;


import com.example.demo.models.Models;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class GuiaServices{

    private ArrayList<Models> lista = new ArrayList<>();


    // En el servicio GuiaServices
    public List<Models> getAllModels() {
            // Implementación para obtener todos los modelos
            return  getAllModels();
}


    public ArrayList<Models> crearInfo(Models intModelo){
        lista.add(intModelo);
        return lista;
    }
    {
        Models modelo = new Models();
        modelo.setID(1);
        modelo.setNombre("jesus");
        modelo.setApellido("camacaro");
        modelo.setPais("venezuela");
        modelo.setTelefono(412030000);

        Models model1 = new Models();
        model1.setID(2);
        model1.setNombre("jose");
        model1.setApellido("loca");
        model1.setPais("colombia");
        model1.setTelefono(412030000);

        Models model2 = new Models();
        model2.setID(3);
        model2.setNombre("david");
        model2.setApellido("ruiz");
        model2.setPais("italia");
        model2.setTelefono(412030000);

        Models model3 = new Models();
        model3.setID(4);
        model3.setNombre("juan");
        model3.setApellido("luis");
        model3.setPais("venezuela");
        model3.setTelefono(412030000);
    }

}