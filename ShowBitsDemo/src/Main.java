public class Main {
    public static void main(String[] args) {

        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 в двоичном представлении");
        b.show(123);

        System.out.println("\n87987 в двоичном представлени");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлени");
        li.show(37658768);

        System.out.println("\nМладшие 8 битов числа 87987 в двоичном представлении");
        b.show(87987);
    }
}
