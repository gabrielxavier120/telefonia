package bcc.ifsuldeminas.telefonia.model.entities.comercial;

import bcc.ifsuldeminas.telefonia.model.entities.pessoal.Cliente;

import java.util.List;

public class Celular {
    private long numero;
    private Cliente cliente;
    private Plano plano;
    private List<Ligacao> ligacoes;
}
