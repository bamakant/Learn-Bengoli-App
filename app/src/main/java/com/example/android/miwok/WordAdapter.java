package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BAMA KANT KAR on 24-Dec-16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    //@param activity is the current activity
    //@Word is th link of Word class that have list of data to be displayed.
    //@param ColorResourceId is the parameter for background color
    public WordAdapter(Activity context, ArrayList<Word> words, int ColorResourceId) {

        super(context, 0, words);
    mColorResourceId=ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word currentWord = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Lookup view for data population
        TextView nBanglaWord = (TextView) convertView.findViewById(R.id.person_text_view);
        TextView nDefaultWord = (TextView) convertView.findViewById(R.id.rank_text_view);
        ImageView ImageResource=(ImageView) convertView.findViewById(R.id.image);

        // Populate the data into the template view using the data object
        nBanglaWord.setText(currentWord.getmPersonName());
        nDefaultWord.setText(currentWord.getmRank());

        //check for image on different activity
        if(currentWord.hasImage()) {
            ImageResource.setImageResource(currentWord.getImageResourceId());

        }
        else {
            ImageResource.setVisibility(View.GONE);
        }
// @link to text conatianer linear layout that conatains both textViews
        View textCointainer=convertView.findViewById(R.id.text_container);

        //get the color from the activty resource
        int color= ContextCompat.getColor(getContext(),mColorResourceId);

        //set the background color of text container
        textCointainer.setBackgroundColor(color);

        // Return the completed view to render on screen
        return convertView;
    }
}