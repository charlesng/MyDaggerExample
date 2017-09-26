package com.example.charlesng.daggerexample.di;

import com.example.charlesng.daggerexample.MainActivity;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by Charles Ng on 26/9/2017.
 */

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity>{
  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}