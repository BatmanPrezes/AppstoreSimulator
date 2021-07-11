import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //zmienne konfiguracyjne - może lepiej zmienić je na obiekt? nwm czy zbyt bazodanowo nie myslę xd
        Date startDate = new Date(120, 0, 1);
        Date today = new Date(120, 0, 1);
        int dayCounter = 0;
        boolean stop = false;
        int howManyPlayers = 0;

        //System.out.println(today);

        ArrayList<String> gamers = new ArrayList<String>();
        ArrayList<Project> projects = new ArrayList<Project>();
        ArrayList<ArrayList<Employee>> employees = new ArrayList<ArrayList<Employee>> ();

        Client client1 = new Client();

        Client client2 = new Client();

        Client client3 = new Client();

        Client client4 = new Client();

        Client client5 = new Client();

        ArrayList<Client> clients = new ArrayList<Client>();

        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);

        int movementsPerRound = 0; //użytkownik będzie sam wybierać od 3 do 10?

        //pętla główna gry
        while (stop == false)
        {
            //warunek kiedy wchodzi do głównego menu, a kiedy nie
            if (howManyPlayers == 0)
            {
                int answer = Menu.MainMenu();

                System.out.println(answer);

                if (answer == 1) {
                    System.out.println("Tu będzie ustawienie graczy na 1");
                    howManyPlayers = 1;
                } else if (answer == 2) {
                    System.out.println("Tu będzie ustawienie graczy na wybraną liczbę do 5");
                    howManyPlayers = Menu.HowManyPlayers();
                    if (howManyPlayers == 0) {
                        continue;
                    }

                } else if (answer == 3) {
                    System.out.println("Tu będzie wybór tak nie.");
                    stop = true;
                }

            }

            else if (gamers.isEmpty()) {
                int miniLoop = 0;

                while (miniLoop == 0) {
                    gamers = Menu.nameYourGamers(howManyPlayers);
                    System.out.println(gamers);
                    if (gamers.size() == howManyPlayers) {
                        System.out.println(gamers.size() + " = " + howManyPlayers);
                        miniLoop = 1;
                    } else {
                        System.out.println("Nie zgadza się ilość nazwanych graczy. Proszę ponów akcję.");
                    }

                }
            }
            else if (movementsPerRound == 0) {
                while (movementsPerRound == 0) {
                    movementsPerRound = Menu.HowManyMovements();
                }

            }

            else
            {


                for(int i = 0; i<howManyPlayers; i++)
                {
                    if(projects == null || projects.size() != howManyPlayers)
                    {
                        int wybrane = 0;
                        while (wybrane == 0) {

                            int max = clients.size();
                            Random rand = new Random();
                            int n = rand.nextInt(max);

                            Project project1 = new Project(clients.get(n),today);

                            max = clients.size();
                            rand = new Random();
                            n = rand.nextInt(max);

                            Project project2 = new Project(clients.get(n),today);

                            max = clients.size();
                            rand = new Random();
                            n = rand.nextInt(max);

                            Project project3 = new Project(clients.get(n),today);


                            int project = Menu.WhichProject(project1,project2,project3);

                            if (project != 0)
                            {
                                if (project == 1)
                                {
                                    System.out.println("Wybrano Projekt 1: " + project1.projectName);
                                    projects.add(project1);
                                }
                                else if (project == 2)
                                {
                                    System.out.println("Wybrano Projekt 2: " + project2.projectName);
                                    projects.add(project2);
                                }
                                else
                                {
                                    System.out.println("Wybrano Projekt 3: " + project1.projectName);
                                    projects.add(project3);
                                }

                                wybrane = 1;

                            }



                        }

                    }

                    for(int j = 0; j<movementsPerRound; j++)
                    {
                        int answer;
                        int loops = 1;

                        while (loops == 1)
                        {
                            answer = Menu.Moves();

                            if(answer == 1)

                            {
                                int temp;
                                ArrayList<Employee> tabl = new ArrayList<Employee>();

                                if(employees.size() >= i + 1)
                                {tabl = employees.get(i);
                                    temp = Menu.StatusEmpl(tabl);
                                }

                                else
                                {
                                    temp = Menu.StatusEmpl();}

                                if(temp == 1)
                                {
                                    int wybrane = 0;
                                    while (wybrane == 0)
                                    {
                                        Employee employee1 = new Employee();
                                        Employee employee2 = new Employee();
                                        Employee employee3 = new Employee();

                                        int empl = Menu.WhichEmployee(employee1,employee2,employee3);

                                        if (empl != 0)
                                        {
                                            if (empl == 1)
                                            {
                                                System.out.println("Wybrano pracownika nr 1: " + employee1.firstName + " " + employee1.lastName);
                                                tabl.add(employee1);
                                            }
                                            else if (empl == 2)
                                            {
                                                System.out.println("Wybrano pracownika nr 2: " + employee2.firstName + " " + employee2.lastName);
                                                tabl.add(employee2);
                                            }
                                            else
                                            {
                                                System.out.println("Wybrano pracownika nr 3: " + employee3.firstName + " " + employee3.lastName);
                                                tabl.add(employee3);
                                            }

                                            wybrane = 1;

                                        }
                                    }

                                    loops = 1;
                                }


                            }
                            else if(answer == 2)
                            {
                                int temp = Menu.StatusProj(projects.get(i));
                            }
                        }
                    }
                }



                stop = true;
            }


    }

}
}
