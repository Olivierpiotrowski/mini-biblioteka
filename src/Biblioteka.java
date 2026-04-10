public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Brak miejsca w bibliotece");
        }
    }

    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);
            if (k != null && k.isDostepna()) {
                k.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
            } else {
                System.out.println("Nie można wypożyczyć książki");
            }
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);
            if (k != null && !k.isDostepna()) {
                k.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
            } else {
                System.out.println("Nie można zwrócić książki");
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int count = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                count++;
            }
        }
        return count;
    }
}