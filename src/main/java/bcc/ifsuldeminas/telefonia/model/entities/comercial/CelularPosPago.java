package bcc.ifsuldeminas.telefonia.model.entities.comercial;

import jakarta.persistence.Entity;

@Entity
public class CelularPosPago extends Celular {
    private int diaDeVencimento;
}
