// Clasa 'systemsolar' reprezinta un sistem solar si contine atribute si metode pentru gestionarea informatiilor despre acest sistem.

public class systemsolar{
        // Variabile de instanta pentru a stoca informatii despre sistemul solar
        String nume;
        int nrStele;
        private int nrPlanete;
        private boolean existaFormeDeViata;
    
        // Constructorul clasei care initializeaza variabilele cu valori implicite.
        public systemsolar() {
            nume = null;
            nrStele = 0;
            nrPlanete = 0;
        }
    
        // Metoda pentru a seta numele sistemului solar.
        public void setNumeSistem(String nume) {
            this.nume = nume;
        }
    
        // Metoda pentru a seta numarul de stele din sistem.
        public void setNrStele(int nrStele) {
            this.nrStele = nrStele;
        }
    
        // Metoda pentru a seta numarul de planete din sistem.
        public void setNrPlanete(int nrPlanete) {
            this.nrPlanete = nrPlanete;
        }
    
        // Metoda pentru a seta existenta formelor de viata in sistem.
        public void setExistaViata(boolean existaFormeDeViata) {
            this.existaFormeDeViata = existaFormeDeViata;
        }
    
        // Metoda pentru a obtine numele sistemului solar.
        public String getNumeSistem() {
            return nume;
        }
    
        // Metoda pentru a obtine numarul de stele din sistem.
        public int getNrStele() {
            return nrStele;
        }
    
        // Metoda pentru a obtine numarul de planete din sistem.
        public int getNrPlanete() {
            return nrPlanete;
        }
    
        // Metoda pentru a verifica daca exista forme de viata in sistem.
        public boolean existaFormeDeViata() {
            return existaFormeDeViata;
        }
    
        // Suprascrierea metodei toString() pentru a afișa informatii despre sistem sub forma de sir de caractere.
        @Override
        public String toString() {
            return "Sistemul stelar se numeste " + nume + ", are " + nrStele + " stele, si " + nrPlanete + " planete!";
        }
}