package com.cruso.mycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class hotelAdapter extends RecyclerView.Adapter<hotelAdapter.MyViewHolder> {
    final hotel_interface h_interface;
    Context context;
    ArrayList<hotel_model> h_models;






    public hotelAdapter(Context context, ArrayList<hotel_model> h_models, hotel_interface h_interface ){
        this.context=context;
        this.h_models=h_models;

        this.h_interface=h_interface;

    }
    @NonNull
    @Override
    public hotelAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.hotel_row,parent, false);
        return new hotelAdapter.MyViewHolder(view, h_interface);
    }

    @Override
    public void onBindViewHolder(@NonNull hotelAdapter.MyViewHolder holder, int position) {
        holder.tvname.setText(h_models.get(position).getHotel_name());
        holder.imageView.setImageResource(h_models.get(position).getImg());


    }

    @Override
    public int getItemCount() {

        return h_models.size();
    }




    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tvname;

        public MyViewHolder(@NonNull View itemView,hotel_interface h_interface) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView3);
            tvname=itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(h_interface!=null){
                        int pos=getAdapterPosition();
                        if(pos!=RecyclerView.NO_POSITION){
                            h_interface.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }
}
