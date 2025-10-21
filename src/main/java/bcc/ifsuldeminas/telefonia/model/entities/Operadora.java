package bcc.ifsuldeminas.telefonia.model.entities;

import bcc.ifsuldeminas.telefonia.model.entities.comercial.Celular;
import bcc.ifsuldeminas.telefonia.model.entities.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.entities.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Operadora {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private List<Cliente> clientes;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private List<Celular> celulares;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private List<Plano> planos;
}
