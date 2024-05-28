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
public class Mecanicien {
    private int codeMecan;
    private String nomMecan;
    private String prenomMecan;
    private int anEmbMecan; // année d'embauche
    private Qualification categMecan; /* qualification du salarié
     mécanicien */
    // méthodes
    private int nbreAns()
    {
        int anneeCourante = GestionDates.getAnCourant() - anEmbMecan;
    // méthode renvoyant le nombre d'années de service du mécanicien
        return anneeCourante;
    }
    
public Mecanicien() // initialise les données du mécanicien
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Code mecanicien : ");
    codeMecan = sc.nextInt();
    sc.nextLine();
    System.out.println("Nom mecanicien : ");
    nomMecan = sc.nextLine();
    System.out.println("Prenom mecanicien : ");
    prenomMecan = sc.nextLine();
    System.out.println("Annee embauche mecanicien : ");
    anEmbMecan = sc.nextInt();
    System.out.println("Qualification mecanicien : ");
    categMecan = new Qualification();
}
public double coutHoraire()
{
    double ch = categMecan.prixHoraire();
    
    if(anEmbMecan >= 10)
        return ch * 1.2;
    else
    {
        if(anEmbMecan >= 5)
            return ch * 1.1;
    }
    
    return 0;
/* le coût horaire du mécanicien est égal à son prix horaire majoré de 20 % s'il est
 dans l'entreprise depuis au moins 10 ans et de 10 % s'il est là depuis plus de 5 ans
*/
}
public void afficher()
{
    System.out.println("Code mecanicien : " + codeMecan);
    System.out.println("Nom mecanicien : " + nomMecan);
    System.out.println("prenomMecan : " + prenomMecan);
    System.out.println("Cout horaire : " + coutHoraire());
// affiche le code, le nom, le prénom et le coût horaire
}
public boolean estAncien()
{
    return nbreAns() > 10; // Met True si c'est juste
    
/* indique si le salarié est ancien (il est dans l'entreprise depuis plus de 10 ans)
 ou non ; on n'utilisera pas les données de la classe
 on optimisera le code sans l'aide de l'IDE, par exemple NetBeans (facultatif) */
}
public int getCodeMecan()
{
    return codeMecan;
}
public String getNomMecan()
{
    return nomMecan;
}
public String getPrenomMecan()
{
    return prenomMecan;
}
public Qualification getCategMecan()
{
    return categMecan;
}
}