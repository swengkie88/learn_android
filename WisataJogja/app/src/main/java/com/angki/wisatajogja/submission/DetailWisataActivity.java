package com.angki.wisatajogja.submission;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWisataActivity extends AppCompatActivity {
    public static final String TITLE_WISATA = "title_wisata";
    public static final String DESKRIPSI_WISATA = "deskripsi_wisata";
    public static final String ALAMAT_WISATA = "alamat_wisata";
    public static final String JAMBUKA_WISATA = "jambuka_wisata";
    ImageView imageView;
    
    private String title = "Detail Activity";

    private void setActionBarTitle(String title){
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        imageView = findViewById(R.id.iv_foto_wisata);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            imageView.setImageResource(resId);
        }

        TextView tvTitleWisata = findViewById(R.id.tv_title_wisata);
        TextView tvDeskripsiWisata = findViewById(R.id.tv_deskripsi_wisata);
        TextView tvAlamatWisata = findViewById(R.id.tv_alamat_wisata);
        TextView tvJamBukaWisata = findViewById(R.id.tv_jambuka_wisata);


        String title = getIntent().getStringExtra(TITLE_WISATA);
        String deskripsi = getIntent().getStringExtra(DESKRIPSI_WISATA);
        String alamat = getIntent().getStringExtra(ALAMAT_WISATA);
        String jambuka = getIntent().getStringExtra(JAMBUKA_WISATA);

        tvTitleWisata.setText(title);
        tvDeskripsiWisata.setText(deskripsi);
        tvAlamatWisata.setText(alamat);
        tvJamBukaWisata.setText(jambuka);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        setActionBarTitle(title);
    }
}
