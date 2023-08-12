package org.gangulwar.newsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<TopStroiesModal> latestNews = new ArrayList<>();
    ArrayList<TopStroiesModal> topStoriesList = new ArrayList<>();
    private AppCompatButton selectedButton;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView titleOfToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);


        loadFragment(new MainFragment(getApplicationContext()), false);
//        AppCompatButton businessButton = findViewById(R.id.business_button);
//        AppCompatButton entertainmentButton = findViewById(R.id.entertainment_button);
//        AppCompatButton scienceButton = findViewById(R.id.science_button);
//        AppCompatButton sportsButton = findViewById(R.id.sports_button);
//        AppCompatButton technologyButton = findViewById(R.id.technology_button);
//
//
//        businessButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onButtonClicked(businessButton);
//            }
//        });
//
//        entertainmentButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onButtonClicked(entertainmentButton);
//            }
//        });
//
//        scienceButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onButtonClicked(scienceButton);
//            }
//        });
//
//        sportsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onButtonClicked(sportsButton);
//            }
//        });
//
//        technologyButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onButtonClicked(technologyButton);
//            }
//        });

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);
        titleOfToolBar = findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Newsify");
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.OpenDrawer, R.string.CloseDrawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.home) {
                    Toast.makeText(getApplicationContext(), "Home Clicked", Toast.LENGTH_SHORT).show();
                    //getSupportActionBar().setTitle("Top Stories");
                    titleOfToolBar.setText("Home");
                    loadFragment(new MainFragment(getBaseContext()),true);
                } else if (id == R.id.topStories) {
                    Toast.makeText(getApplicationContext(), "Top Stories Clicked", Toast.LENGTH_SHORT).show();
                    //getSupportActionBar().setTitle("Top Stories");
                    titleOfToolBar.setText("Top Stories");
                } else if (id == R.id.categories) {
                    Toast.makeText(getApplicationContext(), "Categories Clicked", Toast.LENGTH_SHORT).show();
                    //getSupportActionBar().setTitle("Categories");
                    titleOfToolBar.setText("Categories");

                    loadFragment(new CategoriesFragment(getApplicationContext()), true);
                } else if (id == R.id.aboutUs) {
                    Toast.makeText(getApplicationContext(), "About Us Clicked", Toast.LENGTH_SHORT).show();
                    titleOfToolBar.setText("About Us");
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void onButtonClicked(AppCompatButton clickedButton) {
        if (selectedButton != clickedButton) {
            // Set the currently selected button to white (deselected)
            if (selectedButton != null) {
                selectedButton.setBackground(ContextCompat.getDrawable(this, R.drawable.button_selector));
                selectedButton.setTextColor(Color.BLACK);
            }

            clickedButton.setBackground(ContextCompat.getDrawable(this, R.drawable.button_selected));
            clickedButton.setTextColor(Color.WHITE);
            selectedButton = clickedButton;
        }
    }

    public void loadFragment(Fragment fragment, boolean replace) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (replace) {
            ft.replace(R.id.container, fragment);
        } else {
            ft.add(R.id.container, fragment);
        }
        ft.commit();
    }
}
