package atividade.exercicio1.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import atividade.exercicio1.dto.StatesDto;
import atividade.exercicio1.dto.StatesListDto;
import atividade.exercicio1.models.Region;
import atividade.exercicio1.models.form.StatesUpdateForm;
import atividade.exercicio1.service.StatesService;


@RestController
@RequestMapping("/api/states")
public class StatesController {

    private Logger log = LoggerFactory.getLogger(StatesController.class);

    @Autowired
    private StatesService service;

    //Insert State
    @PostMapping
    public ResponseEntity<StatesDto> createState(@RequestBody @Valid StatesDto state){
        
        log.info("createState() - Inicio - Realizando cadastro de estado");
        ResponseEntity<StatesDto> stateDto = service.addNewState(state);
        return stateDto;
    }

    //Select State by id
    @GetMapping("/{id}")
    public ResponseEntity<StatesListDto> findStateById(@PathVariable Long id){
        log.info("findStateById() - Inicio - realizando listagem com id");
        ResponseEntity<StatesListDto> states = service.findStateById(id);

        return states;
    }

    //Select State with Order
    @GetMapping
    public Page<StatesDto> findOrderBy(@RequestParam(required = false) Region region,
        Pageable page){
        log.info("findOrderBy() - Inicio - realizando listagem");

        if(region == null){
            Page<StatesDto> states = service.getAllStates(page);
            return states;
        } else {
            Page<StatesDto> states = service.listByRegion(region, page);
            return states;
        }
        
    }

    //Alter State
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<StatesDto> updateState(@PathVariable Long id, @RequestBody @Valid StatesUpdateForm form){
        log.info("updateState() - Inicio - realizando update de estado");
        ResponseEntity<StatesDto> states = service.updateStatesById(id, form);
        return states;
    }

    //Delete State
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<StatesDto> deleteState(@PathVariable Long id){
        log.info("deleteState() - Inicio - realizando o delete de estado");
        ResponseEntity<StatesDto> states = service.deleteStatesById(id);
        return states;
    }

}

