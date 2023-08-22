package org.gangulwar.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsDetailActivity extends AppCompatActivity {

    String source;
    String author;
    String title;
    String description;
    String url;
    String imageUrl;
    String date;
    String body;

    TopStroiesModal details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        Intent intent = getIntent();
//        imageUrl = getIntent().getStringExtra("imageUrl");
//        source = getIntent().getStringExtra("source");
//        title = getIntent().getStringExtra("title");
//        description = getIntent().getStringExtra("description");

        details = intent.getParcelableExtra("object");
        source = details.source;
        author = details.author;
        title = details.title;
        description = details.description;
        url = details.url;
        imageUrl = details.imageUrl;
        date = details.date;
        body = details.body;


        ImageView image = findViewById(R.id.detailImage);
        AppCompatTextView detailNewsSource = findViewById(R.id.detailNewsSource);
        AppCompatTextView detailNewsTitle = findViewById(R.id.detailNewsTitle);
        AppCompatTextView detailNewsBody = findViewById(R.id.detailNewsBody);
        AppCompatTextView detailAuthor = findViewById(R.id.detailNewsAuthor);
        AppCompatTextView detailPublish = findViewById(R.id.detailNewsPublish);
        AppCompatButton fullArticleButton = findViewById(R.id.fullArticleButton);

        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.loadinggif)
                .error(R.drawable.image_loading_error)
                .into(image);

        detailNewsSource.setText(source);
        detailNewsTitle.setText(title);
        detailNewsBody.setText(body);
        detailAuthor.setText(author);
        detailPublish.setText(Constants.getTimeAgo(date));
        fullArticleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsDetailActivity.this, WebViewActivity.class);
                intent.putExtra("key",url);
                startActivity(intent);
            }
        });

    }
}