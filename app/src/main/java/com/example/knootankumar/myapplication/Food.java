package com.example.knootankumar.myapplication;

public class Food {

    String item1 , item2, special;

    public Food()
    {

    }


    public Food(String item1,String item2,String special) {
        this.item1 = item1;
        this.item2 = item2;
        this.special = special;
    }


    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }


    public String getSpecial() {
        return special;
    }

}
