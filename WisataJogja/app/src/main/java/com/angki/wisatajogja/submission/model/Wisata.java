package com.angki.wisatajogja.submission.model;

public class Wisata {
    private String name;
    private String detail;
    private String alamat;
    private String jambuka;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJamBuka() {
        return jambuka;
    }

    public void setJamBuka(String jambuka) {
        this.jambuka = jambuka;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
