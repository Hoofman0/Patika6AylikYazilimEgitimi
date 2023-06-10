public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alexander", 15,120, 100, 50);
        Fighter f2 = new Fighter("Jessie", 25, 85,85, 40);

        Ring ring = new Ring(f1,f2,85, 100);
        ring.run();
    }
}