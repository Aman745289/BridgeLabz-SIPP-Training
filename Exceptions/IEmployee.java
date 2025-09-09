package Exceptions;

public interface IEmployee {
    String login(String username, String password) throws UserNotFoundException;
}
