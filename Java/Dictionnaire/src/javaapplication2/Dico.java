/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author MHANY
 */
public class Dico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Boolean> mesChats = new HashMap<>();
        ArrayList<String> chatsAVacciner = new ArrayList<>();

        mesChats.put("Pirate", true);
        mesChats.put("Zian", false);
        mesChats.put("Felix", true);
        mesChats.put("Mittens", true);
        mesChats.put("Whiskers", false);

        for (String nomChat : mesChats.keySet()) {
            Boolean estVaccine = mesChats.get(nomChat);
            if (estVaccine) {
                System.out.println(nomChat + " est bien vacciné.");
            } else {
                System.out.println(nomChat + " doit être vacciné.");
                chatsAVacciner.add(nomChat);
            }
        }

        System.out.println("");
        System.out.println("Les chats a vaccine sont :");

        for (String nomChatsv : chatsAVacciner) {
            System.out.println(nomChatsv);
        }
        System.out.println("");
        System.out.print("Nom du chat rechercher : ");
        Scanner sc = new Scanner(System.in);
        String nomChatr = sc.nextLine();
        if (mesChats.containsKey(nomChatr)) {
            Boolean estVaccine = mesChats.get(nomChatr);
            System.out.println(nomChatr + " est " + (estVaccine ? "bien vacciné" : "doit être vacciné"));
        } else {
            System.out.println("Le chat n'a pas été trouvé");
        }
    }

}
