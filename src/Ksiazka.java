public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println(tytul + " - " + autor + " (" + liczbaStron + " stron) " +
                (dostepna ? "Dostępna" : "Wypożyczona"));
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Książka niedostępna");
        }
    }

    public void zwroc() {
        dostepna = true;
        System.out.println("Zwrócono: " + tytul);
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}