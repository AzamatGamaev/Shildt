public class Main {

    public static void main(String[] agrs)
            throws java.io.IOException {

        char choice, ignore;
        Help helpObject = new Help();

        for (; ; ) {
            do {
                helpObject.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (helpObject.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            helpObject.helpOn(choice);
        }
    }
}
