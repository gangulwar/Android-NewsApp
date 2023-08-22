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
 * Use the {@link BusinessFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BusinessFragment extends Fragment {

    Context context;
    ArrayList<TopStroiesModal> latestNews = new ArrayList<>();
    int flag;

    public BusinessFragment(Context context, int flag) {
        // Required empty public constructor
        this.context = context;
        this.flag = flag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_business, container, false);

        RecyclerView latestNewsRecyclerView = view.findViewById(R.id.recyclerViewBusiness);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        latestNewsRecyclerView.setLayoutManager(layoutManager);

        // latestNewsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        latestNews = getArrayList(flag);
        LatestNewsAdapter adapter = new LatestNewsAdapter(context, latestNews);
        latestNewsRecyclerView.setAdapter(adapter);
        return view;

    }

    public static ArrayList<TopStroiesModal> getArrayList(int flag) {
        if (flag == 0) {
            return APIRequest.getBusinessNews();
        } else if (flag == 1) {
            return APIRequest.getEntertainmentNews();
        } else if (flag == 2) {
            return APIRequest.getScienceNews();
        } else if (flag == 3) {
            return APIRequest.getSportsNews();
        } else if (flag == 4) {
            return APIRequest.getTechnologyNews();
        } else if (flag == 5) {

        } else {

        }

        return null;
    }
}