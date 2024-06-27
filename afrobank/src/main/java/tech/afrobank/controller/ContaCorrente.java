package tech.afrobank.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contas_corrente")
public class ContaCorrente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroConta;
    private Double saldo;
    private Double limiteChequeEspecial;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
