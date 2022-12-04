package FisioterapiaMinTIC.Citas.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("Fisioterapeutas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FisioterapeutaModel {
   
    @Id
    private String id;
    private long CC;
    private String nombre;
    private String apellido;
    private String especialidad;
     
}
