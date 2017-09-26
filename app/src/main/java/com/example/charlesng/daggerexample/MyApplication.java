package com.example.charlesng.daggerexample;

import android.app.Activity;
import android.app.Application;
import com.example.charlesng.daggerexample.di.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import javax.inject.Inject;

/**
 * Created by Charles Ng on 25/9/2017.
 */

public class MyApplication extends Application implements HasActivityInjector {

  @Inject
  DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerAppComponent.builder()
        .application(this)
        .build().inject(this);
  }


  @Override
  public AndroidInjector<Activity> activityInjector() {
    return activityDispatchingAndroidInjector;
  }
}
