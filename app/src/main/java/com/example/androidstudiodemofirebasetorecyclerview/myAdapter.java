package com.example.androidstudiodemofirebasetorecyclerview;

import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myAdapter extends FirebaseRecyclerAdapter<model, myAdapter.myViewHolder> {
    public myAdapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull model model) {
        holder.tvName.setText(model.getName());
        holder.tvAltMobile.setText(model.getMobile());
        holder.tvAltMobile.setText(model.getAltMobile());
        holder.tvBalanceAmt.setText(model.getBalanceAmt());
        holder.tvDueAmt.setText(model.getDueAmt());
        holder.tvOrder.setText(model.getOrder());
        Glide.with(holder.img.getContext()).load(model.getDpUrl()).into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // return null;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow, parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        CircleImageView img;
        TextView tvName,tvMobile,tvAltMobile,tvBalanceAmt,tvDueAmt,tvOrder;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            img = (CircleImageView) itemView.findViewById(R.id.ivImg1);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvMobile = (TextView) itemView.findViewById(R.id.tvMobile);
            tvAltMobile = (TextView) itemView.findViewById(R.id.tvAltMobile);
            tvBalanceAmt = (TextView) itemView.findViewById(R.id.tvBalanceAmt);
            tvDueAmt = (TextView) itemView.findViewById(R.id.tvDueAmt);
            tvOrder = (TextView) itemView.findViewById(R.id.tvOrder);
        }
    }
}
