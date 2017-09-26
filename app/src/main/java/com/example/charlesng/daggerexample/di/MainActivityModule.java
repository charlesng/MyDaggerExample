package com.example.charlesng.daggerexample.di;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.example.charlesng.daggerexample.MainActivity;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Charles Ng on 26/9/2017.
 */

@Module
@Singleton
public class MainActivityModule {

  @Provides
  SharedPreferences provideSharedPreferences(MainActivity mainActivity){
    return PreferenceManager.getDefaultSharedPreferences(mainActivity);
  }

}