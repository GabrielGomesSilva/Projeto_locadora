/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal1;

/**
 *
 * @author Gabriel
 */
public class carro {
      private String nome;
    private String cor;
    private double motor;
    private String tipo;
    private int km;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    @Override
    public String toString(){
        
        return ""+this.nome+""+" "+this.motor+" "+"cor"+this.cor+""+this.tipo+"-"+this.km ;

    }
}
