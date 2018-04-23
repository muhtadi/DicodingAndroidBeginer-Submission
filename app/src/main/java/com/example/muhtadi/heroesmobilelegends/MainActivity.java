package com.example.muhtadi.heroesmobilelegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Heroes> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = (RecyclerView)findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(HeroesData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroesAdapter listHeroesAdapter = new ListHeroesAdapter(this);
        listHeroesAdapter.setListHeroes(list);
        rvHeroes.setAdapter(listHeroesAdapter);

        ItemClickSupport.addTo(rvHeroes).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedHeroes(list.get(position));
            }
        });
    }

    private void showSelectedHeroes(Heroes heroes){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("name", heroes.getName());
        intent.putExtra("category", heroes.getCategory());
        intent.putExtra("image", heroes.getImage());
        intent.putExtra("story", heroes.getStory());
        startActivity(intent);
    }
}
