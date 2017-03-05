package com.example.android.miwok;

/**
 * Created by BAMA KANT KAR on 23-Dec-16.
 */

public class Word {

    private String mBanglaWord;
    private String mDefaultWord;
    private int ImageResourceId=NO_IMAGE_PROVIDED;

    public static final int NO_IMAGE_PROVIDED=-1;

    public Word(String PersonName, String Rank){
        mBanglaWord=PersonName;
        mDefaultWord=Rank;
    }
    //@param bword and dword are for two text data
    //@param ImageId is for drable image resource


    public Word(String PersonName, String Rank, int imageresourceid){
        mBanglaWord=PersonName;
        mDefaultWord=Rank;
        ImageResourceId=imageresourceid;
    }

    public String getmPersonName(){
        return mBanglaWord;
    }

    public String getmRank(){
        return mDefaultWord;
    }

    public int getImageResourceId(){
        return ImageResourceId;
    }

    public boolean hasImage(){
     return ImageResourceId!=NO_IMAGE_PROVIDED;
    }

}
