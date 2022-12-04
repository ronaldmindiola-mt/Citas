package FisioterapiaMinTIC.Citas.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FisioterapiaMinTIC.Citas.Models.FisioterapeutaModel;
import FisioterapiaMinTIC.Citas.Repositories.FisioterapeutaRepository;

@Service
public class FisioterapeutaService {
    @Autowired
    FisioterapeutaRepository fisioterapeutaRepository;

    public List<FisioterapeutaModel> getAllFisioterapeutaModel(){
        return fisioterapeutaRepository.getAll();
    }

    public FisioterapeutaModel insertFisioterapeutaModel(FisioterapeutaModel fisioterapeutaModel){
        if (fisioterapeutaModel.getId() == null) {
            return fisioterapeutaRepository.save(fisioterapeutaModel);
        }else
        return fisioterapeutaModel; 

    }
    
}
