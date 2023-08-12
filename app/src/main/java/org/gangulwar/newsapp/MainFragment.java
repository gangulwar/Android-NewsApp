package org.gangulwar.newsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    ArrayList<TopStroiesModal> latestNews = new ArrayList<>();
    ArrayList<TopStroiesModal> topStoriesList = new ArrayList<>();

    Context context;
    public MainFragment(Context context) {
        // Required empty public constructor
        this.context=context;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView latestNewsRecyclerView = view.findViewById(R.id.latestNewsRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
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

        LatestNewsAdapter adapter = new LatestNewsAdapter(context, latestNews);
        latestNewsRecyclerView.setAdapter(adapter);


        RecyclerView topStories = view.findViewById(R.id.topStoriesRecycleView);
        topStories.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

        topStoriesList.add(new TopStroiesModal(
                "NPR",
                "Author 1",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news1",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T06:37:35Z",
                "Body 1"
        ));

        topStoriesList.add(new TopStroiesModal(
                "The Athletic",
                "Author 2",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news2",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T06:19:27Z",
                "Body 2"
        ));

        topStoriesList.add(new TopStroiesModal(
                "CNN",
                "Author 3",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news3",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "2023-08-11T05:54:00Z",
                "Body 3"
        ));

        topStoriesList.add(new TopStroiesModal(
                "NPR",
                "Author 4",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaB",
                "https://example.com/news4",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T05:47:29Z",
                "Body 4"
        ));

        topStoriesList.add(new TopStroiesModal(
                "The Athletic",
                "Author 5",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news5",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T05:47:29Z",
                "Body 5"
        ));

        topStoriesList.add(new TopStroiesModal(
                "CNN",
                "Author 6",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news6",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "2023-08-11T06:45:23Z",
                "Body 6"
        ));

        topStoriesList.add(new TopStroiesModal(
                "NPR",
                "Author 7",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news7",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T05:47:29Z",
                "Body 7"
        ));

        topStoriesList.add(new TopStroiesModal(
                "The Athletic",
                "Author 8",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news8",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T05:47:29Z",
                "Body 8"
        ));


        TopStroiesAdapter topStroiesAdapter = new TopStroiesAdapter(context, topStoriesList);
        topStories.setAdapter(topStroiesAdapter);


        return view;
    }
}