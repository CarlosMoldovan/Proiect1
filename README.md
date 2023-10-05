# Documentație

## Descriere

Acest proiect Java demonstrează utilizarea claselor și metodelor pentru gestionarea informațiilor despre sisteme solare.

## Clasa `systemsolar`

Clasa `systemsolar` reprezintă un sistem solar și conține atribute și metode pentru gestionarea informațiilor despre acest sistem.

### Atribute

- `nume`: Numele sistemului solar.
- `nrStele`: Numărul de stele din sistem.
- `nrPlanete`: Numărul de planete din sistem (privat).
- `existaFormeDeViata`: Există sau nu forme de viață în sistem (privat).

### Metode

- `public systemsolar()`: Constructorul clasei care inițializează variabilele cu valori implicite.
- `public void setNumeSistem(String nume)`: Metoda pentru a seta numele sistemului solar.
- `public void setNrStele(int nrStele)`: Metoda pentru a seta numărul de stele din sistem.
- `public void setNrPlanete(int nrPlanete)`: Metoda pentru a seta numărul de planete din sistem.
- `public void setExistaViata(boolean existaFormeDeViata)`: Metoda pentru a seta existența formelor de viață în sistem.
- `public String getNumeSistem()`: Metodă pentru a obține numele sistemului solar.
- `public int getNrStele()`: Metodă pentru a obține numărul de stele din sistem.
- `public int getNrPlanete()`: Metodă pentru a obține numărul de planete din sistem.
- `public boolean existaFormeDeViata()`: Metodă pentru a verifica dacă există forme de viață în sistem.
- `@Override public String toString()`: Suprascrierea metodei `toString()` pentru a afișa informații despre sistem sub formă de șir de caractere.

## Clasa `Main`

Clasa `Main` conține metoda `main`, care este punctul de pornire al programului și interacționează cu utilizatorul pentru a gestiona informațiile despre sistemul solar.

### Metoda `main`

Metoda `main` afișează un meniu interactiv pentru utilizator, permițându-i să introducă și să vizualizeze informații despre sistemul solar. Ea utilizează un obiect de tip `systemsolar` pentru a gestiona datele.

## Utilizare

Pentru a rula programul, compilați și executați fișierul Java `Main.java`. Urmați instrucțiunile din meniu pentru a introduce și vizualiza informații despre sistemul solar.

