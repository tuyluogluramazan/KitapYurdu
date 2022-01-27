# Selenium Test Otomasyon Ödevi

Merhaba bu projede Java dilinde Maven Page Object Model yapısıyla Selenium kütüphanesi,assertion’lar için junit , loglama için ise log4j kütüphanesi kullanılmıştır.

#### **Uyarı:** 

*Test aşamasında Login ekranında çok fazla tekrar yapınca Captcha doğrulaması yapılması gerekmektedir. Bu aşamayı kullanıcı kendi yapabilmektedir. Captcha doğrulaması ile karşılaşılırsa bu aşamayı manuel olarak geçmelisiniz.

**Ürün satın almada doğrulama ekranı gelmektedir. Bu aşamayı da manuel olarak atlayabilirsiniz.

### Gereksinimler:

| Programlama dili & Teknoloji | Kütüphane  |
| :--------------------------- | ---------- |
| Java(OOB) & POM              | Junit      |
| Maven                        | Log4j      |
|                              | Bonigarcia |

#### Test Senaryosu:

- Kitapyurdu Anasayfa açılır
- Login olunur
- Sayfaya login olması kontrolu yapılır
- Oyuncak ürünü aratılır
- Sayfada yer alan 7.ürüne scroll yapılır ve 4 ürün favorilerime eklenir
- Favorilere eklenmiş olması kontrolu yapılır
- Anasayfaya geri dönülür
- Puan Kataloguna gidilir
- Türk klasikleri seçilir
- Açılan sayfada filtreleme alanından “Yüksek Oylama” seçimi yapılır
- Tüm kitaplar>Hobi tıklanır
- Sayfadan random ürün seçimi yapılır sepete eklenir
- Listelerim>Favorilerim gidilir
- Favori Listesinde yer alan , 3.ürün silinir.(Favorilere eklenen 3.ürünün unique bir attribute’unu tutarak favorilere ekleyiniz, favori listesinden ilgili attribute lu ürünü siliniz)
- Sepetime gidilir
- Sepette ürün adedinde artırımı gerçekleştirilir
- Ürün satın al tıklanır
- Yeni adres bilgileri kaydedilir
- Bakiyesiz kart ile ürün alımı gerçekleştirilir.
- Hata mesajı alındığı görülür
- Logout olunur.



