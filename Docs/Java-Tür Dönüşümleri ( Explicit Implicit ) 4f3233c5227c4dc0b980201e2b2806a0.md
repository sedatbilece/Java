# Java-Tür Dönüşümleri ( Explicit Implicit )

Tarih: October 4, 2022 12:08 PM
Tip: KonuNotu

cast işlemi ⇒ çevirme işlemlerinde  

<aside>
☕ 1.Primitive to Primitive

</aside>

> 1.1 Widening (no cast)
> 

byte → short→ int→ long→ float→ double

```java
int i2=10;
double d2=i2;
System.out.println(d2);//10.0
```

> 1.2 Narrowing (necessary cast)
> 

byte ← short  ← int  ← long  ← float  ← double

```java
        int i1;
        double d1=5.2;
        i1 = (int) d1;//cast işlemi
        System.out.println(i1);//5
```

```java
         int ch1='A';
        int i3=ch1;
        System.out.println(i3);//65
```

```java
        float f1=65f;
        char ch2 = (char) f1;
        System.out.println(ch2);//A
```

```java
        int fah =100;
        int cel = (int) ((fah-32)*5.0/9.0);//int*double =double
        System.out.println(cel);//37
```

> 1.3 Details
> 

long-float and double

<aside>
☕ 2. String to Primitive or Primitive to String

</aside>

```java
int i5=65;
        //String str1= String.valueOf(i5);
        //String str1 = Integer.toString(i5);
        String str1 =""+i5;
        System.out.println(str1);

        String str2="5";
        int i6=Integer.parseInt(str2);
        System.out.println(i6);
```