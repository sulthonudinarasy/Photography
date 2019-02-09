package com.sulthon.photography;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private DataDummy dataDummy;

    public RecycleAdapter(DataDummy dataDummy) {
        this.dataDummy = dataDummy;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycle_item,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.ViewHolder holder, int position) {
        holder.txtName.setText(dataDummy.getListDataDummy().get(position));
    }

    @Override
    public int getItemCount() {
        return dataDummy.getListDataDummy().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
        }
    }
}
