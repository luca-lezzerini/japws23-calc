package al.polis.calculator.service.impl;

import al.polis.calculator.service.SecurityService;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

    // random number generator
    private Random rnd = new Random();

    @Override
    public String login(String username, String password) {
        if (username == null || password == null) {
            return ""; // no username or password -> no token!
        }

        if (username.equalsIgnoreCase("polis") && password.equalsIgnoreCase("isthebest")) {
            long tknumber = rnd.nextLong();
            String token = "Bearer " + Long.toHexString(tknumber);
            return token;
        } else {
            return "";
        }
    }

}
