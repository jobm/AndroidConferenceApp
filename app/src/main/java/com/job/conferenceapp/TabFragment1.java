package com.job.conferenceapp;

import android.nfc.Tag;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**import android.content.Intent;
 * Created by Job on 10/29/2015.
 */
public class TabFragment1 extends Fragment {

    private List<Speaker> speakers;
    private RecyclerView rv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tab_fragment_1, container, false);

        rv = (RecyclerView) view.findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

        return view;
    }

    private void initializeData(){
        speakers = new ArrayList<>();
        speakers.add(new Speaker("Emma Wilson", "23 years old", R.drawable.splash_screen));
        speakers.add(new Speaker("Lavery Maiss", "25 years old", R.drawable.splash_screen));
        speakers.add(new Speaker("Lillie Watts", "35 years old", R.drawable.splash_screen));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(speakers);
        rv.setAdapter(adapter);
    }

}
