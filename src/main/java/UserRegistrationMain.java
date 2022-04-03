import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    Pattern pattern;
    Matcher matcher;
    /* method firstName to validate the first name of the user
     * @param name return boolean value
     */
    public boolean firstName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* methodlastName to validation of the name value
       @param name return boolean value
     */
    public boolean lastName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* method emailValidation to validate email format0
       @param name return boolean value
     */
    public boolean emailValidation(String Email){
        String regx = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(Email);
        return matcher.matches();
    }
}