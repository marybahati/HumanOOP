package com.example.humanoop;


import android.util.Log;

public class human{
    private String name;
    private int age;
   private int weight;


    public human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        Log.d("human","i am eating food");

    }
    public void sleep() {
        Log.d("human", "zzzzzzzzz");

    }

    public int sleep(int hours) {
         return Log.d("human","i am sleeping for"+ ' '+hours+ ' '+"hours");
    }
    public void speak(String speech){
        Log.d("human",speech);
    }

    public void birthday(){
        int age=getAge();
        age=age +1;
        setAge(age);

    }

//    public void hoot(String sound){
//        Log.d("human","not asleep");
//    }
}
