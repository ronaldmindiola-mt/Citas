package FisioterapiaMinTIC.Citas.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import FisioterapiaMinTIC.Citas.Models.FisioterapeutaModel;

@Repository
public interface FisioterapeutaRepository extends MongoRepository <FisioterapeutaModel, String>{

}