# Java - Sınıflarda Blok ve Değişkenlerin Oluşma Sırası

Tarih: October 12, 2022 3:06 PM
Tip: KonuNotu

[What is the order of execution when static initializer and inheritance is involved in JAVA?](https://stackoverflow.com/questions/34014555/what-is-the-order-of-execution-when-static-initializer-and-inheritance-is-involv)

<aside>
🌟 static içeren ve extendli classların oluşma sırası

</aside>

```java
public class A {
    static{
        System.out.print("A"); //**1**
    }

    A(){
        System.out.print("a"); //3
    }
}

public class B extends A {
    static{
        System.out.print("B"); //2
    }

    B(){
        System.out.print("b"); //4
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}
```

öncelikle B → A ‘ya bağlı bu nedenle B’yi almadan önce A’yı alması gerekir.

A’nın static’i oluşur . (classlar oluşur) 

B’nin static’i oluşur.(classlar oluşur) 

A’nın ctor çağrılır. (nesne oluşur) 

B’nin ctor çağrılır.  (nesne oluşur)