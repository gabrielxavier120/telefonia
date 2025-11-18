package bcc.ifsuldeminas.telefonia.controller.comercial;

import bcc.ifsuldeminas.telefonia.exceptions.comercial.PlanoNotFoundException;
import bcc.ifsuldeminas.telefonia.model.entities.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.services.comercial.PlanoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    private PlanoService planoService;

    //Degando ao spring a instanciação
    public PlanoController(PlanoService planoService) {
        this.planoService = planoService;
    }

    @PostMapping
    public ResponseEntity<Plano> create(@RequestBody @Valid Plano plano) {
        planoService.create(plano);

        return new ResponseEntity<Plano>(plano, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plano> get(@PathVariable Long id) {
        try {
            Plano plano = planoService.get(id);

            return new ResponseEntity<>(plano, HttpStatus.OK);
        } catch (PlanoNotFoundException pnfe) {
            return new ResponseEntity(pnfe.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Plano> list() {
        //Obtendo todos os planos cadastrados
        List<Plano> planos = planoService.get();

        return planos;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plano> update(@PathVariable Long id, @RequestBody @Valid Plano plano) {
        try {
            Plano planoAtualizado = planoService.update(id, plano);

            return new ResponseEntity(planoAtualizado, HttpStatus.OK);
        } catch (PlanoNotFoundException pnfe) {
            return new ResponseEntity(pnfe.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            planoService.delete(id);

            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } catch (PlanoNotFoundException pnfe) {
            return new ResponseEntity(pnfe.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}