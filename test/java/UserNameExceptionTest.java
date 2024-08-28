import org.example.InvaliduserNameException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserNameExceptionTest {
    @Test
    @DisplayName("throw exception becouse username cannot be null")
    public void userNamethrowsInvalidUserNameExceptionForNullString() throws InvaliduserNameException {
        UserName name = new UserName();
        try {
            name.validUserName(null);
            Assertions.fail("excepted exception can be thrown");

        } catch (InvaliduserNameException e) {
            Assertions.assertEquals("user name cannot be null", e.getMessage());

        }
    }

    @Test
    @DisplayName("throw exception becouse username cannot be empty")
    public void usernameThrowsInvalidUserNameExceptionForEmptyString() throws InvaliduserNameException {
        UserName name = new UserName();
        try {
            name.validUserName(" ");
            Assertions.fail("excepted exception can be thrown");

        } catch (InvaliduserNameException e) {
            Assertions.assertEquals("username cannot be empty string", e.getMessage());
        }
    }

    @Test
    @DisplayName("throw exsception becouse username cannot be too short")
    public void userNamethrowsInvalidUserNameExceptionForShortUserName() throws InvaliduserNameException {
        UserName name = new UserName();
        try {
            name.validUserName("bhagya");
            Assertions.fail("excepted  exception can be thrown");
        } catch (InvaliduserNameException e) {
            Assertions.assertEquals("user name must be more than 8 or charcter", e.getMessage());
        }
    }

    @Test
    @DisplayName("throw exception becouse username cannot contain speacial character")
    public void userNamethrowsInvalidUserNameExceptionForSpeacialCharacter() throws InvaliduserNameException {
        UserName name = new UserName();
        try {
            name.validUserName("bhagya@123");
            Assertions.fail("in user name speacial characters are not allowed");
        } catch (InvaliduserNameException e) {
            Assertions.assertEquals("in user name speacial charcter not allowed", e.getMessage());
        }
    }

    @Test
    @DisplayName("finally valid user name")
    public void userNamethrowsInvalidUserNameExceptionForValidUserName() throws InvaliduserNameException {
        UserName name = new UserName();
        try {
            name.validUserName("bhagya123");
        } catch (InvaliduserNameException e) {
            Assertions.fail("exception cannot be excepted");
        }
    }
}



