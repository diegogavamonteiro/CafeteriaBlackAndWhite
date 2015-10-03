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
public class Capuccino extends CafeAbstrato{
    public Capuccino(ArrayList<Ingrediente> ingredientes){
        this.valor = 5;
        this.ingredientes = ingredientes;
    }
}
