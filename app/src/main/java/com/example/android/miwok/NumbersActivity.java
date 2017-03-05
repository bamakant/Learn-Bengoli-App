/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.graphics.Color.YELLOW;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words=new ArrayList<Word>();


        words.add(new Word("One","Ek", R.drawable.number_one));
        words.add(new Word("Two","Dui",R.drawable.number_two));
        words.add(new Word("Three","Tin",R.drawable.number_three));
        words.add(new Word("Four","Char",R.drawable.number_four));
        words.add(new Word("Five","Panch",R.drawable.number_five));
        words.add(new Word("Six","Choy",R.drawable.number_six));
        words.add(new Word("Seven","Sath",R.drawable.number_seven));
        words.add(new Word("Eight","Aath",R.drawable.number_eight));
        words.add(new Word("Nine","Noy",R.drawable.number_nine));
        words.add(new Word("Ten","Dos",R.drawable.number_ten));

        WordAdapter itemAdapter= new WordAdapter(this, words,R.color.category_numbers);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer=MediaPlayer.create(NumbersActivity.this,R.raw.end);
                mediaPlayer.start();
            }
        });

    }
}
