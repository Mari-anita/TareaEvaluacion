package com.sena.Tareass.interfaceService;

import java.util.Optional;
import java.util.List;

import com.sena.Tareass.models.tareass;

public interface ItareassService {

    public String save (tareass tareass);

    public List<tareass> findAll();

    public Optional<tareass> findOne(String id);

    public int delete(String id);


}
