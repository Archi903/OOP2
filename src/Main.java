import transport.Automobile;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Automobile[] automobiles = {
                new Automobile("Lada", "Granta", 2021,
                        "России", "", 1.7, "", "",
                        "", 0)};
        for (Automobile value : automobiles) {
            System.out.println(value);

        }
    }
}