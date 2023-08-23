package org.gangulwar.newsapp;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LatestNewsAdapter extends RecyclerView.Adapter<LatestNewsAdapter.ViewHolder> {

    Context context;

    ArrayList<TopStroiesModal> newsModalArrayList;

    LatestNewsAdapter(Context context, ArrayList<TopStroiesModal> newsModalArrayList) {
        this.context = context;
        this.newsModalArrayList = newsModalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_screen_trendingnews, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//holder.imageView.se
        TopStroiesModal object=newsModalArrayList.get(position);
        Picasso.get()
                .load(object.imageUrl)
                .placeholder(R.drawable.loadinggif)
                .error(R.drawable.image_loading_error)
                .into(holder.imageView);

        holder.title.setText(object.title);
        holder.source.setText(object.source);
       if (object.isLiked){
           holder.likeButton.setImageResource(R.drawable.heart_after);
       }else{
           holder.likeButton.setImageResource(R.drawable.heart_before);
       }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NewsDetailActivity.class);
                intent.putExtra("object", object);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("clicked");
//                Drawable a=holder.likeButton.getDrawable();
//                if (a.getConstantState().equals(ContextCompat.getDrawable(context, R.drawable.heart_before).getConstantState())){
//                    System.out.println("Reaching");
//                    holder.likeButton.setImageResource(R.drawable.heart_after);
//                }else {
//                    System.out.println("Reaching 2");
//                    holder.likeButton.setImageResource(R.drawable.heart_before);
//                }
               // TopStroiesModal object = newsModalArrayList.get(position);
                if (!(object.isLiked)) {
                    holder.likeButton.setImageResource(R.drawable.heart_after);
                    FavoriteFragment.addFavorite(object);
                    object.isLiked = true;
                } else {
                    holder.likeButton.setImageResource(R.drawable.heart_before);
                    //FavoriteFragment.removeFavorite(object);
                    object.isLiked = false;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;

        TextView source;

        ImageButton shareButton;
        ImageButton likeButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageViewNews);
            title = itemView.findViewById(R.id.Title);
            source = itemView.findViewById(R.id.source);
            shareButton = itemView.findViewById(R.id.shareButton);
            likeButton = itemView.findViewById(R.id.likeButton);
        }
    }
}
