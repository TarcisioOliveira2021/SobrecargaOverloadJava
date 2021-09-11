package com.sobrecargademetodos;

public class Carro extends Veiculo{
    private int marcha;

    public Carro (){
    }

    public Carro(String m, float v, int p, float l) {
        super(m, p, l);
    }

    public void setVelocidade (float v){
        velocidade = v;

        if( velocidade > 20 && velocidade <40){
            marcha = 2;
        }
        if ( velocidade < 20){
            marcha = 1;
        }
        if ( velocidade > 40 && velocidade > 60){
            marcha = 3;
        }
        if ( velocidade > 60 && velocidade > 80){
            marcha = 4;
        }
        if (velocidade > 70){
            marcha = 5;
        }
    }

    public void acelerar(){
        setVelocidade(getVelocidade()+2.f);
    }

    public void freiar (){
        setVelocidade(getVelocidade()-2.f);
    }

    public static void main(String[] args) {
        Carro corsa = new Carro("Hatch",0,2,50.f);
        //Carro audi = new Carro();
        int x,y = 10;

        System.out.println("Modelo: "+corsa.modelo
                        +", Quantidade de passageiros: "+corsa.quantidadePassageiros
                        +", Tanque de combustivel: "+corsa.quantidadeLitros
                        +"\n");
        System.out.println("Acelerando o carro \n");

        //acelerando o carro
        for (x=0;x<=10;x++){
            corsa.acelerar();
            System.out.println("Marcha: "+corsa.marcha
                              +" Velocidade: "+corsa.getVelocidade());
        }

        System.out.println("\n Freiando o carro \n");
        while(y!=0){
            corsa.freiar();
            System.out.println("Marcha: "+corsa.marcha
                    +" Velocidade: "+corsa.getVelocidade());
            y--;
        }
    }

}
