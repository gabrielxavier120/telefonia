package bcc.ifsuldeminas.telefonia.model.entities.comercial;

import bcc.ifsuldeminas.telefonia.model.entities.pessoal.Cliente;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long numero;
    private Cliente cliente;
    private Plano plano;
    private List<Ligacao> ligacoes;
}
