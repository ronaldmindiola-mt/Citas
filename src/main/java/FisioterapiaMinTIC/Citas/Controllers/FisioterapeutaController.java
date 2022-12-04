package FisioterapiaMinTIC.Citas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FisioterapiaMinTIC.Citas.Models.FisioterapeutaModel;
import FisioterapiaMinTIC.Citas.Services.FisioterapeutaService;

@RestController
@RequestMapping("/Fisioterapeutas")
public class FisioterapeutaController {
    @Autowired
    FisioterapeutaService fisioterapeutaService;

    @GetMapping("/all")
    public List<FisioterapeutaModel> getAllFisioterapeutaModel(){
        return fisioterapeutaService.getAllFisioterapeutaModel();
    }
}
