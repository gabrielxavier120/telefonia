package bcc.ifsuldeminas.telefonia.model.entities.comercial;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Ligacao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    private int duracao;
}
