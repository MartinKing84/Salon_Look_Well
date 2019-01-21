
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        int choice;
        String serviceName;
        int servicePrice;
        int serviceDuration;

        SaloonServices saloonServices = new SaloonServices();
        saloonServices.addServiceForClient(new ServicesForClient("Paznokcie", 120, 50));
        saloonServices.addServiceForClient(new ServicesForClient("Rzesy", 200, 100));


        System.out.println(saloonServices.getListOfServices());

        while(true){
           choice = 0;
           System.out.println("Menu: ");
           System.out.println("1 Add service: ");
           System.out.println("2 Select service: ");
           System.out.println("3 List of Services: ");

           System.out.print("9 Exit ");
           choice = inInt.nextInt();

           if (choice == 1) {
               System.out.println("Insert Service: ");
               serviceName = inStr.nextLine();

               System.out.println("Insert Price: ");
               servicePrice = inInt.nextInt();

               System.out.println("Insert Duration: ");
               serviceDuration = inInt.nextInt();

               saloonServices.addServiceForClient(new ServicesForClient(serviceName, servicePrice, serviceDuration));
           }

           else if (choice ==2 ){

               System.out.println("Give the name of service: ");
               serviceName = inStr.nextLine();
               saloonServices.selectService(serviceName);
           }

           else if( choice ==3){
              saloonServices.showListOfServices();

           }
           else if(choice == 9)
           {
               break;
           }
        }


    }


}
