package com.blogspot.programer27android.aslist.recycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.blogspot.programer27android.aslist.R;

public class DetailDownload extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_download);
        tv5=findViewById(R.id.zinp);
        tv4=findViewById(R.id.nmq);
        tv3=findViewById(R.id.playy);
        tv2=findViewById(R.id.linn);
        tv1=findViewById(R.id.n_surat);
        Intent terima=getIntent();
        tv1.setText(terima.getStringExtra("nm"));
        tv2.setText(terima.getIntExtra("lk",0));
        tv3.setText(terima.getIntExtra("pl",0));
        tv4.setText(terima.getStringExtra("nq"));
        tv5.setText(terima.getStringExtra("zp"));

    }
}
