package tech.afrobank.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Double rendaSalarial;
    private String senha;
}
