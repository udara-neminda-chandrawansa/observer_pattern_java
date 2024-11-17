public class Main {
    public static void main(String[] args) {
        Store s = new Store("Lal Store", "IPhone 16");

        Person udara = new Person("Udara", "udaraneminda@gmail.com");

        s.subscribe(udara);
        udara.subscribeStore(s);
        udara.notifyPerson();
    }
}
