import java.util.ArrayList;

public class Store {

    String stName;
    String product;

    ArrayList<Person> subscribers = new ArrayList<>();

    public Store(String stName, String product){
        this.stName = stName;
        this.product = product;
    }

    public void subscribe(Person person){
        subscribers.add(person);
    }
}