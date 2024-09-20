public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 16, 20);
            cat1.printCatInfo();
            cat1.introduce();

        Cat cat2 = new Cat("Bob", 6, 15);
            cat2.introduce();
            cat2.printCatInfo();

    }
}