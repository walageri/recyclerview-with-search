package com.blogspot.programer27android.aslist;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

class Detailtampilan extends AppCompatActivity{
    EditText nSurat,Downloadn,playn,zipn;
    Intent getData;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.tampilan);
        nSurat=findViewById(R.id.nssurat);
        Downloadn=findViewById(R.id.downloadnya);
        playn=findViewById(R.id.playnya);
        zipn=findViewById(R.id.zipnya);
        Intent terima=getIntent();
        getData=terima;
        nSurat.setText(terima.getIntExtra("ns",0));
        Downloadn.setText(terima.getIntExtra("dw",0));
        playn.setText(terima.getIntExtra("pl",0));
        zipn.setText(terima.getStringExtra("zp"));
    }

}
