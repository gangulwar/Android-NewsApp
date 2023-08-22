package org.gangulwar.newsapp;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<TopStroiesModal> arrayListForTab1;
    private ArrayList<TopStroiesModal> arrayListForTab2;
    Context context;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<TopStroiesModal> dataForTab1, ArrayList<TopStroiesModal> dataForTab2, Context context) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        arrayListForTab1 = dataForTab1;
        arrayListForTab2 = dataForTab2;
        this.context = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        //TabFragment tabFragment = new TabFragment();
        //Bundle args = new Bundle();

        switch (position) {
            case 0:
                return new BusinessFragment(context,0);
            case 1:
                return new BusinessFragment(context,1);
            // ... Add more cases as needed ...
            case 2:
                return new BusinessFragment(context,2);

            case 3:
                return new BusinessFragment(context,3);

            case 4:
                return new BusinessFragment(context,4);

            case 5:
                return new BusinessFragment(context,5);
        }

        // args.putSerializable("context", context);
        //tabFragment.setArguments(args);

        // Set the Context for the TabFragment
        //tabFragment.setContext(context);

        //return tabFragment;
        return null;
    }

    @Override
    public int getCount() {
        return 5; // Number of tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Set the tab titles
        switch (position) {
            case 0:
                return "Business";
            case 1:
                return "Entertainment";
            // ... Add more cases as needed ...
            case 2:
                return "Science";
            case 3:
                return "Sports";
            case 4:
                return "Technology";
            case 5:
                return " ";
            default:
                return null;
        }
    }

    public void getArrayList() {

        arrayListForTab1.add(new TopStroiesModal(
                "NPR",
                "Author 1",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news1",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T06:37:35Z",
                "Body 1"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "The Athletic",
                "Author 2",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news2",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T06:19:27Z",
                "Body 2"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "CNN",
                "Author 3",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news3",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "2023-08-11T05:54:00Z",
                "Body 3"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "NPR",
                "Author 4",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaB",
                "https://example.com/news4",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T05:47:29Z",
                "Body 4"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "The Athletic",
                "Author 5",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news5",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T05:47:29Z",
                "Body 5"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "CNN",
                "Author 6",
                "Trump shows in Iowa he still rules the GOP -- despite his deepening criminal peril - CNN",
                "Donald Trump only needed 10 minutes to show why his growing pile of criminal charges is not yet loosening his grip on the Republican presidential race and why his opponents will find him so hard to beat.",
                "https://example.com/news6",
                "https://media.cnn.com/api/v1/images/stellar/prod/230728220351-09-lincoln-dinner-072823-trump.jpg?c=16x9&q=w_800,c_fill",
                "2023-08-11T06:45:23Z",
                "Body 6"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "NPR",
                "Author 7",
                "Soldiers declare Niger general as head of state following coup - NPR",
                "Mutinous soldiers who staged a coup in Niger declared their leader, Gen. Abdourahmane Tchiani, the new head of state on Friday. A spokesman also said that the constitution was suspended.",
                "https://example.com/news7",
                "https://media.npr.org/assets/img/2023/07/29/ap23209437901149_wide-d6c94bef4550ff94f1e50f63038d570345b541b0-s1400-c100.jpg",
                "2023-08-11T05:47:29Z",
                "Body 7"
        ));

        arrayListForTab1.add(new TopStroiesModal(
                "The Athletic",
                "Author 8",
                "MLB trade deadline Q&A: Bowden on trade talks, scenarios and the latest rumblings - The Athletic",
                "Answering 20 questions as we head into the final days before the deadline, starting with what I'm hearing about the Dodgers-Cardinals talks.",
                "https://example.com/news8",
                "https://cdn.theathletic.com/app/uploads/2023/07/28165157/USATSI_21001664-scaled.jpg",
                "2023-08-11T05:47:29Z",
                "Body 8"
        ));
    }
}

