package com.sulthon.photography;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.sulthon.photography.api.PhotoItem;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private List<PhotoItem> photoItemList;

    RecycleAdapter(List<PhotoItem> data) {
        this.photoItemList = data;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.ViewHolder holder, int position) {
        holder.txtName.setText(photoItemList.get(position).getAuthor());
        holder.txtType.setText(photoItemList.get(position).getFormat());
        holder.txtUrl.setText(photoItemList.get(position).getPost_url());


        String url = "https://picsum.photos/300?image=" + photoItemList.get(position).getId();
        Picasso.get().load(url).into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return photoItemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtType, txtUrl;
        ImageView imgPhoto;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtType = itemView.findViewById(R.id.txt_type);
            txtUrl = itemView.findViewById(R.id.txt_url);
            imgPhoto = itemView.findViewById(R.id.img_photo);
        }
    }
}
