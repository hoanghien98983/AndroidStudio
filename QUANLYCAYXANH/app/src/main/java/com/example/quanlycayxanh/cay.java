package com.example.quanlycayxanh;

public class cay {
    private String Ten;
    private String Mota;
    private int Hinh;

    public cay(String ten, String mota, int hinh){
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
