package LogicalOpTable;

public class Main {

    public static void main(String[] args) {
        System.out.println("P\t\tQ\t\tP&Q\t\tP|Q\t\tP^Q\t\tP||Q\tP&&Q\t!P");
        boolean P = false;
        boolean Q = false;
        trueFalseTo01(P, Q);
        P = true;
        trueFalseTo01(P, Q);
        P = false;
        Q = true;
        trueFalseTo01(P, Q);
        P = true;
    }

    public static void trueFalseTo01(boolean firstP, boolean secondP) {
        if (firstP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        if (secondP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        if (firstP & secondP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        if (firstP | secondP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        if (firstP ^ secondP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        if (!firstP && !secondP) {
            System.out.print("0\t\t");
        } else {
            System.out.print("1\t\t");
        }

        if (firstP && secondP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        if (!firstP) {
            System.out.print("1\t\t");
        } else {
            System.out.print("0\t\t");
        }

        System.out.println();
    }
}

