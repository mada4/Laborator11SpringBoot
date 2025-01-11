package com.example.SpringBoot;

import com.example.SpringBoot.Eveniment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EvenimentRepository extends JpaRepository<Eveniment,Integer>{
    List<Eveniment> findByLocatia(String locatia);
    List<Eveniment> findByData(LocalDate data);
}
