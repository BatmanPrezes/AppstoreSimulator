import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Date startDate = new Date(2020, 1, 1);
    int dayCounter = 0;
    boolean stop = false;

    int movementsPerRound = 0; //użytkownik będzie sam wybierać od 3 do 10?

    //pętla główna gry
    while (stop == false)
    {
        int answer = Menu.MainMenu();

        System.out.println(answer);

        if(answer == 1)
        {
            System.out.println("Tu będzie ustawienie graczy na 1");
        }

        else if(answer == 2)
        {
            System.out.println("Tu będzie ustawienie graczy na wybraną liczbę do 5");
        }

        else if(answer == 3)
        {
            System.out.println("Tu będzie wybór tak nie.");
            stop = true;
        }




    }

}
}
