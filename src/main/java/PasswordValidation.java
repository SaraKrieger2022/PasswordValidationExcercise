public class PasswordValidation {


    public static boolean isPasswordMin8Char(String password){
        System.out.println("Password is at least 8 characters long.");
        return password.length() > 7;

    }

    public static boolean isPasswordLonger7Char(String password) {
        System.out.println("Password is longer than 7 characters.");
        return password.length() > 7;

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


    public static boolean hasPasswordNoDigits(String password) {
        char [] nopassw = password.toCharArray();
        for(int i=0; i < password.length(); i++){
            if(Character.isDigit(nopassw[i])){
                System.out.println("Das Passwort enthält Zahlen.");
                return false;
            }
        }
        System.out.println("Das Passwort enthält keine Zahlen.");
        return true;
    }
}



