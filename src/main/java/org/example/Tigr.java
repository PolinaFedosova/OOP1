package org.example;

public class Tigr extends Animal{
    @Override
    public void toSwim(int dlina) {
        if(dlina<0){
            System.out.println(name+" не смог проплыть " + dlina+" м");
        }else{
            System.out.println(name + " проплыл " + dlina+" м");
        }
    }

    @Override
    public void toRun(int dlina) {
        if(dlina>0){
            System.out.println(name+" пробежал " + dlina+" м");
        }else{
            System.out.println(name + " не смог пробежать " + dlina+" м");
        }
    }

    public Tigr(String name) {
        super(name);
    }
}
