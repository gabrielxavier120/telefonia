package bcc.ifsuldeminas.telefonia.model.entities.pessoal;

import jakarta.persistence.Entity;

@Entity
public class ClientePessoaFisica extends Cliente {
    private String cpf;
}
