package bcc.ifsuldeminas.telefonia.controller.comercial;

import bcc.ifsuldeminas.telefonia.model.entities.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.repositories.comercial.PlanoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public Plano get(@PathVariable Long id){
        //Buscando um plano pelo 'id' informado
        Plano plano = planoRepository.getById(id);
        //A implementar: tratamento de erros
        return plano;
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
}
