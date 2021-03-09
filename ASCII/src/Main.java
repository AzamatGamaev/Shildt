public class Main {

    public static void main(String[] args)
            throws java.io.IOException {
        char enteredSimb, ignore;
        int i = 0;
        for (; ; ) {
            do {
                System.out.print("Введите символ: ");
                enteredSimb = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (enteredSimb < 32 && enteredSimb > 127);

            if (enteredSimb == 46) break;
            if (enteredSimb > 64 && enteredSimb < 91) {
                enteredSimb += 32;
                i++;
                System.out.println(enteredSimb);
            } else if (enteredSimb > 96 && enteredSimb < 123) {
                enteredSimb -= 32;
                i++;
                System.out.println(enteredSimb);
            } else System.out.println(enteredSimb);
        }
        System.out.println("Количетво изменений регистра символов = " + i);
    }
}
