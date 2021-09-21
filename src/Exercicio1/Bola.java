package Exercicio1;
/*
Classe Bola: Crie uma chamada Jabulani
1. Atributos: Cor, circunferência, material
2. Métodos: trocaCor e mostraCor
 */
public class Bola {
    String nome = "Jabulani";
    String cor;
    String circunferencia;
    String material;

    public Bola (String nome, String cor, String circunferencia, String material){
        this.nome = "Jabulani";
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }
    public void trocaCor (String novaCor) {
        cor = novaCor;
    }
    public void mostraCor () {

    }
}
