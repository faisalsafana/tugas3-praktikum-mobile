package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterGunung extends RecyclerView.Adapter<AdapterGunung.ViewHolder> {
    private Context context;
    private ArrayList<ModelGunung> ModelGunungs;

    public AdapterGunung(Context context) {
        this.context = context;
    }

    public ArrayList<ModelGunung> getModelGunungs() {
        return ModelGunungs;
    }

    public void setModelGunungs(ArrayList<ModelGunung> ModelGunungs) {
        this.ModelGunungs = ModelGunungs;
    }

    @NonNull
    @Override
    public AdapterGunung.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gunung,viewGroup,false);
        return new ViewHolder(itRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(getModelGunungs().get(i).getLambangTeam()).into(viewHolder.ivLambangTeam);
        viewHolder.tvNamateam.setText(getModelGunungs().get(i).getNamaTeam());
        viewHolder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getModelGunungs().get(i).getPrivew());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });

        viewHolder.visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("logo", getModelGunungs().get(i).getLambangTeam());
                intent.putExtra("nama", getModelGunungs().get(i).getNamaTeam());
                intent.putExtra("preview", getModelGunungs().get(i).getPrivew());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getModelGunungs().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivLambangTeam;
        private TextView tvNamateam;
        private Button share;
        private Button visit;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivLambangTeam = itemView.findViewById(R.id.IV);
            tvNamateam = itemView.findViewById(R.id.nama_team);
            share = itemView.findViewById(R.id.btn_share);
            visit = itemView.findViewById(R.id.btn_preview);
        }
    }
}
