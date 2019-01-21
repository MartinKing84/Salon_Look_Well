import java.util.ArrayList;
import java.util.List;

public class SaloonServices implements SaloonServicesInterface{

    private List<ServicesForClient> listOfServices = new ArrayList<ServicesForClient>();

    public void selectService(String serviceForClientName) {
        int count;
        for(count =0; count < listOfServices.size() ;count++)
        {
            if (listOfServices.get(count).getName().toUpperCase().equals(serviceForClientName.toUpperCase())) {

                System.out.println("Service Name: " + listOfServices.get(count).getName());
                System.out.println("Service Price: " + listOfServices.get(count).getPrice());
                System.out.println("Service Duration: " + listOfServices.get(count).getDuration() );
                break;
            }
            else if(count == listOfServices.size()-1)
            {

                System.out.println("No such service");
            }
        }
    }

    public void addServiceForClient(ServicesForClient services) {
        listOfServices.add(services);
    }

    public void showListOfServices() {
        System.out.println(listOfServices);
    }


    public List<ServicesForClient> getListOfServices() {
        return listOfServices;
    }

    @Override
    public String toString() {
        return "SaloonServices{" +
                "listOfServices=" + listOfServices +
                '}';
    }
}
