package bcc.ifsuldeminas.telefonia.model.services.comercial;

import bcc.ifsuldeminas.telefonia.exceptions.comercial.PlanoNotFoundException;
import bcc.ifsuldeminas.telefonia.model.entities.comercial.Plano;
import bcc.ifsuldeminas.telefonia.model.repositories.comercial.PlanoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {
    private PlanoRepository planoRepository;

    public PlanoService(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    public Plano create(Plano plano){
        return planoRepository.save(plano);
    }

    public Plano get(Long id){
        Optional<Plano> opt = planoRepository.findById(id);
        if(!opt.isPresent()){
            throw new PlanoNotFoundException(id);
        }

        return opt.get();
    }

    public List<Plano> get(){
        return planoRepository.findAll();
    }

    public Plano update(Long id, Plano plano){
        Plano planoCadastrado = get(id);

        planoCadastrado.setNome(plano.getNome());
        planoCadastrado.setValorPorMinuto(plano.getValorPorMinuto());

        planoRepository.save(planoCadastrado);

        return planoCadastrado;
    }

    public void delete(Long id){
        if(!planoRepository.existsById(id)){
            throw new PlanoNotFoundException(id);
        }

        planoRepository.deleteById(id);
    }
}
