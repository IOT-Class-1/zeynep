package com.example.Inheritance;

public class Engineer extends Employee{ //Mühendis sınıf miras alıyorPersonel sınıfından

    public Engineer(String name, double salary, int age) {
        super(name, salary, age);  //isim, maaş ve yaş bilgilerini personel sınıfından
                                   // miras aldığı için "super" anahtar kelimesi ile çağırıyoruz.
    }

    public double getAnnualBonus(){
        return super.salary * .05;
    }
}
