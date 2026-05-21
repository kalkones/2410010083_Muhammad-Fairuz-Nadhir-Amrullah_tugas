package com.mycompany.tugas03;

public class Motor {
    protected int id;
    protected String merk;
    protected String tipe;
    protected String warna;
    protected int tahun;

    public Motor() {
        this.id = 0;
        this.merk = "Belum Diisi";
        this.tipe = "-";
        this.warna = "-";
        this.tahun = 0;
    }

    public Motor(int id, String merk) {
        this.id = id;
        this.merk = merk;
        this.tipe = "-";
        this.warna = "-";
        this.tahun = 0;
    }

    public Motor(int id, String merk, String tipe, String warna, int tahun) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void create() {
        System.out.println("INSERT INTO motor (id, merk, tipe, warna, tahun) VALUES (?, ?, ?, ?, ?)");
    }

    public void store() {
        System.out.println("INSERT INTO motor (id, merk, tipe, warna, tahun) VALUES (" + id + ", '" + merk + "', '" + tipe + "', '" + warna + "', " + tahun + ")");
    }

    public String read() {
        return "SELECT * FROM motor WHERE id=" + id;
    }

    public void update() {
        System.out.println("UPDATE motor SET merk='" + merk + "', tipe='" + tipe + "', warna='" + warna + "', tahun=" + tahun + " WHERE id=" + id);
    }

    public void delete() {
        System.out.println("DELETE FROM motor WHERE id=" + id);
    }
}