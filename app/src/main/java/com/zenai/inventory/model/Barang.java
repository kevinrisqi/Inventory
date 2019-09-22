package com.zenai.inventory.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Barang implements Parcelable {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode_barang, String nama_barang, int stok) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.stok = stok;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.kode_barang);
        dest.writeString(this.nama_barang);
        dest.writeInt(this.stok);
    }

    protected Barang(Parcel in) {
        this.kode_barang = in.readString();
        this.nama_barang = in.readString();
        this.stok = in.readInt();
    }

    public static final Parcelable.Creator<Barang> CREATOR = new Parcelable.Creator<Barang>() {
        @Override
        public Barang createFromParcel(Parcel source) {
            return new Barang(source);
        }

        @Override
        public Barang[] newArray(int size) {
            return new Barang[size];
        }
    };
}
