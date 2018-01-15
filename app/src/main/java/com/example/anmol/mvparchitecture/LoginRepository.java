package com.example.anmol.mvparchitecture;

/**
 * Created by anmol on 15/1/18.
 */

public interface LoginRepository {

    // Method for getting the details of the user
    User getUser();

    // Method for saving the details of the user
    void saveUser();
}
