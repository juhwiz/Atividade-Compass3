package atividade.exercicio1.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import atividade.exercicio1.models.Region;
import atividade.exercicio1.models.States;

public class StatesDto {
    
    private Long id; //automatically genareted 
    @NotNull @NotEmpty
    private String name;
    private Region region;
    @NotNull 
    private Long populacao;
    @NotNull @NotEmpty
    private String capital;
    @NotNull 
    private Double area;

    //#region Constructors  

    public StatesDto() {
    }

    public StatesDto(Long id,@NotNull @NotEmpty String name,Region region,@NotNull Long populacao,@NotNull @NotEmpty String capital,@NotNull Double area) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.populacao = populacao;
        this.capital = capital;
        this.area = area;
    }

    public StatesDto(States savedState) {
        this.id = savedState.getId();
        this.name = savedState.getName();
        this.region = savedState.getRegion();
        this.populacao = savedState.getPopulacao();
        this.capital = savedState.getCapital();
        this.area = savedState.getArea();
    
    }

    //#endregion

    //#region GETTERS & SETTERS


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {

        return this.region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Long getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getArea() {
        return this.area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    //#endregion

}
