/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cas.pkg2;

/**
 *
 * @author MHANY
 */
public class Cas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Mecanicien Elric = new Mecanicien();
        
        Bateau LeagueOfLegends = new Bateau("1", "LoL", 8);
        Reparation Rep1 = new Reparation("1", "8 septembre 2052", LeagueOfLegends);
        
        Rep1.ajouterMecanicienPrevu(Elric);
        Rep1.ajouterMecanicienInterv(Elric, 4);
        //Rep1.supprimerMecanicienPrevu(Elric);
        //Rep1.supprimerMecanicienInterv(Elric);
        Rep1.montantMainOeuvre();
        System.out.println(Rep1.montantMainOeuvre());
        
    }
    
}
