public class Lesson07 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100, 100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}