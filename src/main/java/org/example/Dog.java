package org.example;

public class Dog extends Animal{
    @Override
    public void toSwim(int dlina) {
        if(dlina<=10 && dlina>0){
            System.out.println(name + " проплыл " + dlina+" м");
        }else{
            System.out.println(name+" не смог проплыть " + dlina+" м");
        }
    }

    @Override
    public void toRun(int dlina) {
        if(dlina<=500 && dlina>0){
            System.out.println(name+" пробежал " + dlina+" м");
        }else{
            System.out.println(name + " не смог пробежать " + dlina+" м");
        }
    }

    public Dog(String name) {
        super(name);
    }
}
