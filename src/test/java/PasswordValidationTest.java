import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void isPasswordMin8Char() {

        // given
        boolean letters = true;
        // when
        boolean actual = PasswordValidation.isPasswordMin8Char("Sommer2022");
        // then
        Assertions.assertEquals(true, actual);
    }


    @Test
    void isPasswordLonger7Char() {

        //given
        boolean letters = true;
        //when
        boolean actual = PasswordValidation.isPasswordLonger7Char("Sommer2022");
        //then
        Assertions.assertEquals(true, actual);

    }

    @Test
    void hasPasswordDigits() {
        //given
        boolean digits = true;

        //when
        boolean actual = PasswordValidation.hasPasswordDigits("Sommer2022");

        //then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void hasPasswordNoDigits() {
        //given
        boolean digits = false;
        //when
        boolean actual = PasswordValidation.hasPasswordNoDigits("Sommer2022");
        //then
        Assertions.assertEquals(false, actual);
    }



    @Test
    void containsUpperCaseLetter() {
        //given
        boolean upperCase = true;

        //when
        boolean actual = PasswordValidation.containsUpperCaseLetter("Sommer2022");

        //then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void containsLowerCaseLetter(){
        //given
        boolean containsLowerCase = true;
        //when
        boolean actual = PasswordValidation.containsLowerCaseLetter("Sommer2022");
        //then
        assertEquals(true, actual);
    }

@Test
    void containsBadPassword(){
        //given
    boolean badPassw = false;
        //when
    boolean actual = PasswordValidation.containsBadPassword("Passwort");
        // then
    Assertions.assertEquals(false, true);

}


}