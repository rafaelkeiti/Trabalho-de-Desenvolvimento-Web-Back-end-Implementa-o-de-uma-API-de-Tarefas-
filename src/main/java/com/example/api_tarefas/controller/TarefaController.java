package com.example.api_tarefas.controller;

import com.example.api_tarefas.model.Tarefa;
import com.example.api_tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    // Criar tarefa
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // Listar todas as tarefas
    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    // Consultar tarefa por ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefaPorId(@PathVariable Long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar tarefa
    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaDetalhes) {
        Optional<Tarefa> optionalTarefa = tarefaRepository.findById(id);
        if (!optionalTarefa.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Tarefa tarefa = optionalTarefa.get();
        tarefa.setNome(tarefaDetalhes.getNome());
        tarefa.setDataEntrega(tarefaDetalhes.getDataEntrega());
        tarefa.setResponsavel(tarefaDetalhes.getResponsavel());

        Tarefa tarefaAtualizada = tarefaRepository.save(tarefa);
        return ResponseEntity.ok(tarefaAtualizada);
    }

    // Remover tarefa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
        if (!tarefaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        tarefaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}