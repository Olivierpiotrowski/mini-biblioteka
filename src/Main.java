public class Main {
    public static void main(String[] args) {

        Ksiazka k1 = new Ksiazka("Wiedzmin", "Sapkowski", 300, true);
        Ksiazka k2 = new Ksiazka("1984", "Orwell", 250, true);
        Ksiazka k3 = new Ksiazka("Hobbit", "Tolkien", 200, true);

        k1.wypiszInfo();
        k1.wypozycz();
        k1.wypiszInfo();
    }
}