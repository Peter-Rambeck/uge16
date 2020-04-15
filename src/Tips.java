import java.util.Scanner;

public class Tips {

    String country;
    String service;
    int amount;


    public Tips() {
        // this.country = country;
        // this.service = service;
        // this.amount = amount;
    }

    public void displayLand() {
        int counter = 0;
        String[] land = {"Denmark", "Greenland", "USA",};
        for (String i : land) {
            counter++;
            System.out.println(counter + "\t" + i);
        }
    }

    String[] serviceOption = {"Taxi", "Restaurant", "Hotel"};

    public void displayService() {
        int counter = 0;
        for (String i : this.serviceOption) {
            counter++;
            System.out.println(counter + "\t" + i);
        }
    }

    public double beregnDrikkepenge(String country, String service, int amount) {
        double Denmark = 1.10;
        double Greenland = 1.05;
        double USA = 1.05;

        double result = 0;
        if (country == "Denmark") {
            result = amount * Denmark;
        }
        return result;
    }


    public void dialouge() {

        Scanner input = new Scanner(System.in);

        System.out.println("Menu");

        System.out.println("1\t Land");
        System.out.println("2\t Service");
        System.out.println("3\t Beløb");
        System.out.println("4\t Beregn drikkepenge");

        int menu = input.nextInt();

        // public void caseOne() {
        switch (menu) {
            case 1:
//                System.out.print("Land: ");
                System.out.print("Vælg land \n");
                displayLand();
                int countryChoice = input.nextInt();
                switch (countryChoice) {
                    case 1:
                        System.out.println("your choice: \t Denmark");
                        country = "Denmark";
                        dialouge();
                    case 2:
                        System.out.println("your choice: \t Greenland");
                        country = "Greenland";
                        dialouge();
                        break;
                    case 3:
                        System.out.println("your choice: \t USA");
                        country = "USA";
                        dialouge();
                        break;
                    default:
                        System.out.println("Not in use");
                        dialouge();
                        break;
                }


            case 2:
                System.out.print("Vælg service \n");
                displayService();
                int serviceChoice = input.nextInt();
                switch (serviceChoice) {
                    case 1:
                        System.out.println("your choice: \t " + serviceOption[0]);
                        service = serviceOption[0];
                        dialouge();
                        break;
                    case 2:
                        System.out.println("your choice: \t " + serviceOption[1]);
                        service = serviceOption[1];
                        dialouge();
                        break;
                    case 3:
                        System.out.println("your choice: \t " + serviceOption[2]);
                        service = serviceOption[2];
                        dialouge();
                        break;
                    default:
                        System.out.println("Not in use");
                        dialouge();
                        break;
                }
                    case 3:
                        System.out.print("Enter amount: ");
                        amount = input.nextInt();
                        dialouge();
                        break;

                    case 4:
                        System.out.println("Selection: " + country + " " + service + " " + amount);
                        beregnDrikkepenge(this.country, this.service, this.amount);
                        break;
                }
        }
    }







