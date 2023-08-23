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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoriteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoriteFragment extends Fragment {

    static ArrayList<TopStroiesModal> favoriteArrayList = new ArrayList<>();
    Context context;

    static LatestNewsAdapter adapter;

    public FavoriteFragment(Context context) {
        // Required empty public constructor
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        RecyclerView latestNewsRecyclerView = view.findViewById(R.id.favoriteRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        latestNewsRecyclerView.setLayoutManager(layoutManager);

        // latestNewsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //sortArrayList();
        LatestNewsAdapter adapter = new LatestNewsAdapter(context, favoriteArrayList);
        latestNewsRecyclerView.setAdapter(adapter);
        return view;
    }

    static public void addFavorite(TopStroiesModal a) {
        favoriteArrayList.add(a);
        // adapter.notifyDataSetChanged(); // Notify the adapter of data change
    }

    static public void sortArrayList() {
        //favoriteArrayList.remove(a);
        for (int i = 0; i < favoriteArrayList.size(); i++) {
           // for (int j=0;)
            if (!(favoriteArrayList.get(i).isLiked)) {
                favoriteArrayList.remove(favoriteArrayList.get(i));
            }
        }
        // adapter.notifyDataSetChanged(); // Notify the adapter of data change
    }


}