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
public interface Cafe {
    
   public float getValor();
   public void setValor(float valor);
   public ArrayList<Ingrediente> getIngredientes();
   public void setIngredientes(ArrayList<Ingrediente> ingredientes);
   public void imprimeIngredientes(ArrayList<Ingrediente> ingredientes);

}
