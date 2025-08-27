package com.etec.escola.Controller;

import com.etec.escola.Models.Aluno;
import com.etec.escola.Service.Aluno_Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private final Aluno_Service alunoService;

    public AlunoController(Aluno_Service alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listaDeAlunos() {
        return alunoService.buscarAlunos();
    }

    @PostMapping
    public Aluno SalvarNovoAluno(@RequestBody Aluno dadosAlunos) {
        return alunoService.salvarAluno(dadosAlunos);
    }

    @GetMapping("/{id}")
    public Aluno buscarAlunoId(@PathVariable Long id) {
        return alunoService.buscarAlunoId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }
}
