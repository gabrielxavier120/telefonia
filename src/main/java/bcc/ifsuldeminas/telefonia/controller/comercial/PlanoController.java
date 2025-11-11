package bcc.ifsuldeminas.telefonia.controller.comercial;

import bcc.ifsuldeminas.telefonia.model.entities.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.repositories.comercial.PlanoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    private PlanoRepository planoRepository;

    //Degando ao spring a instanciação
    public PlanoController(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    @PostMapping
    public Plano create(@RequestBody Plano plano){
        planoRepository.save(plano);
        return plano;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plano> get(@PathVariable Long id){
        //Buscando um plano pelo 'id' informado
        Plano plano = getById(id);
        if(plano == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        //A implementar: tratamento de erros
        return new ResponseEntity<Plano>(plano, HttpStatus.OK);
    }

    @GetMapping
    public List<Plano> list(){
        //Obtendo todos os planos cadastrados
        List<Plano> planos = planoRepository.findAll();
        return planos;
    }

    @PutMapping("/{id}")
    public Plano update(@PathVariable Long id, @RequestBody Plano plano){
        //Obtendo o plano pelo 'id' informado
        Plano planoCadastrado = planoRepository.getById(id);
        //Atualizando os dados do plano
        planoCadastrado.setNome(plano.getNome());
        planoCadastrado.setValorPorMinuto(plano.getValorPorMinuto());
        //Persistindo as alterações
        planoRepository.save(planoCadastrado);
        return planoCadastrado;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        planoRepository.deleteById(id);
    }


    private Plano getById(long id){
        Optional<Plano> opt = planoRepository.findById(id);

        if(opt.)
    }
}
