package com.job.conferenceapp;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
/**
 * Created by Job on 10/31/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.SpeakerViewHolder>{

    public static class SpeakerViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        SpeakerViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }
    List<Speaker>speakers;

    RVAdapter(List<Speaker> speakers){
        this.speakers = speakers;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public SpeakerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item, viewGroup, false);
        SpeakerViewHolder svh = new SpeakerViewHolder(v);
        return svh;
    }


    @Override
    public void onBindViewHolder(SpeakerViewHolder speakerViewHolder, int i) {
        speakerViewHolder.personName.setText(speakers.get(i).name);
        speakerViewHolder.personAge.setText(speakers.get(i).age);
        speakerViewHolder.personPhoto.setImageResource(speakers.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return speakers.size();
    }


}
