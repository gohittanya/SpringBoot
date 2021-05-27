package KH1.example.demo.Service;
import KH1.example.demo.Model.Patient;
    
@Autowired
private Repository Repository;
    
public Patient Service(Patient p) {
        String id = RandomStringUtils.randomAlphanumeric(16);
        p.setPid(id);
        return repository.save(p);
    }
public Patient search(String name) {
        return repository.findByName(name);
    }

}
