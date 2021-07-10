import java.util.Date;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Project {

    String projectName;
    Client client;
    //
    Date dueDate;
    Integer duePaymentDays;
    //Days worth work:
    Integer frontEndDays = 0;
    Integer backEndDays = 0;
    Integer dataBaseDays = 0;
    Integer mobileDays = 0;
    Integer wordPressDays = 0;
    Integer prestaShop = 0;
    //
    Double penaltyPerDay;
    Double price;
    //
    String level;

    String[] technology = {"F","B","D","M","W","P"};

    String[] projectNames = {"Acapella", "Baobab", "Frozen", "Zombie Apocalipse", "Potato Farm",
                             "Xtreme Sliding", "LoveAPP", "Dead Eye", "GetUP", "Fiighto",
                             "Crazy Cat Lady", "BatCat - The journey", "FiveOClock", "Fit&Burnin","Makbet",
                             "Romeo&Cat","Rodeo&Juliet","Baby Yoda", "DressYourCat", "SpotiFire",
                             "MusicSounds", "Guitare Villain", "Pretty and prettier", "KeKO","KOKSOLINE",
                             "Pandas","MorePandas","EvenMorePandas","DontTalkToMeAfterTen","DontTalkToMeBeforeTen",
                             "ElTigre","KetchupAndFries","IMHUNGRY","UberFoods","Pokemall",
                             "AsteroideWatching", "Calculator pro", "DrawIO","Geegle","Ponies"};

    String[] levels = {"Łatwy", "Średni", "Złożony"};

    public Project(Client client,
                   Date today)
    {
        int max = projectNames.length;
        Random rand = new Random();
        int n = rand.nextInt(max);

        this.projectName = projectNames[n];

        this.client = client;


        max = levels.length;
        rand = new Random();
        n = rand.nextInt(max);

        this.level = levels[n];

        rand = new Random();
        n = rand.nextInt((30 - 10) + 1) + 10;

        //technology ---------------------------------------------------------------------------------------
        if (this.level.equals("Łatwy"))
        {
            max = technology.length;
            rand = new Random();
            int l = rand.nextInt(max);

            String temp = technology[l];

            if (temp.equals("F"))
            {
                this.frontEndDays = rand.nextInt(n + 1);
            }
            else if(temp.equals("B"))
            {
                this.backEndDays = rand.nextInt(n + 1);
            }
            else if (temp.equals("D"))
            {
                this.dataBaseDays = rand.nextInt(n + 1);
            }
            else if (temp.equals("M"))
            {
                this.mobileDays = rand.nextInt(n + 1);
            }
            else if(temp.equals("P"))
            {
                this.prestaShop = rand.nextInt(n + 1);
            }
            else
            {
                this.wordPressDays = rand.nextInt(n + 1);
            }
        }
        else if (this.level.equals("Średni"))
        {
            max = technology.length;
            rand = new Random();
            int l = rand.nextInt(max);

            String temp = technology[l];

            rand = new Random();
            int m = rand.nextInt((3 - 2) + 1) + 2;

            for(int i = 0; i < m; i++) {
                if (temp.equals("F")) {
                    this.frontEndDays = rand.nextInt(n + 1);
                } else if (temp.equals("B")) {
                    this.backEndDays = rand.nextInt(n + 1);
                } else if (temp.equals("D")) {
                    this.dataBaseDays = rand.nextInt(n + 1);
                } else if (temp.equals("M")) {
                    this.mobileDays = rand.nextInt(n + 1);
                } else if (temp.equals("P")) {
                    this.prestaShop = rand.nextInt(n + 1);
                } else {
                    this.wordPressDays = rand.nextInt(n + 1);
                }

                List<String> apps = Arrays.asList(technology);
                apps.remove(temp);
                technology = apps.toArray(new String[0]);
            }
        }
        else
        { //złożony
            max = technology.length;
            rand = new Random();
            int l = rand.nextInt(max);

            String temp = technology[l];

            rand = new Random();
            int m = rand.nextInt((6 - 3) + 1) + 3;

            for(int i = 0; i < m; i++) {
                if (temp.equals("F")) {
                    this.frontEndDays = rand.nextInt(n + 1);
                } else if (temp.equals("B")) {
                    this.backEndDays = rand.nextInt(n + 1);
                } else if (temp.equals("D")) {
                    this.dataBaseDays = rand.nextInt(n + 1);
                } else if (temp.equals("M")) {
                    this.mobileDays = rand.nextInt(n + 1);
                } else if (temp.equals("P")) {
                    this.prestaShop = rand.nextInt(n + 1);
                } else {
                    this.wordPressDays = rand.nextInt(n + 1);
                }

                List<String> apps = Arrays.asList(technology);
                apps.remove(temp);
                technology = apps.toArray(new String[0]);
            }

        }

        //technology ---------------------------------------------------------------------------------------

        Instant instant = today.toInstant();
        Instant nextDay = instant.plus(n, ChronoUnit.DAYS);
        this.dueDate = Date.from(nextDay);

        rand = new Random();
        this.duePaymentDays = rand.nextInt((15 - 5) + 1) + 5;

        rand = new Random();

        //price ---------------------------------------------------------------------------------------
        if (this.level.equals("Łatwy"))
        {
           this.price  = 5000.0 + (10000.0 - 5000.0) * rand.nextDouble();
        }
        else if (this.level.equals("Średni"))
        {
            this.price  = 11000.0 + (30000.0 - 11000.0) * rand.nextDouble();
        }
        else
        { //złożony
            this.price  = 31000.0 + (50000.0 - 31000.0) * rand.nextDouble();
        }

        //price ---------------------------------------------------------------------------------------

        //price ---------------------------------------------------------------------------------------
        if (this.level.equals("Łatwy"))
        {
            this.penaltyPerDay  = 500.0 + (1000.0 - 500.0) * rand.nextDouble();
        }
        else if (this.level.equals("Średni"))
        {
            this.penaltyPerDay = 2000.0 + (5000.0 - 2000.0) * rand.nextDouble();
        }
        else
        { //złożony
            this.penaltyPerDay  = 6000.0 + (10000.0 - 6000.0) * rand.nextDouble();
        }

        //price ---------------------------------------------------------------------------------------



    }

    public String toString() {
        String techno ="";

        if(this.frontEndDays!=0){techno = techno+"Frontend: " + this.frontEndDays + " dni\n";}
        if(this.backEndDays!=0){techno = techno+"Frontend: " + this.backEndDays + " dni\n";}
        if(this.dataBaseDays!=0){techno = techno+"Frontend: " + this.dataBaseDays + " dni\n";}
        if(this.wordPressDays!=0){techno = techno+"Frontend: " + this.wordPressDays + " dni\n";}
        if(this.prestaShop!=0){techno = techno+"Frontend: " + this.prestaShop + " dni\n";}
        if(this.mobileDays!=0){techno = techno+"Frontend: " + this.mobileDays + " dni\n";}

        return "Nazwa projektu: " + this.projectName + " Klient: " + this.client + " Do: " +
                this.dueDate + " Płatność " + this.duePaymentDays + " dni od oddania projektu. Poziom trudności: " +
                this.level+"\nTechnologie:\n"+techno+"Kara dzienna za opóźnienie: " + this.penaltyPerDay + " Cena: " + this.price;

    }

}
