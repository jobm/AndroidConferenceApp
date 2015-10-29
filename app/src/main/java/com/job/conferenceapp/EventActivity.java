package com.job.conferenceapp;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.GridLayout;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Job on 10/29/2015.
 */
public class EventActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_items);

        GridLayout speakers = (GridLayout)findViewById(R.id.speakers);
        speakers.setOnClickListener(this);

        GridLayout agenda = (GridLayout)findViewById(R.id.agenda);
        agenda.setOnClickListener(this);

        GridLayout info = (GridLayout)findViewById(R.id.info);
        info.setOnClickListener(this);

        GridLayout twitter = (GridLayout)findViewById(R.id.twitterfeed);
        twitter.setOnClickListener(this);
    }
    private void GridClick(){
        startActivity(new Intent(getBaseContext(),EventsItemsTab.class));
    }
    public void onClick(View v) {
        switch (v.getId())
        {
            case  R.id.speakers:
                GridClick();
                break;

            case  R.id.agenda:
                GridClick();
                break;

            case  R.id.info:
                GridClick();
                break;

            case  R.id.twitterfeed:
                GridClick();
                break;
        }
    }

}

