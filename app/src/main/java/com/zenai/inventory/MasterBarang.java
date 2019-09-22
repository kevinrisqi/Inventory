package com.zenai.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.zenai.inventory.model.Barang;

public class MasterBarang extends AppCompatActivity {

    private TextView text_kode_barang;
    private TextView text_nama_barang;
    private TextView text_stok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_barang);
        text_kode_barang = findViewById(R.id.text_kode_barang);
        text_nama_barang = findViewById(R.id.text_nama_barang);
        text_stok = findViewById(R.id.text_stok);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            Barang b = extras.getParcelable("barang");
            text_kode_barang.setText(b.getKode_barang());
            text_nama_barang.setText(b.getNama_barang());
            text_stok.setText(""+b.getStok());
        }
    }
}
