package ex5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Map<String, List<Integer>> filmKarakterer = new HashMap<>();
        int size = -1;

        String filename = "L14 - Lambda/src/ex5/filmKarakter.txt";
        File file = new File(filename);
        try (Scanner scanner = new Scanner(file)) {
            int count = 1;

            while (scanner.hasNextLine()) {
                if (count == 1) {
                    size = Integer.parseInt(scanner.nextLine());
                    count++;
                } else {
                    scanner.nextLine();
                }
                String filmNavn = scanner.nextLine();
                int karakter = scanner.nextInt();
                filmKarakterer.put(
                        filmNavn, filmKarakterer.getOrDefault(filmNavn, new ArrayList<>()));
                filmKarakterer.get(filmNavn).add(karakter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke fundet!");
            System.out.println(e);
        }

        filmKarakterer.forEach((film, karakterer) -> {
            int karakterantal = karakterer.size();
            int sum = 0;
            for (int k : karakterer) {
                sum += k;
            }
            double gennemsnit = (double) sum/karakterantal;

            System.out.printf("%s: %d karakterer, gennemsnit %.1f \n",
                    film, karakterantal, gennemsnit);
        });

    }

}
