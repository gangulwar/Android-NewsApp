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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

        String imageUrl = Constants.shortenDescription(topStroiesModalArrayList.get(position).imageUrl);
        String source = Constants.shortenDescription(topStroiesModalArrayList.get(position).source);
        String title = Constants.shortenDescription(topStroiesModalArrayList.get(position).title);
        String description = Constants.shortenDescription(topStroiesModalArrayList.get(position).description);
        String date = Constants.getTimeAgo(topStroiesModalArrayList.get(position).date);
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.loadinggif)
                .error(R.drawable.image_loading_error)
                .into(holder.imageView);

        holder.source.setText(source);
        holder.title.setText(title);
        holder.description.setText(description);
        holder.date.setText(date);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NewsDetailActivity.class);
                intent.putExtra("object", topStroiesModalArrayList.get(position));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
            date = itemView.findViewById(R.id.topStoriesPublishedAt);
        }
    }


}
