package dev.java10x.CadastroDeCarros.Serviço;

import dev.java10x.CadastroDeCarros.Carros.CarroModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_servicos")
public class ServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String limpezaBasica;

    private String limpezaCompleta;

    //OneToMany - um serviço para vários carros
    @OneToMany (mappedBy = "servico")
    private List<CarroModel> carro;
}
