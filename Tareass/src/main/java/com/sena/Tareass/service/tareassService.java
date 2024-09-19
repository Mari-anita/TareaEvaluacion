package com.sena.Tareass.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Tareass.interfaceService.ItareassService;
import com.sena.Tareass.models.tareass;
import com.sena.Tareass.interfaces.Itareass;



@Service
public class tareassService implements ItareassService {

    @Autowired
    private Itareass data;

    @Override
    public String save(tareass tareass) {
        data.save(tareass);
        return tareass.getId();
    }

    @Override
    public List<tareass> findAll() {
        List<tareass> listatareass = (List<tareass>) data.findAll();
        return listatareass;
    }

    @Override
    public Optional<tareass> findOne(String id) {
        Optional<tareass> tareass = data.findById(id);
        return tareass;
    }

    @Override
    public int delete(String id) {
        try{
            data.deleteById(id);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

   // @Override
    //public List<tareass> fechaCercanaVenc(String fechaCercanaVenc) {
       // List<tareass> listatareass = data. fechaCercanaVenc(fechaCercanaVenc);
        //return listatareass;
    //}
 
    //@Override
    //public List<tareass> tareasVencida(String tareasVencida) {
      //  List<tareass> listatareass = data.tareasVencida(tareasVencida);
       // return listatareass;
    //}

}