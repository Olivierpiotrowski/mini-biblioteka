public class Main {
    public static void main(String[] args) {

        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 300, true);
        Ksiazka k2 = new Ksiazka("1984", "Orwell", 250, true);
        Ksiazka k3 = new Ksiazka("Hobbit", "Tolkien", 200, true);

        k1.wypiszInfo();
        k1.wypozycz();
        k1.wypiszInfo();

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1);
        Czytelnik c2 = new Czytelnik("Anna", "Nowak", 2);

        c1.wypiszDane();
        c2.wypiszDane();

        Biblioteka b = new Biblioteka(10);

        b.dodajKsiazke(k1);
        b.dodajKsiazke(k2);
        b.dodajKsiazke(k3);

        b.wypiszDostepneKsiazki();
    }
}