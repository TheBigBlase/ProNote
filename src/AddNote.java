package src;

import java.util.*;

public class AddNote {
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
        List<Eleve> idu_groupe_A1 = idu3A1.getStudents();

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

        UE ue1 = new UE("ue704");
        idu4.addSemestre(new Semestre("S7"));
        idu4.getSemestres().get(0).addUE(ue1);

        Module isoc = new Module("ISOC", null);
        ue1.addModule(isoc);
        Examen examen = new Examen("ISOC731", "Controle de cours", 0.8, null);
        isoc.addDevoir(examen);

        Scolarite.getInstance().addFiliere(idu);


        HashMap<Devoir, Annee> devoirsAnnee = Scolarite.getInstance().getDevoirs();
        Set<Devoir> devoirsSet = devoirsAnnee.keySet();
        ArrayList<Devoir> devoirs = new ArrayList<>(devoirsSet);
        System.out.println("Quel devoir voulez vous corriger ? (entrez un nombre) ");

        for(Devoir d : devoirs){
            System.out.println(d);
        }
        Scanner sc = new Scanner(System.in);

        String nStr = sc.nextLine();
        Integer n = Integer.parseInt(nStr);

        Devoir devoir = devoirs.get(n);

        List<Eleve> eleves = Scolarite.getInstance().getStudents(devoirsAnnee.get(devoir));
        HashMap<Eleve, Double> eleveNote = new HashMap<>();
        for(Eleve e : eleves){
            System.out.println( "Entrez la note pour : " + e.getNom() + " " + e.getPrenom());
            String noteStr = sc.nextLine();
            Double note = Double.parseDouble(noteStr);
            eleveNote.put(e, note);
        }

        Scolarite.getInstance().addNotes(eleveNote, devoir);
        System.out.println(examen.getMoyenne());
    }
}
