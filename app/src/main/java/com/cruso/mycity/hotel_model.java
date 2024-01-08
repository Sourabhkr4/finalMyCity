package com.cruso.mycity;

public class hotel_model {
    String hotel_name;
    String hotelDes;
    String hotelContact;

    int img;
    int icon1;
    int icon2;
    int icon3;


    public hotel_model(String hotel_name,String hotelDes,String hotelContact, int img,int icon1,int icon2,int icon3) {
        this.hotel_name = hotel_name;
        this.img = img;
        this.hotelDes= hotelDes;
        this.hotelContact=hotelContact;
        this.icon1=icon1;
        this.icon2=icon2;
        this.icon3=icon3;



    }

    public String getHotel_name() {
        return hotel_name;
    }

    public int getImg() {
        return img;
    }

    public String getHotelDes() {
        return hotelDes;
    }
    public String getHotelContact() {
        return hotelContact;
    }

    public  int getIcon1(){
        return icon1;
    }

    public  int getIcon2(){
        return icon2;
    }
    public  int getIcon3(){
        return icon3;
    }

}
