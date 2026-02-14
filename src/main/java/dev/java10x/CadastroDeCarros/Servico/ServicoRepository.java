package dev.java10x.CadastroDeCarros.Servico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository <ServicosModel, Long> {
}
