package com.sena.Tareass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.Tareass.interfaceService.ItareassService;
import com.sena.Tareass.models.tareass;
import com.sena.Tareass.service.emailService;

@RequestMapping("api/v1/tareass")
@RestController
public class tareassController {

    @Autowired
    private ItareassService tareassService;

    @Autowired
    private emailService emailService;

    @PostMapping("/")

    public ResponseEntity<Object> save(@ModelAttribute("tareass") tareass tareass){
        tareassService.save(tareass);
        emailService.enviarCorreoBienvenida(tareass.getAssigned_to());
        return new ResponseEntity<>(tareass, HttpStatus.OK);
    }
    
    @GetMapping("path")
    public ResponseEntity<Object> findAll() {
        var listatareass = tareassService.findAll();
        return new ResponseEntity<>(listatareass, HttpStatus.OK);
    }
    
     @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var tareass = tareassService.findOne(id);
        return new ResponseEntity<>(tareass, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
        tareassService.delete(id);
        return new ResponseEntity<>("Registro eliminado permanentemente", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("tareass") tareass tareassUpdate) {
        var tareass = tareassService.findOne(id).get();
        if (tareass != null) {
            tareass.setTitle(tareassUpdate.getTitle());
            tareass.setDueDate(tareassUpdate.getDueDate());
            tareass.setAssigned_to(tareassUpdate.getAssigned_to());
            tareass.setStatus(tareassUpdate.getStatus());

            tareassService.save(tareass);
            return new ResponseEntity<>(tareass, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error tarea NO Encontrada", HttpStatus.BAD_REQUEST);
        }
    }
}
