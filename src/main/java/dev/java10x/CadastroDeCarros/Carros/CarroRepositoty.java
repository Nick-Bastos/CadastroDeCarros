package dev.java10x.CadastroDeCarros.Carros;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepositoty extends JpaRepository <CarroModel, Long> {
}
