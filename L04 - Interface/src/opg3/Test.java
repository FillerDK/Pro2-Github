package opg3;

public class Test {
    public static void main(String[] args) {
        Indkøbskurv ik1 = new Indkøbskurv();

        // Taget fra REMA 1000
        Fødevare citron = new Fødevare(4.00, "Citron Sydafrika kl. 1",
                "Frugten er overfladebeh.", 30);
        Fødevare banan = new Fødevare(2.50, "Banan", "Gul", 6);
        Fødevare hakketSvinekød = new Fødevare(25.00, "Hk. grisekød 8-12%", "500g", 1);

        // Elforbrug: https://elberegner.dk/sluk-stroemslugerne/opvaskemaskine/
        ElArtikel opvaskemaskine = new ElArtikel(2444, "Opvaskemaskine", "Electrolux", 0.40);
        ElArtikel elkedel = new ElArtikel(299.95, "Elkedel", "Wilfa", 0.84);
        ElArtikel mikrobølgeovn = new ElArtikel(699, "Mikrobølgeovn", "Logik", 0.90);

        // Taget fra Fleggard
        Spiritus baileys = new Spiritus(99.00, "Baileys 1L", "Sød i smagen", 17);
        Spiritus pinaColada = new Spiritus(33.00, "RTD Pina Colada 0,7L",
                "Frugtagtig smag af ananas", 15);
        Spiritus highlandPark = new Spiritus(899.99, "HighLand Park 18 YO 0,7L",
                "Overraskende kragtig\n" +
                        "\t\t\t\t\trøget smag af tilsat\n" +
                        "\t\t\t\t\tnoter fra sherry og eg.", 43);

        ik1.addToBasket(citron);
        ik1.addToBasket(banan);
        ik1.addToBasket(hakketSvinekød);
        ik1.addToBasket(opvaskemaskine);
        ik1.addToBasket(elkedel);
        ik1.addToBasket(mikrobølgeovn);
        ik1.addToBasket(baileys);
        ik1.addToBasket(pinaColada);
        ik1.addToBasket(highlandPark);

        ik1.printReceipt();
    }
}
