// Clasa 'systemsolar' reprezintă un sistem solar și conține atribute și metode pentru gestionarea informațiilor despre acest sistem.

public class systemsolar{
        // Variabile de instanță pentru a stoca informații despre sistemul solar
        String nume;
        int nrStele;
        private int nrPlanete;
        private boolean existaFormeDeViata;
    
        // Constructorul clasei care inițializează variabilele cu valori implicite.
        public systemsolar() {
            nume = null;
            nrStele = 0;
            nrPlanete = 0;
        }
    
        // Metoda pentru a seta numele sistemului solar.
        public void setNumeSistem(String nume) {
            this.nume = nume;
        }
    
        // Metoda pentru a seta numărul de stele din sistem.
        public void setNrStele(int nrStele) {
            this.nrStele = nrStele;
        }
    
        // Metoda pentru a seta numărul de planete din sistem.
        public void setNrPlanete(int nrPlanete) {
            this.nrPlanete = nrPlanete;
        }
    
        // Metoda pentru a seta existența formelor de viață în sistem.
        public void setExistaViata(boolean existaFormeDeViata) {
            this.existaFormeDeViata = existaFormeDeViata;
        }
    
        // Metodă pentru a obține numele sistemului solar.
        public String getNumeSistem() {
            return nume;
        }
    
        // Metodă pentru a obține numărul de stele din sistem.
        public int getNrStele() {
            return nrStele;
        }
    
        // Metodă pentru a obține numărul de planete din sistem.
        public int getNrPlanete() {
            return nrPlanete;
        }
    
        // Metodă pentru a verifica dacă există forme de viață în sistem.
        public boolean existaFormeDeViata() {
            return existaFormeDeViata;
        }
    
        // Suprascrierea metodei toString() pentru a afișa informații despre sistem sub formă de șir de caractere.
        @Override
        public String toString() {
            return "Sistemul stelar se numește " + nume + ", are " + nrStele + " stele, și " + nrPlanete + " planete!";
        }
}