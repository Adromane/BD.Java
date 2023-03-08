package sn.ucao.jdbc.services.Classe;

import sn.ucao.jdbc.entities.Etudiant;
import sn.ucao.jdbc.services.EtudiantImpl;
import sn.ucao.jdbc.services.IEtudiant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Etudiant etudiant = new Etudiant();
        IEtudiant service = new EtudiantImpl();
        List<Etudiant> etudiantList = new ArrayList<>();

        etudiantList.add(new Etudiant(1, "Gueye", "fama", 34, "779876765", "pikine"));
        etudiantList.add(new Etudiant(1, "mbaye", "ibou", 34, "779876765", "KM"));
        etudiantList.add(new Etudiant(1, "Cissé", "matar", 34, "779876756", "yarakh"));
        etudiantList.add(new Etudiant(1, "Sylva", "Daniel", 34, "779899999", "Hann"));
        System.out.println();


        System.out.println("donner votre nom");
        String nom = scanner.next();
        etudiant.setNom(nom);

        System.out.println("donner votre prenom");
        System.out.println("donner votre age");
        int age = scanner.nextInt();
        etudiant.setAge(age);

        System.out.println("donner votre telephone");
        String tel = scanner.next();
        etudiant.setTelephone(tel);

        System.out.println("donner votre adress");
        String adresse = scanner.next();
        etudiant.setAdresse(adresse);

        /*System.out.println("donner le nom que vous voulez modifier");
        String nom = scanner.next();
        etudiant.setNom(nom);

        boolean updated = service.UpdateStudentbyName(nom,1);
        if (updated) {
            System.out.println("Etudiant modifié avec suces!");
        }else {
            System.out.println("une erreur est survenue!");
        }*/

        boolean saved = service.updateStudentbyName(etudiant);
        if (saved) {
            System.out.println("Etudiant enregistré avec suces!");
        } else {
            System.out.println("Une erreur est survenue!");

        }
    }

    }

