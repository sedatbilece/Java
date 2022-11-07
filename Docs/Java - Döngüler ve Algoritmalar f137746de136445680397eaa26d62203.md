# Java - Döngüler ve Algoritmalar

Tarih: October 4, 2022 10:53 AM
Tip: KonuNotu

<aside>
☕ *`While num not be  0 sum integers if num 0 end to while loop`*

</aside>

```java
public class Main {
    public static void main(String[] args) {

        Scanner kb =new Scanner(System.in);

        System.out.println("Start entering number");

        int sum=0;
        int num;

        while( (num=Integer.parseInt(kb.nextLine())) !=0){
                sum+=num;

            System.out.printf("Sum : %d \n",sum);

        }
    }
}
```