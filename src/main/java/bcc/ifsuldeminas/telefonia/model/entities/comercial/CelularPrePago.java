package bcc.ifsuldeminas.telefonia.model.entities.comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
public class CelularPrePago extends Celular {
    private double saldo;
    @Temporal(TemporalType.DATE)
    private Date dataDeValidade;
}
