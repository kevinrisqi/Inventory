package com.zenai.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.zenai.inventory.model.Barang;

public class FormBarang extends AppCompatActivity {

    private EditText input_kode;
    private EditText input_nama;
    private EditText input_stok;

    public static final String BARANG_KEY = "barang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_barang);
        input_kode = findViewById(R.id.input_kode);
        input_nama = findViewById(R.id.input_nama);
        input_stok = findViewById(R.id.input_stok);
    }

    public void handleSubmit(View view) {
        String kode_barang = input_kode.getText().toString();
        String nama_barang = input_nama.getText().toString();
        int stok = Integer.parseInt(input_stok.getText().toString());
        Barang barang = new Barang(kode_barang,nama_barang,stok);
        Intent intent = new Intent(FormBarang.this,MasterBarang.class);
        intent.putExtra(BARANG_KEY,barang);
        startActivity(intent);
    }
}
