import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Student> sviStudenti = new ArrayList<>();
        List<Student> studentiKojiSuPolozili = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        int brojUnetihStudenata = 0;

        while (brojUnetihStudenata <= 4) {

            System.out.println("Unesite ime studenta ili 'quit' za zavrsetak:");
            String ime = scanner.nextLine();

            if (ime.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Unesite prezime studenta:");
            String prezime = scanner.nextLine();

            System.out.println("Unesite ocenu studenta:");
            int ocena = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(ime, prezime, ocena);
            sviStudenti.add(student);

            if (ocena > 5 || ocena<10) {
                studentiKojiSuPolozili.add(student);
            }
        }


        System.out.println("Svi uneti studenti:");
        for (Student student : sviStudenti) {
            System.out.println(student.ime + " " + student.prezime + ", Ocena: " + student.ocena);
        }

        System.out.println("Studenti koji su polozili: ");
        for (Student student : studentiKojiSuPolozili) {
            System.out.println(student.ime + " " + student.prezime + ", Ocena: " + student.ocena);
        }
    }
}
