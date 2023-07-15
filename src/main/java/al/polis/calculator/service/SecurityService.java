package al.polis.calculator.service;

public interface SecurityService {

    /**
     * This method authenticate the user polis with password isthebest
     * @param username the username to be authenticated
     * @param password the password to authenticate
     * @return the OAUTH2 token (Bearer wehf4q8fhafjdfhwu...) if authenticated or empty string if not
     */
    String login(String username, String password);

    /**
     * This method authenticate the user polis looking on DB
     * @param username the username to be authenticated
     * @param password the password to authenticate
     * @return the OAUTH2 token (Bearer wehf4q8fhafjdfhwu...) if authenticated or empty string if not
     */
    String login2(String username, String password);

    /**
     * This method authenticate the user looking on DB with a where clause on username
     * @param username the username to be authenticated
     * @param password the password to authenticate
     * @return the OAUTH2 token (Bearer wehf4q8fhafjdfhwu...) if authenticated or empty string if not
     */
    String login3(String username, String password);

    /**
     * This method authenticate the user looking on DB with a where clause on username and password
     * @param username the username to be authenticated
     * @param password the password to authenticate
     * @return the OAUTH2 token (Bearer wehf4q8fhafjdfhwu...) if authenticated or empty string if not
     */
    String login4(String username, String password);
}
