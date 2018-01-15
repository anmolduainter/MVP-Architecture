package com.example.anmol.mvparchitecture;

/**
 * Created by anmol on 15/1/18.
 */

public interface LoginActivityMVP {

    interface View{

        void setFirstName(String firstName);
        void setLastName(String lastName);

        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();

    }

    interface Presenter{
        void setView(LoginActivityMVP.View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface Model{
        void createUser(String fname , String lastName);
        User getUser();
    }

}
