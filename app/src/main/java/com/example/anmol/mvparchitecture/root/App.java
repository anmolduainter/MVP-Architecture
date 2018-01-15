package com.example.anmol.mvparchitecture.root;

import android.app.Application;

import com.example.anmol.mvparchitecture.LoginModule;

/**
 * Created by anmol on 15/1/18.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                                .applicationModule(new ApplicationModule(this))
                                .loginModule(new LoginModule())
                                .build();
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
