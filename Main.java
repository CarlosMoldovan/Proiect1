import java.util.Scanner;
// Clasa 'Main' contine metoda 'main' care este punctul de pornire al programului.
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect 'systemstelar1' de tip 'systemsolar' pentru gestionarea informatiilor despre sistemul solar.
        systemsolar systemstelar1 = new systemsolar();
        int meniu = 100;
        Scanner sc = new Scanner(System.in);
        // Un meniu interactiv care permite utilizatorului sa introduca si sa afiseze informatii despre sistemul solar.
        while (meniu != 0) {
            // Afisarea optiunilor disponibile in meniu.
            System.out.println("0.Iesire program!");
            System.out.println("1.Introdu numele sistemului stelar!");
            System.out.println("2.Introdu nr stele!");
            System.out.println("3.Introdu nr planete!");
            System.out.println("4.Introdu daca sunt forme de viata in acel sistem stelar(1-yes/0-not)!");
            System.out.println("5.Numele sistemului!");
            System.out.println("6.Nr stele!");
            System.out.println("7.Nr planete!");
            System.out.println("8.Exista sau nu viata in acel sistem stelar");
            System.out.println("9.Metoda toString!");
            System.out.println("Introdu o varianta:");
            
            // Citirea optiunii selectate de utilizator.
            meniu = sc.nextInt();
            sc.nextLine();

            // Un switch pentru a gestiona diferitele optiuni din meniu.
            switch (meniu) {
                case 0:
                    break;
                case 1:
                    // Utilizatorul introduce numele sistemului stelar si il setam in obiectul 'systemstelar1'.
                    String nume;
                    System.out.println("Introdu numele sistemului stelar:");
                    nume = sc.nextLine();
                    systemstelar1.setNumeSistem(nume);
                    break;
                case 2:
                    // Utilizatorul introduce numarul de stele si il setam in obiectul 'systemstelar1'.
                    int nr;
                    System.out.println("Introdu nr stele:");
                    nr = sc.nextInt();
                    sc.nextLine();
                    systemstelar1.setNrStele(nr);
                    break;
                case 3:
                    // Utilizatorul introduce numarul de planete si il setam in obiectul 'systemstelar1'.
                    int nrp;
                    System.out.println("Introdu nr planete:");
                    nrp = sc.nextInt();
                    sc.nextLine();
                    systemstelar1.setNrPlanete(nrp);
                    break;
                case 4:
                    // Utilizatorul introduce daca exista forme de viata si setam valoarea in obiectul 'systemstelar1'.
                    boolean x;
                    System.out.println("Introdu 1 sau 0:");
                    x = sc.nextBoolean();
                    sc.nextLine();
                    systemstelar1.setExistaViata(x);
                    break;
                case 5:
                    // Afisam numele sistemului solar utilizând metoda 'getNumeSistem'.
                    System.out.println("Numele sistemului este " + systemstelar1.getNumeSistem());
                    break;
                case 6:
                    // Afisam numarul de stele utilizand metoda 'getNrStele'.
                    System.out.println("Sistemului are " + systemstelar1.getNrStele() + " stele");
                    break;
                case 7:
                    // Afisam numarul de planete utilizand metoda 'getNrPlanete'.
                    System.out.println("Sistemului are " + systemstelar1.getNrPlanete() + " planete");
                    break;
                case 8:
                    // Afisam daca exista sau nu viata in sistem utilizand metoda 'existaFormeDeViata'.
                    if (systemstelar1.existaFormeDeViata()) {
                        System.out.println("Exista viata in acest sistem stelar!");
                    } else {
                        System.out.println("Nu exista viata in acest sistem stelar!");
                    }
                    break;
                case 9:
                    // Afisam informatii despre sistem folosind metoda 'toString'.
                    System.out.println(systemstelar1);
                    break;
                default:
                    // Afisam un mesaj de eroare pentru optiunea incorecta din meniu.
                    System.out.println("Optiune gresita");
                    break;
            }
        }
        sc.close();
    }
}
