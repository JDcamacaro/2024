package com.example.demo.services;


import com.example.demo.models.Model;
import org.springframework.boot.Banner;

import java.util.ArrayList;

public class GuiaServices{

    private ArrayList<Model> lista = new ArrayList<>();

    public ArrayList<Model> crearInfo(Model intModel){
        lista.add(intModel);
        return lista;
    }

    {
        Model model = new Model();
        model.setID(01);
        model.setNombre("jesus");
        model.setApellido("camacaro");
        model.setPais("venezuela");
        model.setTelefono(04120300007);

        Model model1 = new Model();
        model1.setID(02);
        model1.setNombre("jesus");
        model1.setApellido("camacaro");
        model1.setPais("venezuela");
        model1.setTelefono(04120300007);

        Model model2 = new Model();
        model2.setID(03);
        model2.setNombre("jesus");
        model2.setApellido("camacaro");
        model2.setPais("venezuela");
        model2.setTelefono(04120300007);

        Model model3 = new Model();
        model3.setID(04);
        model3.setNombre("jesus");
        model3.setApellido("camacaro");
        model3.setPais("venezuela");
        model3.setTelefono(04120300007);
    }




}