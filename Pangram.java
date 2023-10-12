public class Pangram {
    public static boolean isPangramOrNot(String input) {

        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A mad boxer shot a quick, gloved jab to the jaw of his dizzy opponent.";

        if (isPangramOrNot(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
