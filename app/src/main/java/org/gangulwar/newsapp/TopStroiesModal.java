package org.gangulwar.newsapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class TopStroiesModal implements Parcelable {
    String source;
    String author;
    String title;
    String description;
    String url;
    String imageUrl;
    String date;
    String body;

    public TopStroiesModal(String source, String author, String title, String description, String url, String imageUrl, String date, String body) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
        this.date = date;
        this.body = body;
    }

    protected TopStroiesModal(Parcel in) {
        source = in.readString();
        author = in.readString();
        title = in.readString();
        description = in.readString();
        url = in.readString();
        imageUrl = in.readString();
        date = in.readString();
        body = in.readString();
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(source);
        dest.writeString(author);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(url);
        dest.writeString(imageUrl);
        dest.writeString(date);
        dest.writeString(body);
    }


    public static final Parcelable.Creator<TopStroiesModal> CREATOR = new Parcelable.Creator<TopStroiesModal>() {
        @Override
        public TopStroiesModal createFromParcel(Parcel in) {
            return new TopStroiesModal(in);
        }

        @Override
        public TopStroiesModal[] newArray(int size) {
            return new TopStroiesModal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
