abstract class BakeryItem {
    protected String name;
    protected int price;

    public BakeryItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    abstract void order(); // Abstract method to be implemented by subclasses
}

// Subclasses for different bakery items
class Cookies extends BakeryItem {
    public Cookies() {
        super("Cookies", 10);
    }

    @Override
    void order() {
        System.out.println(name + " ordered! Price: $" + price);
    }
}

class Pastry extends BakeryItem {
    public Pastry() {
        super("Pastry", 15);
    }

    @Override
    void order() {
        System.out.println(name + " ordered! Price: $" + price);
    }
}

class Bread extends BakeryItem {
    public Bread() {
        super("Bread", 8);
    }

    @Override
    void order() {
        System.out.println(name + " ordered! Price: $" + price);
    }
}

class Donut extends BakeryItem {
    public Donut() {
        super("Donut", 12);
    }

    @Override
    void order() {
        System.out.println(name + " ordered! Price: $" + price);
    }
}

// Adding the missing Cake class
class Cake extends BakeryItem {
    public Cake() {
        super("Cake", 20);
    }

    @Override
    void order() {
        System.out.println(name + " ordered! Price: $" + price);
    }
}

// Order Processor (Handles Orders Dynamically)
class OrderProcessor {
    public void processOrder(BakeryItem item) {
        item.order();
    }
}

// Main class
public class withPrinciple {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();

        // Creating different bakery items dynamically
        BakeryItem cake = new Cake();
        BakeryItem cookies = new Cookies();
        BakeryItem pastry = new Pastry();
        BakeryItem bread = new Bread();
        BakeryItem donut = new Donut();

        // Processing orders using Polymorphism
        processor.processOrder(cake);
        processor.processOrder(cookies);
        processor.processOrder(pastry);
        processor.processOrder(bread);
        processor.processOrder(donut);
    }
}
