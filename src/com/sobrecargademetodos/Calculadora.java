package com.sobrecargademetodos;

public class Calculadora {
    private int custo;
    private String marca;


    //Exemplo de sobrecarga de construtores
    public Calculadora(){

    }

    public Calculadora(int custo){

    }

    public Calculadora(int custo, String marca) {
        this.custo = custo;
        this.marca = marca;
    }

    //Exemplo de sobrecarga de métodos.
    public int calcular ( int x , int y){
        return x+y;
    }
    public double calcular (double x , double y ){
        return x+y;
    }
    public int calcular(int x , int y , int a){return x+y-a;}
    public String calcular ( String x , String y){
        return x+y;
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        System.out.println(cal.calcular(1,2));
        System.out.println(cal.calcular("Tes","te"));
        System.out.println(cal.calcular(1.2,1.5));
        System.out.println(cal.calcular(1,4,8));
    }

}
