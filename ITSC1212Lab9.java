public class ITSC1212Lab9 {
    public static void main(String[] args) {
        char symbol = '%';

        for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        System.out.print(symbol);
                    }
                System.out.print(" ");
                if (symbol == '%') {
                    symbol = '#';
                }
                else {
                    symbol = '%';
                }
            }
            System.out.println(" ");
            if (symbol == '%') {
                symbol = '#';
            }
            else {
                symbol = '%';
            }
        }
    }
}