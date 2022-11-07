# Static Factory method nedir ?

Tarih: October 6, 2022 2:37 PM
Tip: KonuNotu

farklı farklı constructorlar kullanmak yerine tek bir ctor tanımlayıp diğer işlevleri fonksiyonlarda tanımlayıp dönüşte nesneyi dönme işlemi

<aside>
☕ java örneği

</aside>

```java
class Color {
    private final int hex;
    Color(String rgb) {
        this(Integer.parseInt(rgb, 16));
    }
    Color(int red, int green, int blue) {
        this(red << 16 + green << 8 + blue);
    }
    Color(int h) {
        this.hex = h;
    }
}
// static factory method ile şu şekilde

//constructoru basit tutup işlev farklılıklarını methodlara atadık
class Color {
    private final int hex;
    static Color makeFromRGB(String rgb) {
        return new Color(Integer.parseInt(rgb, 16));
    }
    static Color makeFromPalette(int red, int green, int blue) {
        return new Color(red << 16 + green << 8 + blue);
    }
    static Color makeFromHex(int h) {
        return new Color(h);
    }
    private Color(int h) {
        return new Color(h);
    }
}
```

`şunu okudum`

[https://medium.com/i̇yi-programlama/effective-java-madde-1-constructor-yerine-statik-fabrika-metotlarını-kullanımı-9b881c496af4](https://medium.com/i%CC%87yi-programlama/effective-java-madde-1-constructor-yerine-statik-fabrika-metotlar%C4%B1n%C4%B1-kullan%C4%B1m%C4%B1-9b881c496af4)