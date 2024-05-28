/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cas.pkg1;

import java.util.ArrayList;

/**
 *
 * @author ebeaujot
 */
public class Cas_1 {
    
     //5) Ecrire une procédure générale affichant le code et le nom du mécanicien qui coûte le
        //plus cher dans un ensemble de mécaniciens implémenté sous forme de collection.
        //Pour toute boucle, on utilisera un for each.
        //L'en-tête de cette procédure est :
        //public static void plusCherMecano
            //(ArrayList <Mecanicien> ensMecanos)
    
     public static void plusChersMecano(ArrayList <Mecanicien> ensMecanos)
    {

        Mecanicien pcMeca = ensMecanos.get(0);
        
        for (Mecanicien mecanicien : ensMecanos)
        {
            if (mecanicien.coutHoraire()<pcMeca.coutHoraire())
                 pcMeca= mecanicien;
        }
        System.out.println("Code mecano le plus cher :" + pcMeca.getCodeMecan());
        System.out.println("Nom mecnao le plus cher :" + pcMeca.getNomMecan());
        
        
    }
     
    public static ArrayList <Mecanicien> mecanosQualificatio (ArrayList <Mecanicien> ensMecanos, String uneDescription)
    {
        ArrayList <Mecanicien> desMecanos = new ArrayList();
        
        for (Mecanicien unMecanicien : ensMecanos)
        {
            if (unMecanicien.getCategMecan().getDescriptionQualif().equals(uneDescription))
            {
                desMecanos.add(unMecanicien);
            }
        }
        return desMecanos;
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // afficher la date du jour de ce rapport de test
        System.out.println(GestionDates.getDateCourante()); 
        
        //déclarer un objet meca1 de classe Mecanicien et alimenter ses attributs
        Mecanicien Meca1 = new Mecanicien();
       // Mecanicien unMeca1 = new Mecanicien(1, "Max", "Verstappen", 2016);
       
       //afficher le code, le nom, le prénom et le coût horaire de ce mécanicien
        System.out.println("Le code : " + Meca1.getCodeMecan());
        System.out.println("Le nom : " + Meca1.getNomMecan());
        System.out.println("Le prenom : " + Meca1.getPrenomMecan());
        System.out.println("Le cout horaire : " + Meca1.coutHoraire());
        
        //mettre un message indiquant si le mécanicien est ancien ou pas en rappelant son prénom et son nom
        if(Meca1.estAncien())
        {
            System.out.println(Meca1.getPrenomMecan() + Meca1.getNomMecan() + " est un ancien");
        }
        else
        {
            System.out.println(Meca1.getPrenomMecan() + Meca1.getNomMecan() + " n'est pas un ancien");
        }
        
        //afficher sa qualification (description)
        System.out.println(Meca1.getCategMecan().getDescriptionQualif().toUpperCase());
        
        //Peut-on retrouver le nombre d'années de travail de l'employé dans un programme principal ?
        //Non il n'y à pas de méthode qui vas l'afficher 
        
        //Sinon, que faudrait-il changer dans l'interface de la classe ?
        //Faut mettre la méthode en public
        
        // Création de la liste Mecanicien du nom ensMecanos
        ArrayList <Mecanicien> listeMecanos = new ArrayList();
        //Atribution du Maca1 a la liste
        listeMecanos.add(new Mecanicien());
        listeMecanos.add(new Mecanicien());
        listeMecanos.add(new Mecanicien());
        mecanosQualificatio(listeMecanos, "test");
        
        Bateau unBateau = new Bateau("B1", "Elric", 100);
        
        
        
        
    }  
    
    
   
    
    
}
