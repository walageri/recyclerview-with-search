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
    private String namaqori,zipn;

    public Readapter(List<Item> nmsurat,Context context,String a,String zipnya) {
        this.nmsurat = nmsurat;
        this.context = context;
        namaqori=a;
        zipn=zipnya;
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
        holder.p.setText(nmsurat.get(position).getLinkep());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linksend = new Intent(context,DetailDownload.class);
                linksend.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    linksend.putExtra("nm", nmsurat.get(position).getNamasurats());
                    linksend.putExtra("lk", nmsurat.get(position).getLinked());
                    linksend.putExtra("pl",nmsurat.get(position).getLinkep());
                    linksend.putExtra("nq", namaqori);
                    linksend.putExtra("zp", zipn);
                    context.startActivity(linksend);
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
        public TextView nms,l,p;
        public MyHolder(View itemView) {
            super(itemView);
            p=itemView.findViewById(R.id.play);
            l=itemView.findViewById(R.id.lin);
            nms=itemView.findViewById(R.id.nama_surat);
        }
    }
}
