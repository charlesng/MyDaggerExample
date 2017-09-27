package com.example.charlesng.daggerexample.ui;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.charlesng.daggerexample.R;
import dagger.Module;
import dagger.Provides;
import dagger.android.support.DaggerFragment;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragmentActivityFragment extends DaggerFragment {
  @Inject
  SharedPreferences sharedPreferences;
  public MainFragmentActivityFragment() {
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_main_fragment, container, false);
    TextView textView = view.findViewById(R.id.textView);
    textView.setText(sharedPreferences.getString("sample","I am MainFragmentActivityFragment"));
    return view;
  }

  @Module
  @Singleton
  public static class MainFragmentActivityFragmentModule {

    @Provides
    SharedPreferences provideSharedPreferences(MainFragmentActivityFragment mainActivity){
      return PreferenceManager.getDefaultSharedPreferences(mainActivity.getActivity());
    }

  }
}
