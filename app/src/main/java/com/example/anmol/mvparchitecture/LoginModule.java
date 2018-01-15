package com.example.anmol.mvparchitecture;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anmol on 15/1/18.
 */

@Module
public class LoginModule {
    @Provides
    public LoginActivityMVP.Presenter providePresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideModel(){
        return new LoginModel();
    }
}
