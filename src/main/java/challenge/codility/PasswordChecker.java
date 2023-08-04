package challenge.codility;

import lombok.experimental.UtilityClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * We call a password secure if it contains no space characters and consists of at least six characters,
 * including at least one digit, one lowercase letter, one uppercase letter and one special character.
 * For the purpose of this task, we will consider just the following characters to be special: !@#$%^&*()_
*/
@UtilityClass
public class PasswordChecker {

    public boolean check(String password) {
        final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()])[a-zA-Z0-9!@#$%^&*()]{6,}";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
