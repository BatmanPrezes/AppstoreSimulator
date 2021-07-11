import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;



//ujednolicić return po exeption z mismatch -> ma wracać za każdym razem do wyboru poprzedzającego go
//jedna wartość dla wszystkich metod

public class Menu {

    public static int MainMenu() {
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
        } catch (InputMismatchException e) {
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
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static ArrayList<String> nameYourGamers(int howManyPlayers) {
        System.out.println("Nazwij gracza/y.");
        ArrayList<String> gamers = new ArrayList<String>();

        for (int i = 1; i <= howManyPlayers; i++) {
            System.out.println("Gracz " + i + ":");
            //odpowiedź
            try {
                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                gamers.add(answer);
            } catch (InputMismatchException e) {
                System.out.println("Podałeś nazwę w złym formacie");
            }
        }

        return gamers;
    }

    public static int HowManyMovements() {
        System.out.println("Wybierz ile ruchów ma wykonywać gracz na jedną turę.");
        System.out.println("Wypisz liczbę od 3 do 10");

        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=3 && answer <= 10) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową ilość ruchów.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static int WhichProject(Project project1,Project project2,Project project3) {
        System.out.println("Wybierz projekt");
        System.out.println("Projekt 1:\n"+project1);
        System.out.println("Projekt 2:\n"+project2);
        System.out.println("Projekt 2:\n"+project3);
        System.out.println("1 - Projekt 1");
        System.out.println("2 - Projekt 2");
        System.out.println("3 - Projekt 3");
        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=1 && answer <= 3) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową wartość.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }
    public static int WhichEmployee(Employee employee1,Employee employee2,Employee employee3) {
        System.out.println("Wybierz pracownika");
        System.out.println("Pracownik 1:\n"+employee1);
        System.out.println("Pracownik 2:\n"+employee2);
        System.out.println("Pracownik 3:\n"+employee3);
        System.out.println("1 - Pracownik 1");
        System.out.println("2 - Pracownik 2");
        System.out.println("3 - Pracownik 3");
        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=1 && answer <= 3) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową wartość.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static int Moves() {
        System.out.println("Strefy wyboru:");
        System.out.println("1. Pracownicy");
        System.out.println("2. Projekty");
        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=1 && answer <= 2) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową wartość.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static int StatusEmpl(ArrayList<Employee> employees) {
        System.out.println("Obecni pracownicy");
        System.out.println(employees);
        System.out.println("1. Zatrudnij pracownika.");
        System.out.println("2. Wróć do stref.");

        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=1 && answer <= 2) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową wartość.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static int StatusEmpl() {
        System.out.println("Brak pracownika");
        System.out.println("1. Zatrudnij pracownika.");
        System.out.println("2. Wróć do stref.");

        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=1 && answer <= 2) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową wartość.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static int StatusProj(Project project) {
        System.out.println("Status projektu:");
        System.out.println(project);
        System.out.println("1. Pracuj osobiście.");
        System.out.println("2. Wybierz pracownika do pracy.");
        System.out.println("3. Wróć do stref.");
        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=1 && answer <= 3) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową wartość.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }


}




