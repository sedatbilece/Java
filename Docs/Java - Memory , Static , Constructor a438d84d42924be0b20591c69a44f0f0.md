# Java - Memory , Static , Constructor

Tarih: October 6, 2022 1:31 PM
Tip: KonuNotu

![ss1.png](Java%20-%20Memory%20,%20Static%20,%20Constructor%20a438d84d42924be0b20591c69a44f0f0/ss1.png)

 

<aside>
💡 `Static` kod üzerinden örnekler

</aside>

```java
package org.statics;

public class Suv {

    int carKm;
    String name;

    static String carType="SUV";
    //common for all object

    static void print(){
       // this.carKm; //can not use this in static method
        System.out.println(carType);
    }

    public void value(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {

        Suv suv = new Suv();

        System.out.println(suv.carType);
        System.out.println(Suv.carType);//best practice
        System.out.println(carType);

        // static vs dynamic methods
        suv.value("Honda");
        print();
    }
}
```