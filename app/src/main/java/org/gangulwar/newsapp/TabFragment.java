package org.gangulwar.newsapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TabFragment extends Fragment {

    private ArrayList<TopStroiesModal> data = new ArrayList<>();
     Context context;
    public TabFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);

        Bundle args = getArguments();
        if (args != null) {
            data = args.getParcelableArrayList("data");
            context = (Context) args.getSerializable("context");
        }

        Context context = getContext();
        RecyclerView tabRecyclerView = view.findViewById(R.id.tabRecyclerView);
        tabRecyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

        LatestNewsAdapter adapter = new LatestNewsAdapter(context, data);
        tabRecyclerView.setAdapter(adapter);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}


