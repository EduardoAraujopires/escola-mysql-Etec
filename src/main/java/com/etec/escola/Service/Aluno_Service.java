package com.etec.escola.Service;

import com.etec.escola.Interface.Aluno_Repository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Aluno_Service {
    private final Aluno_Repository alunoRepository;

      public Aluno_Service(Aluno_Repository alunoRepository) {
        this.alunoRepository = alunoRepository;
      }

      public List<Aluno> buscarAlunos (){
          return alunoRepository.findAll();
      }

      public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
      }

     public Aluno buscarAlunoId(Long id){
        return alunoRepository.findById(id).orElse(null);
     }

     public void deletarAluno(Long id){
          alunoRepository.deleteById(id);
     }
}

