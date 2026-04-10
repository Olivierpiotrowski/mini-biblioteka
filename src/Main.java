public class Main {
    public static void main(String[] args) {

        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 300, true);
        Ksiazka k2 = new Ksiazka("1984", "Orwell", 250, true);
        Ksiazka k3 = new Ksiazka("Hobbit", "Tolkien", 200, true);

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1);

        Biblioteka b = new Biblioteka(10);

        b.dodajKsiazke(k1);
        b.dodajKsiazke(k2);
        b.dodajKsiazke(k3);

        System.out.println("Dostępne książki:");
        b.wypiszDostepneKsiazki();

        System.out.println("\nWypożyczanie:");
        b.wypozyczKsiazke("1984", c1);

        System.out.println("\nPo wypożyczeniu:");
        b.wypiszDostepneKsiazki();

        System.out.println("\nZwrot:");
        b.zwrocKsiazke("1984", c1);

        System.out.println("\nPo zwrocie:");
        b.wypiszDostepneKsiazki();
    }
}