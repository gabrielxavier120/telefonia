package bcc.ifsuldeminas.telefonia.model.entities.comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Plano {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @NotNull
    @NotBlank
    private String nome;
    @NotNull
    @DecimalMin(value="1.49")
    private double valorPorMinuto;

    //Construtor padrão
    public Plano(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }
}
