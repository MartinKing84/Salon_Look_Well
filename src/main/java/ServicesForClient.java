public class ServicesForClient {

    private String name;
    private double price;
    private double duration;

    public ServicesForClient(){
    }

    public ServicesForClient(String name, double price, double duration){
        this.name=name;
        this.price = price;
        this.duration = duration;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "\nservice='" + name + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
