package bcc.ifsuldeminas.telefonia.model.entities.telefonia;

import bcc.ifsuldeminas.telefonia.model.entities.telefonia.comercial.Celular;
import bcc.ifsuldeminas.telefonia.model.entities.telefonia.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.entities.telefonia.pessoal.Cliente;
import java.util.List;

public class Operadora {
    private String nome;
    private List<Cliente> clientes;
    private List<Plano> planos;
    private List<Celular> celulares;
}
