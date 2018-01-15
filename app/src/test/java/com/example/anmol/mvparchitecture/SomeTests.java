package com.example.anmol.mvparchitecture;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

public class SomeTests {

    LoginActivityMVP.Model model;
    LoginActivityMVP.View view;
    LoginActivityPresenter presenter;

    User user;

    @Before
    public void setup(){
        model = mock(LoginActivityMVP.Model.class);

        user = new User("h","g");
        when(model.getUser()).thenReturn(user);

        view = mock(LoginActivityMVP.View.class);
        presenter = new LoginActivityPresenter(model);

        presenter.setView(view);
    }

    @Test
    public void noInteractionWithView(){
        presenter.getCurrentUser();
        verify(view,times(1));
    }

    @Test
    public void whenValidUserIsPresent(){

        when(model.getUser()).thenReturn(user);
        presenter.getCurrentUser();

        //Verify Model Interaction
        verify(model,times(1)).getUser();

        //Verigy View Interaction
        verify(view,times(1)).setFirstName("h");
        verify(view,times(1)).setLastName("g");
        verify(view,never()).showUserNotAvailable();


    }

}
