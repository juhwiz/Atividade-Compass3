package atividade.exercicio1.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import atividade.exercicio1.dto.StatesDto;
import atividade.exercicio1.dto.StatesListDto;
import atividade.exercicio1.models.Region;
import atividade.exercicio1.models.States;
import atividade.exercicio1.models.form.StatesUpdateForm;
import atividade.exercicio1.models.repository.StatesRepository;

@Service
public class StatesService {
    
    private Logger log = LoggerFactory.getLogger(StatesService.class);


    @Autowired
    private StatesRepository repository;
    
    //Insert State
    public ResponseEntity<StatesDto> addNewState(StatesDto statesDto){
        
        log.info("AddNewState - Inicio - Salvando o estado {}", statesDto.getName());
        
        States state = new States(statesDto); // Entity <- Dto
        repository.save(state); // Method save only receive an entity

        log.info("AddNewState - Fim - estado salvo com o id {}", statesDto.getId());
        return ResponseEntity.ok(new StatesDto(state)); // Return Dto <- Entity
    }

    public Page<StatesDto> getAllStates(Pageable page) {
        
        log.info("getAllStates() - Inicio - listando os estados");
        Page<States> states = repository.findAll(page);
        return states.map(StatesDto::new);

    }

    public Page<StatesDto> listByRegion(Region region, Pageable page){
        log.info("listByRegion() - Inicio - listando os estados por região");
        Page<States> result = repository.findByRegion(region, page); 
        return result.map(StatesDto:: new);
    }

    public ResponseEntity<StatesListDto> findStateById(Long id){
        log.info("findStateById() - Inicio - listando o estado do id {}", id);
        Optional<States> stateById = repository.findById(id);

        if(stateById.isPresent()){
            log.info("findStateById() - Fim - listado o estado do id {}", id);
            return ResponseEntity.ok(new StatesListDto(stateById.get()));

        }
        return ResponseEntity.notFound().build();
    }

    //Update State
    public ResponseEntity<StatesDto> updateStatesById(Long id, StatesUpdateForm form) {
        log.info("updateStatesById() - Inicio - atualizando o estado do id {}", id);
        Optional<States> stateById = repository.findById(id);

        if(stateById.isPresent()){
            States state = form.atualizar(id, repository);
            log.info("updateStatesById() - Fim - atualizado o estado do id {}", id);
            return ResponseEntity.ok(new StatesDto(state));
        }

        return ResponseEntity.notFound().build();
    }

    //Delete State
    public ResponseEntity<StatesDto> deleteStatesById(Long id) {
        log.info("deleteStatesById() - Inicio - apagando o estado do id {}", id);
        Optional<States> stateById = repository.findById(id);

        if(stateById.isPresent()){        
            repository.deleteById(id);
            log.info("deleteStatesById() - Fim - apagado o estado do id {}", id);
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }
}
