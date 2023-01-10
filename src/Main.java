package src;

public class Main {
    public static void main(String[] args) {
        Filiere idu = new Filiere("IDU");
        Annee idu3 = new Annee("3");
        TD idu3A = new TD("A");
        TP idu3A1 = new TP("1");
        TP idu3A2 = new TP("1");

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

        System.out.println(idu.getStudents());
        System.out.println(idu3A1.getStudents());
    }
}
