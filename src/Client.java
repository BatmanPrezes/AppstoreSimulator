import java.util.Random;

public class Client {
    String clientName;
    String group;

    //Ten sam klient może zlecić kilka różnych projektów do realizacji, ale klienci dzielą się na kilka grup:

    //wyluzowanych - 30% szans na opóźnienie płatności o tydzień, ale też 20% szans na uniknięcie kary za
    // opóźnienie, jeżeli nie jest większe niż tydzień, oddanie niedziałającego projektu nie powoduje dodatkowych problemów

    //wymagających - 0% szans na opóźnienie płatności, 0% szans na uniknięcie kary, oddanie niedziałającego projektu
    // to 50% szans na utratę kontraktu bez zwrotu kosztów

    //skrwl - 30% szans na opóźnienie płatności o tydzień, 5% szans na opóźnienie płatności o miesiąc,
    // 0% szans na uniknięcie kary, 100% szans na utratę kontraktu po oddaniu niedziałającego projektu,
    // 1% szans nie nieuzyskanie płatności nigdy

    String[] groups = {"wyluzowany","wymagajacy","skrwl"};

    String[] clientNames= {"Incubus", "Baobab Corporation", "Cookie Gaming", "Anomalia sp. z o. o.", "GLEX",
                           "Xtreme", "KylME", "LazyBuns", "Garage Workers", "WeLoveFridges",
                           "Cake Company", "Ratatatatat", "Rusty", "Tulip","TokaTola"};

    public Client ()
    {
        int max = clientNames.length;
        Random rand = new Random();
        int n = rand.nextInt(max);
        this.clientName = clientNames[n];

        max = groups.length;
        rand = new Random();
        n = rand.nextInt(max);

        this.group = groups[n];
    }

    public String toString(){
        return this.clientName;
    }


}
