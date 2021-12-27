package com.example.springsesiones456.controller;

import com.example.springsesiones456.entities.Laptop;
import com.example.springsesiones456.repository.LaptopRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    private LaptopRepository laptopRepository;



    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    @ApiOperation("Buscar todos los portátiles existentes en la base de datos")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    @ApiOperation("Buscar un portátil por clave primaria id Long")
    public ResponseEntity<Laptop> findOneById(@ApiParam("Clave primaria tipo Long") @PathVariable Long id) {
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        if (laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
            else
                return ResponseEntity.notFound().build();
    }

    @PostMapping("/api/laptops")
    @ApiOperation("Crear un portátil nuevo y guardarlo en la base de datos")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){

        if (laptop.getId() != null){
            log.warn("Trying to create a Laptop that already has a registered id");
            return ResponseEntity.badRequest().build();
        }

        Laptop result = laptopRepository.save(laptop);
        return ResponseEntity.ok(result);
    }
    @PutMapping("/api/laptops/{id}")
    @ApiOperation("Actualizar los datos de un portátil ya existente en la base de datos")
    public ResponseEntity<Laptop> update (@RequestBody Laptop laptop) {

        if (laptop.getId() == null){
            log.warn("Trying to update a non existent book");
            return ResponseEntity.badRequest().build();
        }

        if (!laptopRepository.existsById(laptop.getId())){
            log.warn("Trying to update a non existent book");
            return ResponseEntity.notFound().build();
        }

            Laptop result = laptopRepository.save(laptop);
            return ResponseEntity.ok(result);

    }
    @DeleteMapping("/api/laptops/{id}")
    @ApiIgnore //Ignorar este método para que no aparezca en la documentación de la api Swagger
    public ResponseEntity<Laptop> delete (@PathVariable Long id) {

        if (!laptopRepository.existsById(id)){

            return ResponseEntity.notFound().build();
        }
        laptopRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/api/laptops")
    @ApiIgnore //Ignorar este método para que no aparezca en la documentación de la api Swagger
    public ResponseEntity<Laptop> deleteAll (){
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }




}
