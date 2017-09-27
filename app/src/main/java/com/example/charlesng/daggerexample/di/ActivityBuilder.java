package com.example.charlesng.daggerexample.di;

import com.example.charlesng.daggerexample.ui.MainActivity;
import com.example.charlesng.daggerexample.ui.MainFragmentActivity;
import com.example.charlesng.daggerexample.ui.MainFragmentActivityFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Charles Ng on 26/9/2017.
 */

@Module
public abstract class ActivityBuilder {

  @ContributesAndroidInjector(modules = MainActivity.MainActivityModule.class)
  abstract MainActivity bindMainActivity();

  @ContributesAndroidInjector(modules = MainFragmentActivity.MainFragmentActivityModule.class)
  abstract  MainFragmentActivity bindMainFragmentActivity();

  @ContributesAndroidInjector(modules = MainFragmentActivityFragment.MainFragmentActivityFragmentModule.class)
  abstract MainFragmentActivityFragment bindMainFragmentActivityFragment();

}