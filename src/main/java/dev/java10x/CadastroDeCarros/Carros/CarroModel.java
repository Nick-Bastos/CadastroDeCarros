package dev.java10x.CadastroDeCarros.Carros;

import dev.java10x.CadastroDeCarros.Serviço.ServicosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carros")
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;

    @ManyToOne   //Um carro para um serviço
    @JoinColumn(name = "servicos_id") //foreing key (juntando as colunas servicos e carros)
    private ServicosModel servico;


    public CarroModel() {
    }

    public CarroModel(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
