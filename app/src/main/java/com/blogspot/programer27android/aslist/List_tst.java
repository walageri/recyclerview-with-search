package com.blogspot.programer27android.aslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class List_tst extends AppCompatActivity {
    int namasurat[]={
            R.string.Al_Fatihah,R.string.Al_Baqarah,R.string.Ali_Imran,R.string.An_Nisa,R.string.Al_Maidah,R.string.Al_Anam,R.string.Al_Araf,R.string.Al_Anfal,R.string.At_Taubah,R.string.Yunus,
            R.string.Hud,R.string.Yusuf,R.string.Ar_Rad,R.string.Ibrahim,R.string.Al_Hijr,R.string.An_Nahl,R.string.Al_Israa,R.string.Al_Kahfi,R.string.Maryam,R.string.Thaha, R.string.Al_Anbiya,
            R.string.Al_Hajj,R.string.Al_Muminun,R.string.An_Nur,R.string.Al_Furqan,R.string.Asy_Syuara,R.string.An_Naml,R.string.Al_Qashash,R.string.Al_Ankabut,R.string.Ar_Rum, R.string.Luqman,
            R.string.As_Sajdah,R.string.Al_Ahzab,R.string.Saba,R.string.Fathir,R.string.Yasin,R.string.As_Shaffat,R.string.Shad,R.string.Az_Zumar,R.string.Ghafir, R.string.Fushshilat,R.string.Asy_Syura,
            R.string.Az_Zukhruf,R.string.Ad_Dukhan,R.string.Al_Jatsiyah,R.string.Al_Ahqaf,R.string.Muhammad,R.string.Al_Fath,R.string.Al_Hujurat,R.string.Qaf,R.string.Adz_Dzariyat, R.string.Ath_Thur,
            R.string.An_Najm,R.string.Al_Qamar,R.string.Ar_Rahman,R.string.Al_Waqiah,R.string.Al_Hadid,R.string.Al_Mujadalah,R.string.Al_Hasyr,R.string.Al_Mumtahanah,R.string.As_Shaff, R.string.Al_Jumuah,
            R.string.Al_Munafiqun,R.string.At_Taghabun,R.string.At_Thalaq,R.string.At_Tahrim,R.string.Al_Mulk,R.string.Al_Qalam,R.string.Al_Haqqah,R.string.Al_Maarij,R.string.Nuh, R.string.Al_Jin,
            R.string.Al_Muzammil,R.string.Al_Muddatsir,R.string.Al_Qiyamah,R.string.Al_Insan,R.string.Al_Mursalat,R.string.An_Naba,R.string.An_Naziat,R.string.Abasa,R.string.At_Takwir,R.string.Al_Infithar,
            R.string.Al_Muthaffifi,R.string.Al_Insyiqaq,R.string.Al_Buruj,R.string.At_Thariq,R.string.Al_Ala,R.string.Al_Ghosyiyah,R.string.Al_Fajr,R.string.Al_Balad,R.string.Asy_Syams,R.string.Al_Lail,
            R.string.Ad_Dhuha,R.string.Asy_Syarh,R.string.At_Tin,R.string.Al_Alaq,R.string.Al_Qadr,R.string.Al_Bayyinnah,R.string.Az_Zalzalah,R.string.Al_Adiyat,R.string.Al_Qariah,R.string.At_Takatsur,
            R.string.Al_Ashr,R.string.Al_Humazah,R.string.Al_Fil,R.string.Quraisy,R.string.Al_Maun,R.string.Al_Kautsar,R.string.Al_Kafirun,R.string.An_Nasr,R.string.Al_Masad,R.string.Al_Ikhlas,R.string.Al_Falaq,R.string.An_Nas
    };
    int download[]={
            R.string.alrahman001,R.string.alrahman002,R.string.alrahman003,R.string.alrahman004,R.string.alrahman005,
            R.string.alrahman006,R.string.alrahman007,R.string.alrahman008,R.string.alrahman009,R.string.alrahman010,
            R.string.alrahman011,R.string.alrahman012,R.string.alrahman013,R.string.alrahman014,R.string.alrahman015,
            R.string.alrahman016,R.string.alrahman017,R.string.alrahman018,R.string.alrahman019,R.string.alrahman020,
            R.string.alrahman021,R.string.alrahman022,R.string.alrahman023,R.string.alrahman024,R.string.alrahman025,
            R.string.alrahman026,R.string.alrahman027,R.string.alrahman028,R.string.alrahman029,R.string.alrahman030,
            R.string.alrahman031,R.string.alrahman032,R.string.alrahman033,R.string.alrahman034,R.string.alrahman035,
            R.string.alrahman036,R.string.alrahman037,R.string.alrahman038,R.string.alrahman039,R.string.alrahman040,
            R.string.alrahman041,R.string.alrahman042,R.string.alrahman043,R.string.alrahman044,R.string.alrahman045,
            R.string.alrahman046,R.string.alrahman047,R.string.alrahman048,R.string.alrahman049,R.string.alrahman050,
            R.string.alrahman051,R.string.alrahman052,R.string.alrahman053,R.string.alrahman054,R.string.alrahman055,
            R.string.alrahman056,R.string.alrahman057,R.string.alrahman058,R.string.alrahman059,R.string.alrahman060,
            R.string.alrahman061,R.string.alrahman062,R.string.alrahman063,R.string.alrahman064,R.string.alrahman065,
            R.string.alrahman066,R.string.alrahman067,R.string.alrahman068,R.string.alrahman069,R.string.alrahman070,
            R.string.alrahman071,R.string.alrahman072,R.string.alrahman073,R.string.alrahman074,R.string.alrahman075,
            R.string.alrahman076,R.string.alrahman077,R.string.alrahman078,R.string.alrahman079,R.string.alrahman080,
            R.string.alrahman081,R.string.alrahman082,R.string.alrahman083,R.string.alrahman084,R.string.alrahman085,
            R.string.alrahman086,R.string.alrahman087,R.string.alrahman088,R.string.alrahman089,R.string.alrahman090,
            R.string.alrahman091,R.string.alrahman092,R.string.alrahman093,R.string.alrahman094,R.string.alrahman095,
            R.string.alrahman096,R.string.alrahman097,R.string.alrahman098,R.string.alrahman099,R.string.alrahman100,
            R.string.alrahman101,R.string.alrahman102,R.string.alrahman103,R.string.alrahman104,R.string.alrahman105,
            R.string.alrahman106,R.string.alrahman107,R.string.alrahman108,R.string.alrahman109,R.string.alrahman110,
            R.string.alrahman111,R.string.alrahman112,R.string.alrahman113,R.string.alrahman114
    };
    int play[] ={
            R.string.play001, R.string.play002, R.string.play003, R.string.play004, R.string.play005,
            R.string.play006, R.string.play007, R.string.play008, R.string.play009, R.string.play010,
            R.string.play011, R.string.play012, R.string.play013, R.string.play014, R.string.play015,
            R.string.play016, R.string.play017, R.string.play018, R.string.play019, R.string.play020,
            R.string.play021, R.string.play022, R.string.play023, R.string.play024, R.string.play025,
            R.string.play026, R.string.play027, R.string.play028, R.string.play029, R.string.play030,
            R.string.play031, R.string.play032, R.string.play033, R.string.play034, R.string.play035,
            R.string.play036, R.string.play037, R.string.play038, R.string.play039, R.string.play040,
            R.string.play041, R.string.play042, R.string.play043, R.string.play044, R.string.play045,
            R.string.play046, R.string.play047, R.string.play048, R.string.play049, R.string.play050,
            R.string.play051, R.string.play052, R.string.play053, R.string.play054, R.string.play055,
            R.string.play056, R.string.play057, R.string.play058, R.string.play059, R.string.play060,
            R.string.play061, R.string.play062, R.string.play063, R.string.play064, R.string.play065,
            R.string.play066, R.string.play067, R.string.play068, R.string.play069, R.string.play070,
            R.string.play071, R.string.play072, R.string.play073, R.string.play074, R.string.play075,
            R.string.play076, R.string.play077, R.string.play078, R.string.play079, R.string.play080,
            R.string.play081, R.string.play082, R.string.play083, R.string.play084, R.string.play085,
            R.string.play086, R.string.play087, R.string.play088, R.string.play089, R.string.play090,
            R.string.play091, R.string.play092, R.string.play093, R.string.play094, R.string.play095,
            R.string.play096, R.string.play097, R.string.play098, R.string.play099, R.string.play100,
            R.string.play101, R.string.play102, R.string.play103, R.string.play104, R.string.play105,
            R.string.play106, R.string.play107, R.string.play108, R.string.play109, R.string.play110,
            R.string.play111, R.string.play112, R.string.play113, R.string.play114};
    ListView listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tst);
        listmenu=(ListView)findViewById(R.id.list_menu);
        Adaptersls adpt=new Adaptersls(getApplicationContext(),namasurat,download,play);
        listmenu.setAdapter(adpt);

        listmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent kirimdata = new Intent(getApplicationContext(), Detailtampilan.class);
                kirimdata.putExtra("ns", namasurat[position]);
                kirimdata.putExtra("dw", R.string.linkd1+download[position]);
                kirimdata.putExtra("pl", R.string.linkplay1+play[position]);
                kirimdata.putExtra("zp",R.string.linkd1+R.string.zip);

                Log.d("Info", "Masuk sini");
                startActivity(kirimdata);
            }
        });
    }
}
