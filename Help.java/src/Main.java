public class Main {

    public static void main(String[] agrs)
            throws java.io.IOException {

        System.out.print("Справка:\n" +
                "1. if\n" +
                "2. switch\n" +
                "Выберите: ");
        char choice = (char) System.in.read();

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
            default:
                System.out.println("Запрос не найден.");

        }
    }
}
