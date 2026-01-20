package dev.java10x.CadastroDeCarros.Carros;

import jakarta.persistence.*;

@Entity //Transforma a class em uma entidade do banco de dados
@Table(name = "tb_cadastro") //Dando nome à tabela
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proprietario;
    private String email;
    private String modelo;
    private String placa;
    private int ano;

    public CadastroModel() {
    }

    public CadastroModel(String proprietario, String email, String modelo, String placa, int ano) {
        this.proprietario = proprietario;
        this.email = email;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
