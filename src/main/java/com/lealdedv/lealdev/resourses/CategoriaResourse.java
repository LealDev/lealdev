package com.lealdedv.lealdev.resourses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lealdedv.lealdev.domain.Categoria;
import com.lealdedv.lealdev.services.CategoriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResourse {

    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Categoria obj = categoriaService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
    
    @PostMapping("/save")
    public List<Categoria> saveAll (@RequestBody List<Categoria> catLIst) {
        List<Categoria> objs = categoriaService.saveAll(catLIst);
        return objs;
    }
    

}
