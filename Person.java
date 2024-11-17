public class Person {
    String name;
    String email;
    Store store;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void subscribeStore(Store store){
        this.store = store;
    }

    public void notifyPerson(){
        System.out.println("Message from: " + store.stName + ". New " + store.product + " arrived!");
    }
}
