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
}