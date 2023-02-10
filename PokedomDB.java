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
    private Pokedom listaPokedoms[] = new listaPokedoms[100];
    private int i = 0;
    
    // función que a partir del nombre devuelve un Pokedom
    // Si no existe devuelve null!!!!!!!!!!!!!!
    public Pokedom describe(String nom) {
        for (int i = 0; i < listaPokedoms.length; i++) {
            if (nom.equalsIgnoreCase(listaPokedoms[i].getNom())) {
                return listaPokedoms[i];
            }
        }
        return null;
    }
    public void insert (Pokedom unPokedom) {
        listaPokedoms[i++] = unPokedom;
    }
    
}
