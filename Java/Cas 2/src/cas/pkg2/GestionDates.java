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
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GestionDates
{

// On supposera que la date du jour est 17/12/2022


// méthode retournant la date courante, ici 17/12/2022
public static String getDateCourante()
{
 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
 Date date = new Date();
 return format.format(date);
}
// méthode retournant le jour courant, ici 17
public static int getJourCourant()
{
 GregorianCalendar aujourdhui = new GregorianCalendar();
 int jCourant = aujourdhui.get(GregorianCalendar.DAY_OF_MONTH);
 return jCourant;
}

// méthode retournant le mois courant, ici 12
public static int getMoisCourant()
{
 GregorianCalendar aujourdhui = new GregorianCalendar();
 int mCourant = aujourdhui.get(GregorianCalendar.MONTH)+1;
 return mCourant;
}

// méthode retournant l'année courante, ici 2022
public static int getAnCourant()
{
 GregorianCalendar aujourdhui = new GregorianCalendar();
//Programmation objet en Java Stéphane ADALIZ 205
 int aCourant = aujourdhui.get(GregorianCalendar.YEAR);
 return aCourant;
}

}

