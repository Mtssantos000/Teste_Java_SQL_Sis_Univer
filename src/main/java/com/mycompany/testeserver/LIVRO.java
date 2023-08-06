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
@Table(name="Livros")
public class LIVRO implements Serializable {
    
    @Id //TEM KEY PRIMARIA 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERAR A KEY PRIMARIA ALEATORIAMENTE 
    @Column(name= "ID")
    private int ID;
    @Column(name= "Titulo"+"Autor"+"Genero"+"Editora")
    private String TITULO,AUTOR,GENERO, EDITORA;
    @Column(name= "Quantidade")
    private int QUANT;
    @Column(name= "Preço")
    private float PRICE;

    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public void setAUTOR(String AUTOR) {
        this.AUTOR = AUTOR;
    }

    public String getGENERO() {
        return GENERO;
    }

    public void setGENERO(String GENERO) {
        this.GENERO = GENERO;
    }

    public String getEDITORA() {
        return EDITORA;
    }

    public void setEDITORA(String EDITORA) {
        this.EDITORA = EDITORA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQUANT() {
        return QUANT;
    }

    public void setQUANT(int QUANT) {
        this.QUANT = QUANT;
    }

    public float getPRICE() {
        return PRICE;
    }

    public void setPRICE(float PRICE) {
        this.PRICE = PRICE;
    }
    
    
}
