public class Main {
    public static void main(String[] agrs)
            throws java.io.IOException {

        char choice, ignore;

        for (; ; ) {
            do {
                System.out.print("Справка:\n" +
                        "1. if\n" +
                        "2. switch\n" +
                        "3. for\n" +
                        "4. while\n" +
                        "5. do-while\n" +
                        "6. break\n" +
                        "7. continue\n" +
                        "q - выход\n" +
                        "Выберите: ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            System.out.println();

            switch (choice) {
                case '1':
                    System.out.println("Оператор if:\n" +
                            "if(условие) оператор;\n" +
                            "else оператор");
                    break;
                case '2':
                    System.out.println("Оператор switch:\n" +
                            "switch(выраежние) {\n" +
                            " case константа:\n" +
                            "полседовательность операторов\n" +
                            "break;\n" +
                            "//...\n" +
                            "}");
                    break;
                case '3':
                    System.out.println("Оператор for:\n" +
                            "for(инциализация; условие; итерация)\n" +
                            "оператор");
                    break;
                case '4':
                    System.out.println("Оператор while:\n" +
                            "while(условие) оператор;");
                    break;
                case '5':
                    System.out.println("Оператор do-while:\n" +
                            "do {\n" +
                            "оператор;\n" +
                            "} while (условие);");
                case '6':
                    System.out.println("Оператор break:\n" +
                            "break метка;");
                    break;
                case '7':
                    System.out.println("Оператор continue:\n" +
                            "continue метка;");
                    break;


            }
        }
    }
}
