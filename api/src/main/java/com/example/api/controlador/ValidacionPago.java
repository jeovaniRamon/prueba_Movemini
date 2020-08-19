package com.example.api.controlador;

import com.example.api.tarjeta.TarjetaDC;

import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
public class ValidacionPago {

    @PostMapping(consumes ={MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getValidacion(@Valid @RequestBody TarjetaDC tarjeta,BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "error: "+bindingResult.toString();
        }

        return "Validacion de datos exitoso.";


    }
}
