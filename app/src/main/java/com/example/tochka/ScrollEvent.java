package com.example.tochka;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

public class ScrollEvent {
    AppCompatImageView ScrollImage;
    TextView ScrollDate;
    TextView NameItem;
    AppCompatImageView Like;
    AppCompatButton GoEvent;

    public ScrollEvent(AppCompatImageView scrollImage, TextView scrollDate, TextView nameItem, AppCompatImageView like, AppCompatButton goEvent) {
        ScrollImage = scrollImage;
        ScrollDate = scrollDate;
        NameItem = nameItem;
        Like = like;
        GoEvent = goEvent;
    }

    public AppCompatImageView getScrollImage() {
        return ScrollImage;
    }

    public TextView getScrollDate() {
        return ScrollDate;
    }

    public TextView getNameItem() {
        return NameItem;
    }

    public AppCompatImageView getLike() {
        return Like;
    }

    public AppCompatButton getGoEvent() {
        return GoEvent;
    }
}
