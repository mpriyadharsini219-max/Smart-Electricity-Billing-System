public class Consumer {

    int consumerId;
    String name;
    int unitsConsumed;

    public Consumer(int consumerId, String name, int unitsConsumed) {
        this.consumerId = consumerId;
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public void displayConsumer() {
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + unitsConsumed);
    }
}
