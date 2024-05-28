/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cas.pkg2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MHANY
 */
public class Reparation
{
    private String numeroReparation;
    private String dateReparation;
    private Bateau bateauReparation;
    
    private ArrayList <Mecanicien> listeMecanicien = new ArrayList();
    private HashMap <Mecanicien, Integer> dicNbreJours = new HashMap();
    
    public Reparation(String nReparation, String dReparation, Bateau bReparation)
    {
        numeroReparation = nReparation;
        dateReparation = dReparation;
        bateauReparation = bReparation;
    }
    // initialise les données de la réparation, sauf les deux ensembles
    
    public void afficherReparation()
    {
        System.out.println("Numéro de reparation : " + numeroReparation);
        System.out.println("Date de reparation : " + dateReparation);
        System.out.println("Bateaut Reparation : " + bateauReparation);
        System.out.println("Code Bateau" + bateauReparation.getCodeBateau());
        System.out.println("Nom du bateau" + bateauReparation.getNomBateau());
        System.out.println("Taille du bateau :" + bateauReparation.getTailleBateau());
        
        for (Mecanicien unMecano : listeMecanicien)
        {
            System.out.println(unMecano.getPrenomMecan());
            System.out.println(unMecano.getNomMecan());
            System.out.println(unMecano.getCodeMecan());
            System.out.println(unMecano.getCategMecan().getDescriptionQualif());
            if (dicNbreJours.get(unMecano)==null)
            {
                System.out.println("Le mécanicien ne participe pas a la réparation");
            }
            else
            {
                System.out.println("Le mécanicien a bien participer a la réparation");
                System.out.println(dicNbreJours.get(unMecano));
            }
        }
    }
    
    public void ajouterMecanicienPrevu(Mecanicien mecano)
    {
        if (!this.listeMecanicien.contains(mecano))
        {
            this.listeMecanicien.add(mecano);
            System.out.println("Réussi");
        }
        
    }
    
    public void ajouterMecanicienInterv(Mecanicien mecano, int nJours)
    {
        if (this.listeMecanicien.contains(mecano))
        {
            this.dicNbreJours.put(mecano, nJours);
             System.out.println("Réussi");
             System.out.println(mecano.getNomMecan() + " travail pour un total de " + nJours + " jours.");
        }
    }
    public void supprimerMecanicienPrevu(Mecanicien mecano)
    {
        if (!this.dicNbreJours.containsKey(mecano))
        {
            this.listeMecanicien.remove(mecano);
             System.out.println("Réussi");
        }
    }
    
    public void supprimerMecanicienInterv(Mecanicien mecano)
    {
     if (this.dicNbreJours.containsKey(mecano))
        {
            this.dicNbreJours.remove(mecano);
             System.out.println("Réussi");
        }
    }
    public double montantMainOeuvre()
    {
        double Prixt = 0;
        
        for (Mecanicien mecano : this.dicNbreJours.keySet())
        {
            int heure = dicNbreJours.get(mecano) * 8;
            double PrixH = mecano.coutHoraire();
            
            Prixt += heure * PrixH;
        }
        
        if (this.bateauReparation.getTailleBateau()>7)
        {
            Prixt *= 1.02;
        }
        else if (this.bateauReparation.getTailleBateau()>12)
        {
            Prixt *= 1.03;
        }
        return Prixt;
    }
}
        