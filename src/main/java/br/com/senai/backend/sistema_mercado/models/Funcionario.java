package br.com.senai.backend.sistema_mercado.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer funcId;
    @Column(name="nome")
    private String nome;
    @Column(name="cpf")
    private String cpf;
    @Column(name="cargo")
    private String cargo;
    @Column(name="data_nascimento")
    private LocalDate dataNascimento;
    @ManyToMany
    @JoinTable( name="funcionario_mercadoria",
        joinColumns = @JoinColumn(name="id_funcionario", referencedColumnName =  "funcId"),
        inverseJoinColumns = @JoinColumn(name="id_mercadoria", referencedColumnName = "mercaId")
    )
    private List<Mercadoria> mercadorias;
    public Funcionario(Integer funcId, String nome, String cpf, String cargo, LocalDate dataNascimento,
            List<Mercadoria> mercadorias) {
        this.funcId = funcId;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dataNascimento = dataNascimento;
        this.mercadorias = mercadorias;
    }
    public Integer getFuncId() {
        return funcId;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getCargo() {
        return cargo;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }
    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }
}
