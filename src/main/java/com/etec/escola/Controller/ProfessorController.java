package com.etec.escola.Controller;

import com.etec.escola.Models.Professor;
import com.etec.escola.Service.Professor_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

 @RestController
 @RequestMapping("/professor")
public class ProfessorController {
    private final Professor_Service professorService;

    public ProfessorController(Professor_Service professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> buscarProfessor() {
        return professorService.buscarProfessor();
    }

    @PostMapping
    public Professor SalvarProfessor(@RequestBody Professor professor) {
        return professorService.salvarProfessor(professor);
    }

    @GetMapping("/{id}")
    public Professor buscarProfessorId(@PathVariable Long id) {
        return professorService.buscarProfessorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable Long id) {
        professorService.deletarProfessorId(id);
    }

}
