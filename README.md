Leaflet Project Backend
Bu proje, Leaflet harita bileşenini kullanarak konum verilerini yönetmek için bir Java Spring Boot backend uygulamasıdır.

Kurulum
Java ve MySQL Kurulumu:

Bilgisayarınızda Java JDK ve MySQL yüklü olmalıdır.
Projeyi İndirin:

bash
```
git clone https://github.com/kullaniciadi/leaflet-project-backend.git
```
MySQL Veritabanı Oluşturma:

MySQL kullanarak bir veritabanı oluşturun veya var olan bir veritabanını kullanın.
Var olan leafletprojectdb_point.sql dosyasını veritabanınıza import edebilirsiniz.
MySQL Konfigürasyonu:

src/main/resources/application.properties dosyasını açın.
MySQL veritabanı bağlantı bilgilerini güncelleyin:
bash
```
spring.datasource.url=jdbc:mysql://localhost:3306/leafletprojectdb?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=root
spring.datasource.password=your_password
```
Kullanım
Uygulamayı Başlatma:

```
./mvnw spring-boot:run
```
API'ları Kullanma:

Leaflet harita bileşeninden gelen istekleri işlemek için RESTful API'lar mevcuttur.
Örnek API istekleri:
- Konumları getir: GET /points/get-all-points
- Konum kaydet: POST /points/save-point
- Konum sil: DELETE /points/delete/{id}
Swagger Erişimi:

Uygulama başladıktan sonra, Swagger arayüzüne erişmek için aşağıdaki URL'yi ziyaret edin:
```
http://localhost:8080/swagger-ui/
```
