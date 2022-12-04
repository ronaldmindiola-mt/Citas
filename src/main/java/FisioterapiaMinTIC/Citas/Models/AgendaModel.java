package FisioterapiaMinTIC.Citas.Models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("Agendas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgendaModel {
    
    @Id
    private String id;
    private String id_fisioterapeuta;
    private LocalDate fecha;
    private List<Object> cita;
}
