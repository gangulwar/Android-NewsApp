package org.gangulwar.newsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TopStroiesAdapter extends RecyclerView.Adapter<TopStroiesAdapter.ViewHolder> {

    Context context;

    ArrayList<TopStroiesModal> topStroiesModalArrayList;

    public TopStroiesAdapter(Context context, ArrayList<TopStroiesModal> topStroiesModalArrayList) {
        this.context = context;
        this.topStroiesModalArrayList = topStroiesModalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_screen_top_stories, parent, false);
        TopStroiesAdapter.ViewHolder viewHolder = new TopStroiesAdapter.ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull TopStroiesAdapter.ViewHolder holder, int position) {

        String imageUrl = topStroiesModalArrayList.get(position).imageUrl;
        String source = topStroiesModalArrayList.get(position).source;
        String title = topStroiesModalArrayList.get(position).title;
        String description = topStroiesModalArrayList.get(position).description;

        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.loadinggif)
                .error(R.drawable.image_loading_error)
                .into(holder.imageView);

        holder.source.setText(source);
        holder.title.setText(title);
        holder.description.setText(description);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NewsDetailActivity.class);
                intent.putExtra("object", topStroiesModalArrayList.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topStroiesModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView source;
        TextView author;
        TextView title;
        TextView description;
        TextView url;
        TextView imageUrl;
        TextView date;
        TextView body;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.topStoryImage);
            source = itemView.findViewById(R.id.topStorySource);
            title = itemView.findViewById(R.id.topStoryTitle);
            description = itemView.findViewById(R.id.topStoryDescription);

        }
    }

}
