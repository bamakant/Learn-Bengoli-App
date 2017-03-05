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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words=new ArrayList<Word>();

        words.add(new Word("Red","Lal",R.drawable.color_red));
        words.add(new Word("Yellow","Holood",R.drawable.color_mustard_yellow));
        words.add(new Word("Green","Sobuj",R.drawable.color_green));
        words.add(new Word("Gray","Khoyra",R.drawable.color_brown));
        words.add(new Word("White","Sada",R.drawable.color_white));
        words.add(new Word("Pink","Golapi",R.drawable.pink));
        words.add(new Word("Violet","Beguni",R.drawable.violet));
        words.add(new Word("Blue","Nil",R.drawable.blue));


        WordAdapter itemAdapter= new WordAdapter(this, words,R.color.category_colors);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(itemAdapter);
    }
}
