import java.text.DecimalFormat;
import java.util.Random;

public class Employee {
    String firstName;
    String lastName;
    String[] technology;
    Double wallet;
    Double costPerHour;
    Integer hoursOfWorkPerDay;

    String[] technologies = {"F","B","D","M","W","P"};

    String[] firstNames = { "Anna","Hannah","Arthur", "John", "Keneth", "Jenny","Alice",
                            "Barbara", "Max", "Joseph", "Penny", "Louis","Hope","Kevin",
                            "Cornelius","Julian","Travis","Britney","Wanda","Dominus"};

    String[] lastNames = {  "Fooley","Strong","Green", "Kootney", "Malwa", "Sten","Lorenz",
                            "Tai", "Lu", "Kron", "Yellow", "Joodely","Honey","Pancake",
                            "Poop","Ruby","Stern","Kooks","Eelin","Ilon"};

    DecimalFormat df = new DecimalFormat("0.00");

    public Employee()
    {
        int max = firstNames.length;
        Random rand = new Random();
        int n = rand.nextInt(max);

        this.firstName = firstNames[n];

        //

        max = lastNames.length;
        rand = new Random();
        n = rand.nextInt(max);

        //

        this.wallet = 0.0;

        //

        this.lastName = lastNames[n];

        //

        rand = new Random();
        int m = rand.nextInt((3 - 2) + 1) + 2;

        for(int i = 0; i < m; i++) {

            max = technologies.length;
            rand = new Random();
            int l = rand.nextInt(max);

            String temp = technologies[l];

            technology.add(temp);

            technology = Project.removeFromArray(technology,temp);
        }

        //

        rand = new Random();
        n = rand.nextInt((10 - 4) + 1) + 4;
        this.hoursOfWorkPerDay = n;

        //

        rand = new Random();
        this.costPerHour = 30.0 + (200.0 - 30.0) * rand.nextDouble();

    }

    public String toString() {

        String techno = "";

        int size = technology.length;

        for(int i = 0; i < size; i++)
        {
            if (technology[i].equals("F")) {
                techno = techno + "Frontend\n";
            } else if (technology[i].equals("B")) {
                techno = techno + "Backend\n";
            } else if (technology[i].equals("D")) {
                techno = techno + "Database\n";
            } else if (technology[i].equals("M")) {
                techno = techno + "Mobile\n";
            } else if (technology[i].equals("P")) {
                techno = techno + "Prestashop\n";
            } else {
                techno = techno + "Mobile\n";
            }
        }

        return  this.firstName + this.lastName + " stawka na godzinę: " + df.format(costPerHour) +
                " ilość godzin pracy dziennie: " + this.hoursOfWorkPerDay + "\nZnane technologie:\n"+techno;

    }

}
