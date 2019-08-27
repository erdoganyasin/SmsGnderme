package com.example.yasin.smsgnderme;

public class Model {

    private String isim;
    private String tel;

    public Model(String isim, String tel) {
        this.isim = isim;
        this.tel = tel;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
