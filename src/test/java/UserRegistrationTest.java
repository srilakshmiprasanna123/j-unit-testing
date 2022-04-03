import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationMain userRegistration = new UserRegistrationMain();
    @Test
    public void givenName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.firstName("Sri");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.lastName("Lucky");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.emailValidation("lucky@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.emailValidation("Lucky..@yahoo.com");
        Assert.assertFalse(result);
    }
    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.numberValidation("91 0123456789");
        Assert.assertTrue(result);
    }
    @Test
    public void givenNumberValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.numberValidation("91 08450911877");
        Assert.assertFalse(result);
    }
    @Test
    public void giveLoginValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidation("Asbmsopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLoginValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidation("Asjspnm");
        Assert.assertFalse(result);
    }
    @Test
    public void givenRule2Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidation2("Logaqaaopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule2Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginValidation2("addqeghopnm");
    }
    @Test
    public void givenRule3Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule3Validation("Laoqo1rpnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule3Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule3Validation("aqLawhrpnm");
        Assert.assertFalse(result);
    }
    @Test
    public void givenRule4Values_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule4Validation("adqe1aaL@fp");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule4Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule4Validation("awwfleropnm");
        Assert.assertFalse(result);
    }
    /**
     * Unit test for validating email sequence
     */
    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }
    /**
     * Unit test for validating mood of the User
     */
    @org.junit.jupiter.api.Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @org.junit.jupiter.api.Test
    public void givenMessage_WhenSad_ShouldReturnEntryFailed() {
        String result = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }
}