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
public class Bateau
{
    private String codeBateau;
    private String nomBateau;
    private int tailleBateau;
    
    public Bateau(String cBateau, String nBateau, int tBateau)
    {
        codeBateau = cBateau;
        nomBateau = nBateau;
        tailleBateau = tBateau;
    }
   
    // initialise les données du bateau avec les paramètres en entrée
        public String getCodeBateau()
        {
            return codeBateau;
        }
            
        
        public String getNomBateau()
        {
            return nomBateau;
        }

        public int getTailleBateau()
        {
            return tailleBateau;
        }
}