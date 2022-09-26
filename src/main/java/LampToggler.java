import java.util.Scanner;

public class LampToggler {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp("lampe 1");
        Lamp lamp2 = new Lamp("lampe 2");
        Lamp lamp3 = new Lamp("lampe 3");
        Lamp lamp4 = new Lamp("lampe 4");
        Lamp lamp5 = new Lamp("lampe 5");

        Lamp selectedLamp = null;

        Scanner sc = new Scanner(System.in);

        int option = 0;
        do {
            System.out.println(lamp1);
            System.out.println(lamp2);
            System.out.println(lamp3);
            System.out.println(lamp4);
            System.out.println(lamp5);
            System.out.println(" ");
            System.out.println("Which lamp do you wanna turn on? (0 quits the program): ");
            if (sc.hasNextInt())
                option = sc.nextInt();
            if (option > 0 && option <= 5) {
                if (option == 1)
                    selectedLamp = lamp1;
                else if (option == 2)
                    selectedLamp = lamp2;
                else if (option == 3)
                    selectedLamp = lamp3;
                else if (option == 4)
                    selectedLamp = lamp4;
                else if (option == 5)
                    selectedLamp = lamp5;

                selectedLamp.toggle();
            }
        } while (option != 0);

    }
}
