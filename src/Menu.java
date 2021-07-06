import java.util.Scanner;

public class Menu {

    public static int MainMenu(){
        System.out.println("Witaj w Appstore - symulatorze firmy robiącej aplikacje.");
        System.out.println("Wypisz cyfrę oznaczającą, którą czynność chcesz wykonać.");
        System.out.println("1 - Rozpocznij grę jednoosobową.");
        System.out.println("2 - Rozpocznij grę wieloosobową (maks 5 graczy).");
        System.out.println("3 - Wyłącz grę.");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // closing the scanner object
        //input.close();

        return answer;

    }
}
