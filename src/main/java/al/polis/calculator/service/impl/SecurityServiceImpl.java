package al.polis.calculator.service.impl;

import al.polis.calculator.model.User;
import al.polis.calculator.repository.UserRepository;
import al.polis.calculator.service.SecurityService;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

    // random number generator
    private Random rnd = new Random();

    @Autowired
    private UserRepository userRepository;

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

    @Override
    public String login2(String username, String password) {
        if (username == null || password == null) {
            return ""; // no username or password -> no token!
        }

        List<User> users = userRepository.findAll();

        for (User user : users) {
            if (username.equalsIgnoreCase(user.getUsername()) && password.equalsIgnoreCase(user.getPassword())) {
                long tknumber = rnd.nextLong();
                String token = "Bearer " + Long.toHexString(tknumber);
                return token;
            }
        }
        return "";
    }

    @Override
    public String login3(String username, String password) {
        if (username == null || password == null) {
            return ""; // no username or password -> no token!
        }

        List<User> users = userRepository.findByUsername(username);
        if (users == null || users.size() == 0) {
            return "";
        }
        User found = users.get(0);
        if (password.equalsIgnoreCase(found.getPassword())) {
            long tknumber = rnd.nextLong();
            String token = "Bearer " + Long.toHexString(tknumber);
            return token;
        }
        return "";
    }

    @Override
    public String login4(String username, String password) {
        if (username == null || password == null) {
            return ""; // no username or password -> no token!
        }

        User found = userRepository.findByUsernameAndPassword(username, password);
        if (found != null) {
            long tknumber = rnd.nextLong();
            String token = "Bearer " + Long.toHexString(tknumber);
            return token;
        } else {
            return "";
        }
    }

}
