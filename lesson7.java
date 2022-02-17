package hw;

public class lesson7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Mirka", 15),
                new Cat("Belok", 25),
                new Cat("Tuzik", 5),
                new Cat("Cat", 1)
        };

        Plate plate = new Plate(30);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(50);
        plate.info();
    }
}
