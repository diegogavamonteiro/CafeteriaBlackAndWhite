/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.cafeteria.cdp;

/**
 *
 * @author DIEGOGM
 */
public class Açucar extends IngredienteAbstrato {
    public Açucar(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return quantidade + " Açucar" ;
    }
}
