import java.util.Scanner;
// Clasa 'Main' conține metoda 'main' care este punctul de pornire al programului.
public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect 'systemstelar1' de tip 'systemsolar' pentru gestionarea informațiilor despre sistemul solar.
        systemsolar systemstelar1 = new systemsolar();
        int meniu = 100;
        Scanner sc = new Scanner(System.in);
        // Un meniu interactiv care permite utilizatorului să introducă și să afișeze informații despre sistemul solar.
        while (meniu != 0) {
            // Afișarea opțiunilor disponibile în meniu.
            System.out.println("0.Iesire program!");
            System.out.println("1.Introdu numele sistemului stelar!");
            System.out.println("2.Introdu nr stele!");
            System.out.println("3.Introdu nr planete!");
            System.out.println("4.Introdu dacă sunt forme de viață în acel sistem stelar(1-yes/0-not)!");
            System.out.println("5.Numele sistemului!");
            System.out.println("6.Nr stele!");
            System.out.println("7.Nr planete!");
            System.out.println("8.Există sau nu viață în acel sistem stelar");
            System.out.println("9.Metoda toString!");
            System.out.println("Introdu o variantă:");
            
            // Citirea opțiunii selectate de utilizator.
            meniu = sc.nextInt();
            sc.nextLine();

            // Un switch pentru a gestiona diferitele opțiuni din meniu.
            switch (meniu) {
                case 0:
                    break;
                case 1:
                    // Utilizatorul introduce numele sistemului stelar și îl setăm în obiectul 'systemstelar1'.
                    String nume;
                    System.out.println("Introdu numele sistemului stelar:");
                    nume = sc.nextLine();
                    systemstelar1.setNumeSistem(nume);
                    break;
                case 2:
                    // Utilizatorul introduce numărul de stele și îl setăm în obiectul 'systemstelar1'.
                    int nr;
                    System.out.println("Introdu nr stele:");
                    nr = sc.nextInt();
                    sc.nextLine();
                    systemstelar1.setNrStele(nr);
                    break;
                case 3:
                    // Utilizatorul introduce numărul de planete și îl setăm în obiectul 'systemstelar1'.
                    int nrp;
                    System.out.println("Introdu nr planete:");
                    nrp = sc.nextInt();
                    sc.nextLine();
                    systemstelar1.setNrPlanete(nrp);
                    break;
                case 4:
                    // Utilizatorul introduce dacă există forme de viață și setăm valoarea în obiectul 'systemstelar1'.
                    boolean x;
                    System.out.println("Introdu 1 sau 0:");
                    x = sc.nextBoolean();
                    sc.nextLine();
                    systemstelar1.setExistaViata(x);
                    break;
                case 5:
                    // Afișăm numele sistemului solar utilizând metoda 'getNumeSistem'.
                    System.out.println("Numele sistemului este " + systemstelar1.getNumeSistem());
                    break;
                case 6:
                    // Afișăm numărul de stele utilizând metoda 'getNrStele'.
                    System.out.println("Sistemului are " + systemstelar1.getNrStele() + " stele");
                    break;
                case 7:
                    // Afișăm numărul de planete utilizând metoda 'getNrPlanete'.
                    System.out.println("Sistemului are " + systemstelar1.getNrPlanete() + " planete");
                    break;
                case 8:
                    // Afișăm dacă există sau nu viață în sistem utilizând metoda 'existaFormeDeViata'.
                    if (systemstelar1.existaFormeDeViata()) {
                        System.out.println("Există viață în acest sistem stelar!");
                    } else {
                        System.out.println("Nu există viață în acest sistem stelar!");
                    }
                    break;
                case 9:
                    // Afișăm informații despre sistem folosind metoda 'toString'.
                    System.out.println(systemstelar1);
                    break;
                default:
                    // Afișăm un mesaj de eroare pentru opțiunea incorectă din meniu.
                    System.out.println("Opțiune greșită");
                    break;
            }
        }
        sc.close();
    }
}
