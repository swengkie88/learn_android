package com.angki.wisatajogja.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.angki.wisatajogja.submission.adapter.ListWisataAdapter;
import com.angki.wisatajogja.submission.model.Wisata;
import com.angki.wisatajogja.submission.model.WisataData;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list);
        rvWisata.setAdapter(listWisataAdapter);

        listWisataAdapter.setOnItemClickCallback(new ListWisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Wisata data) {
                showSelectedWisata(data);
            }
        });
    }

    private void showSelectedWisata(Wisata wisata) {
        Intent moveWithDataIntent = new Intent(MainActivity.this, DetailWisataActivity.class);


        moveWithDataIntent.putExtra("resId", wisata.getPhoto());
        moveWithDataIntent.putExtra(DetailWisataActivity.TITLE_WISATA, wisata.getName());
        moveWithDataIntent.putExtra(DetailWisataActivity.DESKRIPSI_WISATA, wisata.getDetail());
        moveWithDataIntent.putExtra(DetailWisataActivity.ALAMAT_WISATA, wisata.getAlamat());
        moveWithDataIntent.putExtra(DetailWisataActivity.JAMBUKA_WISATA, wisata.getJamBuka());

        startActivity(moveWithDataIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMenu) {
        switch (selectedMenu) {
            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutDev.class);
                startActivity(moveIntent);
                break;
        }
    }

}
