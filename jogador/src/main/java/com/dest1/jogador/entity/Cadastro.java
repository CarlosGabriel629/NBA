package com.dest1.jogador.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Cadastro {
    @Id

    public int id;
    public String nomeDoJogador;
    public String Númerodacamisa;
    public String Posição;
    public String Time;
    public int Idade;
    public String Altura;
    public String Peso;
    public String paisdeorigem;
    public String Médiasporjogo;


    public  Cadastro(){

    }


    public Cadastro(int id, String nomeDoJogador, String númerodacamisa, String posição, String time, int idade, String altura, String peso, String paisdeorigem, String médiasporjogo) {
        this.id = id;
        this.nomeDoJogador = nomeDoJogador;
        Númerodacamisa = númerodacamisa;
        Posição = posição;
        Time = time;
        Idade = idade;
        Altura = altura;
        Peso = peso;
        this.paisdeorigem = paisdeorigem;
        Médiasporjogo = médiasporjogo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getNúmerodacamisa() {
        return Númerodacamisa;
    }

    public void setNúmerodacamisa(String númerodacamisa) {
        Númerodacamisa = númerodacamisa;
    }

    public String getPosição() {
        return Posição;
    }

    public void setPosição(String posição) {
        Posição = posição;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String altura) {
        Altura = altura;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String peso) {
        Peso = peso;
    }

    public String getPaisdeorigem() {
        return paisdeorigem;
    }

    public void setPaisdeorigem(String paisdeorigem) {
        this.paisdeorigem = paisdeorigem;
    }

    public String getMédiasporjogo() {
        return Médiasporjogo;
    }

    public void setMédiasporjogo(String médiasporjogo) {
        Médiasporjogo = médiasporjogo;
    }
}
