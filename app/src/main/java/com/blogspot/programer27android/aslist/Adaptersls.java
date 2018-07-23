package com.blogspot.programer27android.aslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptersls extends BaseAdapter{
    Context c;
    int[] namasurat,download,play;
    public Adaptersls(Context context, int[] namasurat, int[] download, int[] play) {
        c=context;
        this.namasurat=namasurat;
        this.download=download;
        this.play=play;

    }

    @Override
    public int getCount() {
        return namasurat.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(R.layout.lscustom,null);
        TextView nmsurat=(TextView)view.findViewById(R.id.nama_surat);
        nmsurat.setText(namasurat[i]);
        return view;
    }
}
