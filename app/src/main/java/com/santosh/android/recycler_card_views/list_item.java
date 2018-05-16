package com.santosh.android.recycler_card_views;

public class list_item {

    private String name1;
    private String contact;
    private String age;
    private String gender;

    public list_item(String name1, String contact, String age, String gender) {
        this.name1 = name1;
        this.contact = contact;
        this.age = age;
        this.gender = gender;
    }

    public String getName1() {
        return name1;
    }

    public String getContact() {
        return contact;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
