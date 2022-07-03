public class PasswordValidation {


    public static boolean isPasswordMin8Char(String password) {
        System.out.println("Das Passwort enthält mindestens 8 Zeichen.");
        return (password.length() > 7);

    }

    public static boolean isPasswordLonger7Char(String password) {
        System.out.println("Das Passwort ist länger als 7 Zeichen.");
        return password.length() > 7;

    }


    public static boolean hasPasswordDigits(String password) {
        char[] charpassw = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(charpassw[i])) {
                System.out.println("Das Passwort enthält Zahlen.");
                return true;
            }
        }
        return false;
    }


    public static boolean hasPasswordNoDigits(String password) {
        char[] nopassw = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(nopassw[i])) {
                System.out.println("Das Passwort enthält Zahlen.");
                return false;
            }
        }
        System.out.println("Das Passwort enthält keine Zahlen.");
        return true;
    }

    public static boolean containsUpperCaseLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                System.out.println("Das Passwort enthält Großbuchstaben.");
                return true;
            }
        }
        return false;
    }


    public static boolean containsLowerCaseLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                System.out.println("Das Passwort enthält Kleinbuchstaben.");
                return true;
            }
        }
            System.out.println("Das Passwort enthält keine Kleinbuchstaben");
            return false;
    }


}