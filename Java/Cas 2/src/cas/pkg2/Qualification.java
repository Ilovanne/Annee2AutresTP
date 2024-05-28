/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cas.pkg2;

import java.util.Scanner;

/**
 *
 * @author MHANY
 */
public class Qualification {
    // attributs
    private int indQualif;
    private String descriptionQualif;
    // méthodes
public Qualification() // initialise les données de la qualification
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Indice qualification : ");
    indQualif = sc.nextInt();
    sc.nextLine();
    System.out.println("Description qualification : ");
    descriptionQualif = sc.nextLine();
}

    
public String getDescriptionQualif(){

    String desc = descriptionQualif;
    return desc;
    // ou juste return descriptionQualif;
}
public double prixHoraire(){
  
    if(indQualif <= 4)
        return 8.03;
    
    if(indQualif <= 9)
        return 8.54;
    
    if(indQualif <= 15)
        return 8.67;
    
    if(indQualif <= 19)
        return 8.92;
    
    if(indQualif <= 19)
        return 9.17;
            
    /* définit le prix horaire en fonction de l'indice : voir le tableau ci-après pour le
     calcul */
    return 0;
}
}
