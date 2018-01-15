package com.example.anmol.mvparchitecture;

/**
 * Created by anmol on 15/1/18.
 */

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    //view
    private LoginActivityMVP.View view;

    //Model
    private LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model){
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {

        if (view!=null){
            if (view.getFirstName().equals("") || view.getLastName().equals("")){
                view.showInputError();
            }
            else{
                model.createUser(view.getFirstName(),view.getLastName());
                view.showUserSavedMessage();
            }
        }

    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if (user==null){
            if (view!=null){
                view.showUserNotAvailable();
            }
        }
        else{
            if (view!=null){
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }


    }
}
