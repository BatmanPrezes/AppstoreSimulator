import java.util.Scanner;
import java.util.InputMismatchException;

//ujednolicić return po exeption z mismatch -> ma wracać za każdym razem do wyboru poprzedzającego go
//jedna wartość dla wszystkich metod

public class Menu {

    public static int MainMenu(){
        System.out.println("Witaj w Appstore - symulatorze firmy robiącej aplikacje.");
        System.out.println("Wypisz cyfrę oznaczającą, którą czynność chcesz wykonać.");
        System.out.println("1 - Rozpocznij grę jednoosobową.");
        System.out.println("2 - Rozpocznij grę wieloosobową (maks 5 graczy).");
        System.out.println("3 - Wyłącz grę.");


        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            return answer;
            }
        catch (InputMismatchException e) {
           System.out.println("Podałeś liczbę w złym formacie");
           return 3;
            }

        // closing the scanner object
        //input.close();
        }

        public static int HowManyPlayers() {
            System.out.println("Wpisz ilość uczestników wypisując cyfrę od 2 do 5.");
            System.out.println("Jeśli chcesz wrócić do głównego menu, wpisz liczbę 0.");

            //odpowiedź
            try {
                Scanner input = new Scanner(System.in);
                int answer = input.nextInt();
                return answer;
            }
            catch (InputMismatchException e) {
                System.out.println("Podałeś liczbę w złym formacie");
                return 0;
            }
        }
    }

