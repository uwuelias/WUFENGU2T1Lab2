public class CatRunner {
    public static void main(String[] args) {
        Cat cat1=new Cat("uwu", 4, 56.3);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2=new Cat("meowy", 51, 100.9);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
