package tech.afrobank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.afrobank.entity.ContaCorrente;
import tech.afrobank.repository.ContaCorrenteRepository;

import java.util.List;

@RestController
@RequestMapping("/contas-corrente")
public class ContaCorrenteController {

    @Autowired
    private ContaCorrenteRepository contaCorrenteRepository;

    // Endpoint para obter todas as contas corrente
    @GetMapping("/")
    public List<ContaCorrente> getAllContasCorrente() {
        return contaCorrenteRepository.findAll();
    }

    // Endpoint para obter uma conta corrente por ID
    @GetMapping("/{id}")
    public ResponseEntity<ContaCorrente> getContaCorrenteById(@PathVariable Long id) {
        ContaCorrente contaCorrente = contaCorrenteRepository.findById(id)
                .orElse(null);

        if (contaCorrente != null) {
            return ResponseEntity.ok(contaCorrente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint para criar uma nova conta corrente
    @PostMapping("/")
    public ResponseEntity<ContaCorrente> createContaCorrente(@RequestBody ContaCorrente contaCorrente) {
        ContaCorrente novaContaCorrente = contaCorrenteRepository.save(contaCorrente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaContaCorrente);
    }

    // Endpoint para atualizar uma conta corrente existente
    @PutMapping("/{id}")
    public ResponseEntity<ContaCorrente> updateContaCorrente(@PathVariable Long id,
            @RequestBody ContaCorrente contaCorrenteDetails) {
        ContaCorrente contaCorrente = contaCorrenteRepository.findById(id)
                .orElse(null);

        if (contaCorrente != null) {
            contaCorrente.setNumeroConta(contaCorrenteDetails.getNumeroConta());
            contaCorrente.setSaldo(contaCorrenteDetails.getSaldo());
            contaCorrente.setLimiteChequeEspecial(contaCorrenteDetails.getLimiteChequeEspecial());
            // Atualizar demais atributos conforme necessário

            ContaCorrente contaCorrenteAtualizada = contaCorrenteRepository.save(contaCorrente);
            return ResponseEntity.ok(contaCorrenteAtualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint para deletar uma conta corrente
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContaCorrente(@PathVariable Long id) {
        ContaCorrente contaCorrente = contaCorrenteRepository.findById(id)
                .orElse(null);

        if (contaCorrente != null) {
            contaCorrenteRepository.delete(contaCorrente);
            return ResponseEntity.ok("Conta corrente deletada com sucesso");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
