package com.example.baikt1;

public class congan {
    private String Ten;
    private String Mota;
    private int Hinh;

    public congan(String ten, String mota, int hinh){
        Ten = ten;
        Mota = mota;
        Hinh = hinh;
    }
    public String getTen(){
        return Ten;
    }
    public String getMota(){
        return Mota;
    }
    public int getHinh(){
        return Hinh;
    }
}
