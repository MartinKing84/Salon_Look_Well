import java.util.List;

public interface SaloonServicesInterface {

    void selectService(String serviceForClientName);

    void addServiceForClient(ServicesForClient services); //metoda przyjmuje obiekt klasy ServicesFOrClient

    void showListOfServices();


}
