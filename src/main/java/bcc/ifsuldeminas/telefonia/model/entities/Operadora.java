package bcc.ifsuldeminas.telefonia.model.entities;

import bcc.ifsuldeminas.telefonia.model.entities.comercial.Celular;
import bcc.ifsuldeminas.telefonia.model.entities.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.entities.pessoal.Cliente;
import java.util.List;

public class Operadora {
    private String nome;
    private List<Cliente> clientes;
    private List<Celular> celulares;
    private List<Plano> planos;
}
