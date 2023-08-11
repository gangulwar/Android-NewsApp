package org.gangulwar.newsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        RecyclerView latestNewsRecyclerView = findViewById(R.id.latestNewsRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        latestNewsRecyclerView.setLayoutManager(layoutManager);

        // latestNewsRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        latestNews.add(new TopStroiesModal(
                "MSN",
                "'Partisan politics more important for opposition': Jaishankar over Parliament disruptions",
                "Partisan politics more important for opposition: Jaishankar over Parliament disruptions",
                "External Affairs Minister S Jaishankar on Friday said that " +
                        "partisan politics was more important for the opposition than the functioning " +
                        "of Parliament. \"A disruptionist opposition is a reality, they are determined " +
                        "not to let Parliament function,\" he said. He further claimed that " +
                        "there was \"no chance of constructive debate\" on issues like Afghanistan.",
                "https://www.example.com/link1",
                "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AA1eu6vd.img?w=768&h=432&m=6&x=298&y=131&s=286&d=286",
                "August 1, 2023",
                "Body content for the first news"
        ));

        latestNews.add(new TopStroiesModal(
                "MSN",
                "This 8th Pass Man From Rajasthan Made An Indian Snack A Global Sensation, With An Annual Turnover Of Over Rs 1000 Crore",
                "8th Pass Man From Rajasthan Made An Indian Snack A Global Sensation",
                "Dhaba owner Narayan Bhai from Churu, Rajasthan, has achieved the unimaginable. " +
                        "With an annual turnover of more than ₹1000 crore, he has taken the Indian " +
                        "snack 'bhujia' to global levels. But what sets him apart from others? Watch " +
                        "to find out his inspiring story and journey.",
                "https://www.example.com/link2",
                "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AA1et5G9.img?w=700&h=400&m=6&x=309&y=52&s=93&d=93",
                "August 1, 2023",
                "Body content for the second news"
        ));

        latestNews.add(new TopStroiesModal(
                "MSN",
                "Wheel Expert: Pro Parallel Parker Gets Out Of Tough Spot, Internet Says 'Austin Powers Is That You?'",
                "Pro Parallel Parker Gets Out Of Tough Spot, Internet Says 'Austin Powers Is That You?'",
                "A video of a wheel expert from China has left the Internet amused. In the clip, " +
                        "the man is seen successfully getting out of a tight spot while parking his " +
                        "vehicle. Internet users compared the man to Austin Powers, a fictional " +
                        "character known for his unusual parking skills.",
                "https://www.example.com/link3",
                "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AA1etJ5U.img?w=768&h=403&m=6",
                "August 1, 2023",
                "Body content for the third news"
        ));

        LatestNewsAdapter adapter = new LatestNewsAdapter(this, latestNews);
        latestNewsRecyclerView.setAdapter(adapter);


        RecyclerView topStories = findViewById(R.id.topStoriesRecycleView);
        topStories.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        topStoriesList.add(new TopStroiesModal(
                "NPR",
                "Author 1",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news1",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "Date 1",
                "Body 1"
        ));

        topStoriesList.add(new TopStroiesModal(
                "The Athletic",
                "Author 2",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news2",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "Date 2",
                "Body 2"
        ));

        topStoriesList.add(new TopStroiesModal(
                "CNN",
                "Author 3",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news3",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "Date 3",
                "Body 3"
        ));

        topStoriesList.add(new TopStroiesModal(
                "NPR",
                "Author 4",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news4",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "Date 4",
                "Body 4"
        ));

        topStoriesList.add(new TopStroiesModal(
                "The Athletic",
                "Author 5",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news5",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "Date 5",
                "Body 5"
        ));

        topStoriesList.add(new TopStroiesModal(
                "CNN",
                "Author 6",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news6",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "Date 6",
                "Body 6"
        ));

        topStoriesList.add(new TopStroiesModal(
                "NPR",
                "Author 7",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news7",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "Date 7",
                "Body 7"
        ));

        topStoriesList.add(new TopStroiesModal(
                "The Athletic",
                "Author 8",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news8",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "Date 8",
                "Body 8"
        ));


        TopStroiesAdapter topStroiesAdapter = new TopStroiesAdapter(this, topStoriesList);
        topStories.setAdapter(topStroiesAdapter);

        AppCompatButton businessButton = findViewById(R.id.business_button);
        AppCompatButton entertainmentButton = findViewById(R.id.entertainment_button);
        AppCompatButton scienceButton = findViewById(R.id.science_button);
        AppCompatButton sportsButton = findViewById(R.id.sports_button);
        AppCompatButton technologyButton = findViewById(R.id.technology_button);


        businessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked(businessButton);
            }
        });

        entertainmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked(entertainmentButton);
            }
        });

        scienceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked(scienceButton);
            }
        });

        sportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked(sportsButton);
            }
        });

        technologyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClicked(technologyButton);
            }
        });

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
                }else if (id == R.id.topStories) {
                    Toast.makeText(getApplicationContext(), "Top Stories Clicked", Toast.LENGTH_SHORT).show();
                    //getSupportActionBar().setTitle("Top Stories");
                    titleOfToolBar.setText("Top Stories");
                } else if (id == R.id.categories) {
                    Toast.makeText(getApplicationContext(), "Categories Clicked", Toast.LENGTH_SHORT).show();
                    //getSupportActionBar().setTitle("Categories");
                    titleOfToolBar.setText("Categories");
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
}
