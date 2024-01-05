package com.lealdedv.lealdev.resourses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealdedv.lealdev.domain.Categoria;


@RestController
public class CategoriaResourse {
    
    @GetMapping(value = "/categorias")
    public List<Categoria> listar() {
        Categoria cat1 = new Categoria(1,"categoria 1");
        Categoria cat2 = new Categoria(2,"categoria 2");

        List list =  new ArrayList<>();

        list.add(cat1);
        list.add(cat2);
        
        return list;
    }    

}
