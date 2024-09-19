package com.sena.Tareass.interfaces;

//import java.util.List;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.sena.Tareass.models.tareass;

public interface Itareass extends CrudRepository<tareass, String>{
    
    //@Query("SELECT t FROM tareass t WHERE  DATEDIFF(NOW(), t.fechaCercanaVenc) >= 90")
    //List<tareass> fechaCercanaVenc(String fechaCercanaVenc);

    //@Query("SELECT t FROM tareass t WHERE  DATEDIFF(NOW(), t.tareasVencida) >= 30")
    //List<tareass> tareasVencida(String tareasVencida);
}
