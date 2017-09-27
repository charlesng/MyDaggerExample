package com.example.charlesng.daggerexample.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;
import com.example.charlesng.daggerexample.R;
import dagger.Module;
import dagger.Provides;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;
import javax.inject.Singleton;

public class MainActivity extends DaggerAppCompatActivity {
  @Inject SharedPreferences sharedPreferences;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView1 = findViewById(R.id.textView1);
    textView1.setText(sharedPreferences.getString("sample","I am hello world2"));

  }

  /**
   * Created by Charles Ng on 26/9/2017.
   */

  @Module
  @Singleton
  public static class MainActivityModule {

    @Provides
    SharedPreferences provideSharedPreferences(MainActivity mainActivity){
      return PreferenceManager.getDefaultSharedPreferences(mainActivity);
    }

  }
}
