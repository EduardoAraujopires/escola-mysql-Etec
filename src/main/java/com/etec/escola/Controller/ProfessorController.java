package com.etec.escola.Controller;

import com.etec.escola.Models.Professor;
import com.etec.escola.Service.Professor_Service;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final Professor_Service professorService;
    public ProfessorController(Professor_Service professorService){
        this.professorService =  professorService;
    }

    @GetMapping
    public List<Professor> buscarProfessor(){
        return professorService.bustarProfessor();
    }

    @PostMapping
    public Professor salvarProfessor(@RequestBody Professor professor){
        return professorService.salvarProfessor(professor);
    }


    @GetMapping("/{id}")
    public Professor buscarProfessorId(@PathVariable Long id){
        return professorService.buscarTodosProfessoresID(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable Long id){
        professorService.deletarProfessor(id);
    }

}
