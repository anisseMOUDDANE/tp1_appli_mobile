package com.example.tp1_appli_mobile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.Menu;
import android.view.MenuItem;

import com.example.tp1_appli_mobile.R;

public class MainActivity extends AppCompatActivity {

    public static final String COUTRY_ID = "COUTRY_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }



    public void navigateToCountryDetail(int countryId) {
        Fragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putInt(COUTRY_ID, countryId);
        fragment.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .addToBackStack(SecondFragment.TAG)
                .replace(R.id.nav_host_fragment, fragment, SecondFragment.TAG)
                .commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}