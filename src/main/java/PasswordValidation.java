public class PasswordValidation {


    public static boolean isPasswordMin7Char(String password) {
        return password.length() > 7;

    }

    public static boolean isPasswordLonger7Char(String password) {
        return true;

    }


    public static boolean hasPasswordDigits(String password) {
        char[] charpassw = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(charpassw[i])) {
                System.out.println(true);
                return true;
            }
        }
return false;
    }


    public static boolean hasPasswordNoDigits(String sommer2022) {
        return false;
    }
}



