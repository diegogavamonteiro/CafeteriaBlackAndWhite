/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.cdp;

import java.util.ArrayList;

/**
 *
 * @author DIEGOGM
 */
public abstract class CafeAbstrato implements Cafe{
    protected float valor;
    protected  ArrayList<Ingrediente> ingredientes;
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void imprimeIngredientes(ArrayList<Ingrediente> ingredientes){
       for(Ingrediente ingrediente : ingredientes){
           System.out.println(ingrediente);
       } 
       
    }
}
