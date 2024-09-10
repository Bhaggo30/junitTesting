import org.example.InvaliduserNameException;

public class UserName {

    public void validUserName(String userName) throws InvaliduserNameException {
        if (userName == null && userName.isEmpty()){
            throw  new InvaliduserNameException("username cannot be null or empty");
        }
        if (userName.length()<8){
            throw new InvaliduserNameException("username atleast 8 characters of length");
        }
        if (!userName.matches("[a-zA-Z0-9]+")){
            throw new InvaliduserNameException("username contain letter and numbers");
        }
        if (userName.contains(" ")){
            throw new InvaliduserNameException("username not contains space");
        }

    }
}

