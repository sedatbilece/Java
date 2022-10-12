package org.test2;

public class Cat  extends Animal{


    Cat(){
        super("cat ctor");
    }

    public Cat(String vsk) {
        super(vsk);
    }



    @Override
    void makeVoice() {
        System.out.println("cat miyavvvv");
    }
}
