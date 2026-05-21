package com.mycompany.tugas03;

public class MotorMatic extends Motor {
    private final int beratRoller;
    private final int rpmPerCvt;

    public MotorMatic(int id, String merk, String tipe, String warna, int tahun, int beratRoller, int rpmPerCvt) {
        super(id, merk, tipe, warna, tahun);
        this.beratRoller = beratRoller;
        this.rpmPerCvt = rpmPerCvt;
    }

    public void gantiKirian() {
        System.out.println("UPDATE spesifikasi_cvt SET roller=" + beratRoller + ", per_cvt=" + rpmPerCvt + " WHERE id_motor=" + id);
    }

    public String cekKecocokanPart() {
        return "SELECT status_cocok FROM pengecekan_part WHERE tipe_motor='" + tipe + "' AND tahun=" + tahun;
    }
}