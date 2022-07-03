package atividade.exercicio1.dto;

import atividade.exercicio1.models.Region;
import atividade.exercicio1.models.States;

public class StatesListDto {
    private Long id; //automatically genareted 
    private String name;
    private Region region;
    private Long populacao;
    private String capital;
    private Double area;


    public StatesListDto(Long id, String name, Region region, Long populacao, String capital, Double area) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.populacao = populacao;
        this.capital = capital;
        this.area = area;
    }


    public StatesListDto(States states) {
        this.id = states.getId();
        this.name = states.getName();
        this.region = states.getRegion();
        this.populacao = states.getPopulacao();
        this.capital = states.getCapital();
        this.area = states.getArea();
    }


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
