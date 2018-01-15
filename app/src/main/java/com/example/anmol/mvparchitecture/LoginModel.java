package com.example.anmol.mvparchitecture;

/**
 * Created by anmol on 15/1/18.
 */

public class LoginModel implements LoginActivityMVP.Model {


    User user;

    @Override
    public void createUser(String fname, String lastName) {
        user = new User(fname,lastName);
        user.setId(0);
    }

    @Override
    public User getUser() {
        return user;
    }
}
