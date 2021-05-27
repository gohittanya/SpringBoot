package KH1.example.demo.Repository;

import java.util.List;
import KH1.example.demo.Model.Patient;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
    
public interface Repository extends CrudRepository<Patient, String> {
    
    @Query(value = "{$or:[{firstname:{$regex:?0,$options:'i'}},{lastname:{$regex:?0,$options:'i'}}]}")
    List<Patient> getByFnameAndLname(String name);
    
    }
