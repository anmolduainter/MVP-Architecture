package com.example.anmol.mvparchitecture.root;

import com.example.anmol.mvparchitecture.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anmol on 15/1/18.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity target);
}
