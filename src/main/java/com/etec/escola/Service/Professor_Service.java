package com.etec.escola.Service;

import com.etec.escola.Interface.Professor_Repository;
import com.etec.escola.Models.Professor;

import java.util.List;

public class Professor_Service {

    private final Professor_Repository professorRepository;

    public Professor_Service( Professor_Repository professorRepository){
        this.professorRepository = professorRepository;
    }

    public List<Professor> buscarProfessor(){
        return professorRepository.findAll();
    }

    public Professor salvarProfessor(Professor professor){
        return  professorRepository.save(professor);
    }

    public Professor buscarId(Long id){
        return professorRepository.findById(id).orElse(null);
    }
}
