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

public class CategoriesFragment extends Fragment {

    ArrayList<TopStroiesModal> arrayList = new ArrayList<>();
    Context context;

    public CategoriesFragment(Context context) {
        // Required empty public constructor
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        RecyclerView topStories = view.findViewById(R.id.categoriesRecycleView);
        topStories.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

        arrayList.add(new TopStroiesModal(
                "NPR",
                "Author 1",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news1",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T06:37:35Z",
                "Body 1"
        ));

        arrayList.add(new TopStroiesModal(
                "The Athletic",
                "Author 2",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news2",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T06:19:27Z",
                "Body 2"
        ));

        arrayList.add(new TopStroiesModal(
                "CNN",
                "Author 3",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news3",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "2023-08-11T05:54:00Z",
                "Body 3"
        ));

        arrayList.add(new TopStroiesModal(
                "NPR",
                "Author 4",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaB",
                "https://example.com/news4",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T05:47:29Z",
                "Body 4"
        ));

        arrayList.add(new TopStroiesModal(
                "The Athletic",
                "Author 5",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news5",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T05:47:29Z",
                "Body 5"
        ));

        arrayList.add(new TopStroiesModal(
                "CNN",
                "Author 6",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news6",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "2023-08-11T06:45:23Z",
                "Body 6"
        ));

        arrayList.add(new TopStroiesModal(
                "NPR",
                "Author 7",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news7",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T05:47:29Z",
                "Body 7"
        ));

        arrayList.add(new TopStroiesModal(
                "The Athletic",
                "Author 8",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news8",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T05:47:29Z",
                "Body 8"
        ));


        TopStroiesAdapter topStroiesAdapter = new TopStroiesAdapter(context, arrayList);
        topStories.setAdapter(topStroiesAdapter);

        return view;
    }
}