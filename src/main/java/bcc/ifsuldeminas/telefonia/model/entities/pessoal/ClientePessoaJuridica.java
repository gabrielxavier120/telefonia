package bcc.ifsuldeminas.telefonia.model.entities.pessoal;

import jakarta.persistence.Entity;

@Entity
public class ClientePessoaJuridica extends Cliente{
    private String cnpj;
}
