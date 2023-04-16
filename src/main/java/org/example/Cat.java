package org.example;

public class Cat extends Animal{

    @Override
    public void toSwim(int dlina) {
        if(dlina!=0){
            System.out.println(name+" не умеет плыть " + dlina+" м");
        }else{
            System.out.println(name+ " не поплыл");
        }
    }

    @Override
    public void toRun(int dlina) {
        if(dlina<=200 && dlina>0){
            System.out.println(name+" пробежал " + dlina+" м");
        }else{
            System.out.println(name + " не смог пробежать " + dlina+" м");
        }
    }

    public Cat(String name) {
        super(name);

    }
}
