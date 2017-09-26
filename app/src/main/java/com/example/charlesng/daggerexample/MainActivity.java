package com.example.charlesng.daggerexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;

public class MainActivity extends DaggerAppCompatActivity {
  @Inject SharedPreferences sharedPreferences;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView1 = findViewById(R.id.textView1);
    textView1.setText(sharedPreferences.getString("sample","I am hello world2"));

  }
}
