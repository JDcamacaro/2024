package com.example.demo.Controllers;
import com.example.demo.models.Models;
import com.example.demo.services.GuiaServices;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "/guia")
public class GuiaController {
    @Autowired
    GuiaServices guiaServices;

    @GetMapping(path = "/leerTodos")
    public List<Models> getAllModels() {
        return guiaServices.getAllModels();
    }

    @GetMapping(path = "/leer")
    public Models getModelo() {
        return new Models(6, "jesus", "camacaro", "venezuela", 41203000);

        /*
         * Models modelo = new Models();
         * modelo.setID(1);
         * modelo.setNombre("jesus");
         * modelo.setApellido("camacaro");
         * modelo.setPais("venezuela");
         * modelo.setTelefono(41203000);
         * return modelo;
         */
    }

    @PostMapping(path = "/crear")
    public ResponseEntity<List<Models>> crearInfo(@RequestBody @Validated Models crear) throws Exception {
        if (Objects.isNull(crear) || Objects.isNull(crear.getID())) {
            throw new BadRequestException("El objeto a crear no puede ser nulo ni tener ID no puede ser nulo");
        }
        try {
            List<Models> createdInfo = guiaServices.crearInfo(crear);
            return ResponseEntity.ok(createdInfo);
        } catch (Exception e) {
            //Log.error("Error al crear el modelo", e);
            throw new Exception("Error al crear el modelo");
        }
    }

}
