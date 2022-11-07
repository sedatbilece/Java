# Java - Methodlar

Tarih: October 4, 2022 10:30 AM
Tip: KonuNotu

![ss1.png](Java%20-%20Methodlar%20e2ce33d725834385a4729da1c81dd169/ss1.png)

```java

    static void writeMessage(String msg){
        System.out.println(msg);
    }
    static void sayHello(){
        System.out.println("helllo !");
    }
```

<aside>
☕ aynı isimde farklı parametreli method olabilir `(overloading)`

</aside>

```java
static int sum(int x1,int x2){
        return x1+x2;
    }
    static int sum(int x1,int x2,int x3){
        return x1+x2+x3;
    }
```