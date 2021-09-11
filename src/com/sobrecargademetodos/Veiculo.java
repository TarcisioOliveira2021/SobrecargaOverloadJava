package com.sobrecargademetodos;

public abstract class Veiculo {
    public String modelo;
    public float velocidade;
    public int quantidadePassageiros;
    public float quantidadeLitros;

    public Veiculo(){
    }

    public Veiculo(String m, int p, float l) {
        this.modelo = m;
        this.quantidadePassageiros = p;
        this.quantidadeLitros = l;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public float getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public void setQuantidadeLitros(float quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public void acelerar(){
        System.out.println("Acelerar");
    }

    public void freiar(){
        System.out.println("Freiar");
    }

}
