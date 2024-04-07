package com.example.controllerqueryparameter;

public class User {

    public User(String nome, String regione, String saluto){
        this.nome = nome;
        this.regione = regione;
        this.saluto = saluto;
    }

    public String nome;
    public String regione;
    public String saluto;

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", regione='" + regione + '\'' +
                ", saluto='" + saluto + '\'' +
                '}';
    }
}
