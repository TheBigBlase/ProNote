package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filiere idu = new Filiere("IDU");
        Annee idu3 = new Annee("3");
        TD idu3A = new TD("A");
        TP idu3A1 = new TP("1");
        TP idu3A2 = new TP("2");

        idu.addChild(idu3);
        idu3.addChild(idu3A);
        idu3A.addChild(idu3A1);
        idu3A.addChild(idu3A2);

        Eleve eleve = new Eleve("Durif", "Sylvain");
        Eleve eleve1 = new Eleve("Menes", "Pierre");
        Eleve eleve2 = new Eleve("Soral", "Alain");
        Eleve eleve3 = new Eleve("Melechon", "Jean-Luc");
        Eleve eleve4 = new Eleve("Salamatian", "Kv");

        idu3A1.addChild(eleve);
        idu3A1.addChild(eleve1);
        idu3A1.addChild(eleve2);

        idu3A2.addChild(eleve3);
        idu3A2.addChild(eleve4);

        List<Eleve> all_idu = idu.getStudents();

        System.out.println("Tout les eleves d'idu");

        for (Eleve el: all_idu
             ) {
            System.out.println(el);
        }

        List<Eleve> idu_groupe_A1 = idu3A1.getStudents();

        System.out.println("Tout les eleves d'idu3A1");
        for (Eleve el: idu_groupe_A1
        ) {
            System.out.println(el);
        }


        Annee idu4 = new Annee("4");

        try {
            idu3A1.addChild(idu4);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        idu.addChild(idu4);
        TD idu4A = new TD("A");
        TP idu4A1 = new TP("1");
        TP idu4A2 = new TP("2");

        Eleve eleveIDU4 = new Eleve("Paulin", "Maxime");
        Eleve eleve1IDU4 = new Eleve("Richard", "Valentin");
        Eleve eleve2IDU4 = new Eleve("Riss", "Ryan");
        Eleve eleve3IDU4 = new Eleve("Pruvost", "Jordan");
        Eleve eleve4IDU4 = new Eleve("Takahashi", "Vincent");

        idu4.addChild(idu4A);
        idu4A.addChild(idu4A1);
        idu4A.addChild(idu4A2);

        idu4A1.addChild(eleveIDU4);
        idu4A1.addChild(eleve1IDU4);
        idu4A1.addChild(eleve2IDU4);
        idu4A2.addChild(eleve3IDU4);
        idu4A2.addChild(eleve4IDU4);

        all_idu = idu.getStudents();

        System.out.println("Tout les eleves d'idu");

        for (Eleve el: all_idu
        ) {
            System.out.println(el);
        }
    }
}
