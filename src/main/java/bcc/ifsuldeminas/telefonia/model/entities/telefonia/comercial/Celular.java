package bcc.ifsuldeminas.telefonia.model.entities.telefonia.comercial;

import bcc.ifsuldeminas.telefonia.model.entities.telefonia.pessoal.Cliente;

import java.util.List;

public class Celular {
    private long numero;
    private Cliente cliente;
    private Plano plano;
    private List<Ligacao> ligacoes;
}
