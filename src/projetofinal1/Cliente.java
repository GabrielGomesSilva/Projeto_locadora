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
public class Cliente {
     public String nome;
    private String endereco;
    private String telefone;
    public int idade;
    private float RG;
    private float CPF;
    private carro carroalugado;
    public double dataalug;
    public double datadev;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getRG() {
        return RG;
    }

    public void setRG(float RG) {
        this.RG = RG;
    }

    public float getCPF() {
        return CPF;
    }

    public void setCPF(float CPF) {
        this.CPF = CPF;
    }

    public carro getCarroalugado() {
        return carroalugado;
    }

    public void setCarroalugado(carro carroalugado) {
        this.carroalugado = carroalugado;
    }

    public double getDataalug() {
        return dataalug;
    }

    public void setdataalug(double dataalug) {
        this.dataalug = dataalug;
    }

    public double getdatadev() {
        return datadev;
    }

    public void setDatadev(double datadev) {
        this.datadev = datadev;
    }

  
    @Override  
    public String toString(){
        
        return "Nome:"+this.nome+"\n"+"Idade:"+this.idade+"\n"+"Carro alugado:"+this.carroalugado;

}
}
