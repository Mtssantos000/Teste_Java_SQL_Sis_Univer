/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeserver;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author mtssa
 */
@Entity
@Table(name="Alunos")//Gerar o nome da tabela
public class ALUNO implements Serializable {
    
    @Id //TEM KEY PRIMARIA 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERAR A KEY PRIMARIA ALEATORIAMENTE 
    @Column(name= "Matricula")
    private int MATRICULA;
    @Column(name= "Cpf"+"Rg"+ "Data de nascimento")
    private int CPF, RG, DN;
    @Column(name= "Nome"+"Endereço"+ "Bairro")
    private String NOME, END, CIDADE, BAIRRO;
    private boolean BOLSISTA = false;

    
    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getMATRICULA() {
        return MATRICULA;
    }

    public void setMATRICULA(int MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getDN() {
        return DN;
    }

    public void setDN(int DN) {
        this.DN = DN;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getEND() {
        return END;
    }

    public void setEND(String END) {
        this.END = END;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public boolean isBOLSISTA() {
        return BOLSISTA;
    }

    public void setBOLSISTA(boolean BOLSISTA) {
        this.BOLSISTA = BOLSISTA;
    }
    
    

}
