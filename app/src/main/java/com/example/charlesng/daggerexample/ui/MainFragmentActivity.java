package com.example.charlesng.daggerexample.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.charlesng.daggerexample.R;
import dagger.Module;
import dagger.Provides;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;
import javax.inject.Singleton;

public class MainFragmentActivity extends DaggerAppCompatActivity {
  @Inject
  SharedPreferences sharedPreferences;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_fragment);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        //click me to show sharepreference text
        Snackbar.make(view, sharedPreferences.getString("sample","I am MainFragmentActivity"), Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
      }
    });
  }
  @Module
  @Singleton
  public static class MainFragmentActivityModule {

    @Provides
    SharedPreferences provideSharedPreferences(MainFragmentActivity mainActivity){
      return PreferenceManager.getDefaultSharedPreferences(mainActivity);
    }

  }

}
