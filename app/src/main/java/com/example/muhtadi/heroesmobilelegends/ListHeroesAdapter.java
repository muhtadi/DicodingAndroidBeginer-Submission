package com.example.muhtadi.heroesmobilelegends;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Muhtadi on 23/04/2018.
 */

public class ListHeroesAdapter extends RecyclerView.Adapter<ListHeroesAdapter.CategoryViewHolder>{
    private Context context;

    public ArrayList<Heroes> getListHeroes() {
        return listHeroes;
    }
    public void setListHeroes(ArrayList<Heroes> listHeroes) {
        this.listHeroes = listHeroes;
    }

    private ArrayList<Heroes> listHeroes;

    public ListHeroesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_heroes, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {

        holder.tvName.setText(getListHeroes().get(position).getName());
        holder.tvCategory.setText(getListHeroes().get(position).getCategory());

        Glide.with(context)
                .load(getListHeroes().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListHeroes().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvCategory;
        ImageView imgPhoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_name);
            tvCategory = (TextView)itemView.findViewById(R.id.tv_category);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_photo);
        }
    }
}
