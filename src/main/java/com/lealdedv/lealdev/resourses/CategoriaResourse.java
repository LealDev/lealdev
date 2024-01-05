package com.lealdedv.lealdev.resourses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoriaResourse {
    
    @GetMapping(value = "/categorias")
    public String listar() {
        return "REST está funcionando";
    }    

}
