package org.example;

public class Engineer extends Employee{
    public Engineer(String name) {
        super(name);
    }

    @Override
    public int calSalary(){
        System.out.println(super.name);
        return 6000;
    }

    @Override
    public void work() {
        super.work();//parent classın aynısını kullanır
    }


    public void someDo(){
        System.out.println("engineer do something");
    }
}
