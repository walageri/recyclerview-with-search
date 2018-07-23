package com.blogspot.programer27android.aslist.recycler;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.blogspot.programer27android.aslist.R;
import java.util.ArrayList;
import java.util.List;

public class Recyclers extends AppCompatActivity {
    SearchView scV;
    List<Item> ls=new ArrayList<>();
    Readapter adapter;

    RecyclerView recayclerView;
    RecyclerView.LayoutManager layoutManager;
    private void list(){
        ls.add(new Item("nama1 ebg",R.string.alrahman001));
        ls.add(new Item("nama2 ach",R.string.alrahman002));
        ls.add(new Item("nama3 bdi",R.string.alrahman003));
        ls.add(new Item("nama4 cej",R.string.alrahman004));
        ls.add(new Item("nama5 dfk",R.string.alrahman005));
        ls.add(new Item("nama6 egl",R.string.alrahman006));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycl_tst);
        recayclerView = findViewById(R.id.r);
        list();
        recayclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recayclerView.setLayoutManager(layoutManager);

        adapter=new Readapter(ls,getApplicationContext());
        recayclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search,menu);
        final MenuItem menuItem=menu.findItem(R.id.search);
        scV=(SearchView) menuItem.getActionView();
        changeSearchViewTextColor(scV);
        ((EditText)scV.findViewById(android.support.v7.appcompat.R.id.search_src_text))
                .setHintTextColor(getResources().getColor(R.color.putih));
        scV.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(!scV.isIconified()){
                    scV.setIconified(true);
                }
                menuItem.collapseActionView();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                final List<Item> filtermodel=filter(ls,newText);
                adapter.setFilter(filtermodel);
                return true;
            }
        });
        return true;
    }
    private List<Item> filter(List<Item> lsar,String query){
        query=query.toLowerCase();
        final List<Item> filteredmodel=new ArrayList<>();
        for (Item model:lsar){
            final String text=model.getNamasurats().toLowerCase();
            if (text.startsWith(query)){
                filteredmodel.add(model);
            }
        }
        return filteredmodel;
    }
    private void changeSearchViewTextColor(View v){
        if (v!=null){
            if (v instanceof TextView){
                ((TextView)v).setTextColor(Color.BLACK);
            return;
            }else if (v instanceof ViewGroup){
                ViewGroup vg=(ViewGroup) v;
                   for (int i = 0;i < vg.getChildCount(); i++){
                        changeSearchViewTextColor(vg.getChildAt(i));
                }
            }
        }
    }
}
