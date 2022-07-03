package atividade.exercicio1.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import atividade.exercicio1.dto.StatesDto;

@Entity
public class States {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //automatically genareted 
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


    public States() {
    }


    public States(Long id, @NotNull  @NotEmpty String name, Region region,@NotNull  Long populacao,@NotNull @NotEmpty String capital,@NotNull  Double area) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.populacao = populacao;
        this.capital = capital;
        this.area = area;
    }

    public States(StatesDto state){
        this.id = state.getId();
        this.name = state.getName();
        this.region = state.getRegion();
        this.populacao = state.getPopulacao();
        this.capital = state.getCapital();
        this.area = state.getArea();
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
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }



//#endregion

}