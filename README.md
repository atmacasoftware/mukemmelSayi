# Mükemmel Sayı Bulma Programı

### Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

İşlem adımları;
* `for` döngüsü ile 1 den başlayarak girilen sayı değerine kadar her seferinde 1 artış koşulu ile döngü oluşturulur.
* Döngü içerisinde `if` koşulu ile girilen sayının döngüde dönen i değeriyle modu alınır. Eğer mod sonucu 0 ise oluşturulan `int bolenSayiToplami` değişkenine aktarılarak ilgili sayılar toplanır.
* Döngü dışında yeni bir `if` koşulu ile `bolenSayiToplami == sayi` eşitliği kontrol edilir.
