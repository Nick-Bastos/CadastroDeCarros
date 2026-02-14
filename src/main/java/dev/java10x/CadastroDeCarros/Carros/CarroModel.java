package dev.java10x.CadastroDeCarros.Carros;

import dev.java10x.CadastroDeCarros.Servico.ServicosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carros")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(unique = true)
    private String placa;

    @ManyToOne   //Um carro para um serviço
    @JoinColumn(name = "servicos_id") //foreing key (juntando as colunas servicos e carros)
    private ServicosModel servico;

}
