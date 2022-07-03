package atividade.exercicio1.models.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import atividade.exercicio1.dto.StatesDto;
import atividade.exercicio1.models.Region;
import atividade.exercicio1.models.States;

public interface StatesRepository extends JpaRepository<States, Long>{
    public List<StatesDto> findByOrderByPopulacaoAsc();
    public List<StatesDto> findByOrderByAreaAsc();
    public Page<States> findByRegion(Region region, Pageable page);
}
