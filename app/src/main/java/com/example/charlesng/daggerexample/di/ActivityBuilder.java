package com.example.charlesng.daggerexample.di;

import android.app.Activity;
import com.example.charlesng.daggerexample.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Charles Ng on 26/9/2017.
 */

@Module
public abstract class ActivityBuilder {

  @Binds
  @IntoMap
  @ActivityKey(MainActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}