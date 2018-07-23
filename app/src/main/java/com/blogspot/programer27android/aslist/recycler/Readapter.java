package com.blogspot.programer27android.aslist.recycler;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.blogspot.programer27android.aslist.R;
import java.util.ArrayList;
import java.util.List;

public class Readapter extends RecyclerView.Adapter<Readapter.MyHolder> {
    private List<Item> nmsurat;
    private Context context;


    public Readapter(List<Item> nmsurat,Context context) {
        this.nmsurat = nmsurat;
        this.context = context;
    }
    @NonNull
    @Override
    public Readapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vl= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.rccustom,parent,false);
        MyHolder mh=new MyHolder(vl);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull final Readapter.MyHolder holder, final int position) {
        holder.nms.setText(nmsurat.get(position).getNamasurats());
        holder.l.setText(nmsurat.get(position).getLinked());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent linksend = new Intent(c,DetailData.class);
                try {
                    //linksend.putExtra("nm", nmsurat.get(position).getNamaSurats());
                    //linksend.putExtra("lk", nmsurat.get(position).getLinked());
                    //context.startActivity(linksend);

                    Toast.makeText(context, nmsurat.get(position).getLinked(), Toast.LENGTH_SHORT).show();
                }catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(context, "Error data " + e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return nmsurat.size();
    }

    public void setFilter(List<Item> lsct){
        nmsurat=new ArrayList<>();
        nmsurat.addAll(lsct);
        notifyDataSetChanged();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        public TextView nms,l;
        public MyHolder(View itemView) {
            super(itemView);
            l=itemView.findViewById(R.id.lin);
            nms=itemView.findViewById(R.id.nama_surat);
        }
    }
}
