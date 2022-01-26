package BenchChallenges.PINChecker;

public class driver {

    public static boolean validate(String check) {

        try {
            Integer.valueOf(check);
            // If the string is an integer, but for some reason has a "-" or "+" in front
            if (check.charAt(0) == '+' || check.charAt(0) == '-')
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            return false;
        }

        if (check.length() != 4 && check.length() != 6) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Tests given
        System.out.println(validate("121317"));
        System.out.println(validate("1234"));
        System.out.println(validate("45135"));
        System.out.println(validate("89abc1"));
        System.out.println(validate("900876"));
        System.out.println(validate(" 4983"));
        // Additional tests
        System.out.println(validate("-123"));
        System.out.println(validate("+123"));
    }

}
