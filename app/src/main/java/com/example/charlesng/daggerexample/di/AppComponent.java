package com.example.charlesng.daggerexample.di;

import android.app.Application;
import com.example.charlesng.daggerexample.MyApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Charles Ng on 26/9/2017.
 */
@Component(modules = {
    AndroidInjectionModule.class, AndroidSupportInjectionModule.class,
    AppModule.class,
    ActivityBuilder.class})
public interface AppComponent {

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder application(Application application);

    AppComponent build();
  }

  void inject(MyApplication app);
}