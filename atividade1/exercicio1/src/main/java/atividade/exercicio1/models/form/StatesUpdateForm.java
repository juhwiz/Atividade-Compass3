package atividade.exercicio1.models.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import atividade.exercicio1.models.Region;
import atividade.exercicio1.models.States;
import atividade.exercicio1.models.repository.StatesRepository;

public class StatesUpdateForm {
    
    @NotNull @NotEmpty
    private String name;
    @Enumerated(EnumType.STRING)
    private Region region;
    @NotNull
    private Long populacao;
    @NotNull @NotEmpty
    private String capital;
    @NotNull
    private Double area;

//#region SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setArea(Double area) {
        this.area = area;
    }
//#endregion    
    
    public States atualizar(Long id, StatesRepository repository) {

        States state = repository.getReferenceById(id);

        state.setName(this.name);
        state.setRegion(this.region);
        state.setPopulacao(this.populacao);
        state.setCapital(this.capital);
        state.setArea(this.area);

        return state;
    }
    

}
