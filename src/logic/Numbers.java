package logic;

public class Numbers {

    public static final String DIGITS_WORD[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

    public static void readNumber() {
        /*Scanner sc = new Scanner (System.in);
    int digit = sc.nextInt();
    String word = Numbers.ConverterWord(digit);
    System.out.println(word);*/
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int numbers : number) {
            String word = Numbers.ConverterWord(numbers);
            System.out.println(word);
        }

    }

    public static String ConverterWord(int digit) {
        return Numbers.DIGITS_WORD[digit];

    }

}
