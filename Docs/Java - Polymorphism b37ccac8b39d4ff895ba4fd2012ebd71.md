# Java - Polymorphism

Tarih: October 13, 2022 11:55 AM
Tip: KonuNotu

### Compile time zamanında gerçekleştirilen polymorphism çeşidi

---

<aside>
🌟 overloading

</aside>

methodun parametreleri değiştirilerek aynı isimde farklı fonksiyon oluşturmak

```java
package org.example;

public class Main {
    public static void main(String[] args) {
          sum(5,3);
          sum("6","11");
          sum("x",4,9);
    }
    public static void sum (int a,int b){
        System.out.println(a+b);
    }
    public static void sum (String a,String b){//OVERLOADİNG İŞLEMİ
        System.out.println(a+b);
    }
    public static void sum (String c, int a,int b){//OVERLOADİNG İŞLEMİ
        System.out.println(c+": "+(a+b ));
    }

}
```

<aside>
🌟 Override

</aside>

başka bir yerde kullanılan method parametreleri aynı ise eziliyor ve yeniden yazılıyor

genelde sub classlar parent classdan gelen fonksiyonları kendine modifiye etmek için kullanır.

```java
package org.example;

public class Employee {
    public static final int MIN_WAGE=4000;
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public void work(){
        System.out.println(name+" is working ...");
    }
    public int calSalary(){
        return MIN_WAGE;
    }
}
```

```java
package org.example;

public class Engineer extends Employee{
    public Engineer(String name) {
        super(name);
    }
    @Override
    public int calSalary(){//OVERRIDE İŞLEMİ
        return 6000;
    }
}
```

<aside>
🌟 Downcasting

</aside>

```java
Employee employee2 = new Engineer("sedat3");//downcasting

((Engineer) employee2).someDo();// sub class methoda erişim

//HATA
Employee employee3 = new Employee("sedat4");//downcasting
        ((Engineer) employee3).someDo();//HATA
//employee3 Engineer özellikleri taşımadığı için hata alınır
```