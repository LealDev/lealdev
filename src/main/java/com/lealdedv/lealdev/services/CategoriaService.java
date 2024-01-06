package com.lealdedv.lealdev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealdedv.lealdev.domain.Categoria;
import com.lealdedv.lealdev.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired 
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
    Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }

    public List<Categoria> saveAll(List <Categoria> catList){
        List<Categoria> categorias = categoriaRepository.saveAll(catList);
        return categorias;
    }

    
}
