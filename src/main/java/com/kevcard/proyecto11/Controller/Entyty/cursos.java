package com.kevcard.proyecto11.Controller.Entyty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevcard.proyecto11.Controller.curso;
@RestController
@RequestMapping("/cursos")

public class cursos {
    
    private List<curso> cursos = new ArrayList<>();
    
    @GetMapping
    public List<curso> MostrarCursos() {
        return cursos; 
    }
    @PostMapping
    public cursos crearCurso(@RequestBody curso curso) {
        cursos.add(curso);
        return this;
    }
@PutMapping("/{cursosId}")
public cursos actualizarPcCursos(@PathVariable int  id, @RequestBody curso cursoActualizado) {
    for (curso c : cursos) {
        if (c.getId() == id) {
            c.setNombre(cursoActualizado.getNombre());
            c.setDescripcion(cursoActualizado.getDescripcion());
            c.setDuracionHoras(cursoActualizado.getDuracionHoras());
            c.setActivo(cursoActualizado.isActivo());
            return this;
        }
    }
            return null;

}
    
}

  