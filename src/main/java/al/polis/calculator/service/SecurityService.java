package al.polis.calculator.service;

public interface SecurityService {

    /**
     * This method authenticate the user polis with password isthebest
     * @param username the username to be authenticated
     * @param password the password to authenticate
     * @return the OAUTH2 token (Bearer wehf4q8fhafjdfhwu...) if authenticated or empty string if not
     */
    String login(String username, String password);
}
