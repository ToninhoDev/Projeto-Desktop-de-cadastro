/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Toninho Programação
 */
public class Clientes {
    
    private String nome;
    private int cpf;
    private String rg;
    private String tel;
    private String end;
    private String familiares;

    public Clientes() {
    }

    public Clientes(String nome, int cpf, String rg, String tel, String end, String familiares) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.end = end;
        this.familiares = familiares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getFamiliares() {
        return familiares;
    }

    public void setFamiliares(String familiares) {
        this.familiares = familiares;
    }

    @Override
    public String toString() {
        return "Clientes: " + "NOME=" + nome + ", CPF=" + cpf + ", RG=" + rg + ", TEL=" + tel + ", END=" + end + ", FAMILIARES=" + familiares+ "\n";
    }
    
    
    
}
