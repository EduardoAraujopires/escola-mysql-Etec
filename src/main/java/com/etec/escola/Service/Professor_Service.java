package com.etec.escola.Service;

import com.etec.escola.Interface.Professor_Repository;
import com.etec.escola.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Professor_Service {
    private final Professor_Repository professorRepository;

    public Professor_Service(Professor_Repository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> bustarProfessor() {
        return professorRepository.findAll();
    }

    public Professor salvarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor buscarTodosProfessoresID(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    public void deletarProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}
