/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestorpokedom;

/**
 *
 * @author usuari
 */
public class PokedomDB {
    Pokedom[] llista = new Pokedom[100];
    
    // función que a partir del nombre devuelve un Pokedom
    // Si no existe devuelve null!!!!!!!!!!!!!!
    public Pokedom describe(String nom) {
        for (int i = 0; i < llista.length; i++) {
            if (nom.equalsIgnoreCase(llista[i].getNom())) {
                return llista[i];
            }
        }
        return null;
    }
    public Pokedom addPokedom(pokedom) {
        
    }
}
