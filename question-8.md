**HIBERNATE, JPA VE SPRING DATA FRAMEWORKLERİ**

Her biri, Java nesneleri ile veritabanı arasındaki etkili bir ilişki sağlamak için kullanılır.

**Hibernate:**

Hibernate, Java tabanlı bir ORM (Object-Relational Mapping) çerçevesidir. ORM, nesne yönelimli programlamadaki nesneleri ilişkisel veritabanındaki tablolarla eşleme prensibini temsil eder. Java nesnelerini veritabanı tablolarına ve sütunlarına otomatik olarak eşler. Bu, veritabanı tablolarını Java sınıfları ve nesneleri ile temsil etmenizi sağlar. Hibernate’in temelini, bir veritabanı tablosu ile ilişkilendirilmiş bir Java sınıfı olan “Entity”ler oluşturur. Bu sınıflar, veritabanındaki tabloya karşılık gelir. Hibernate, bu Entity’leri kullanarak sorguları oluşturmanıza, veritabanına kaydetmenize, güncellemenize ve sorguları yürütmenize olanak tanır.

- HQL (Hibernate Query Language) aracılığıyla veritabanı sorguları oluşturulmasını sağlar. Bu veritabanı sorgularının sonuçlarını önbelleğe alarak performansı artırır.
- Yalnızca ihtiyaç duyulduğunda veritabanından veri yükleyerek bellek kullanımını optimize eder.(Lazy Loading)

**JPA(Java Persistence API):**

JPA, Java EE (Enterprise Edition) standartlarına dahil bir spesifikasyondur ve ORM çerçevelerinin standart birleşim noktasını sağlar. Hibernate, EclipseLink, OpenJPA gibi çeşitli ORM frameworkleri, JPA spesifikasyonunu uygular. JPA, Java uygulamalarının veritabanı işlemlerini standart bir şekilde gerçekleştirmesine olanak tanır. Bu sayede uygulama, ORM çerçevesi değişse bile aynı JPA arayüzünü kullanarak veritabanı işlemlerini gerçekleştirebilir. Entity sınıflarını kullanarak veritabanı etkileşimlerini yönetir. JPA’nın temel konseptleri arasında Entity sınıfları, EntityManager, JPQL (Java Persistence Query Language) gibi öğeler bulunur. JPA, ayrıca ilişkisel veritabanı modellemesi, bağlantı yönetimi gibi konularda da standartlar belirler.

**Spring Data:**

Spring Data, Spring framework ekosisteminin bir parçasıdır ve çeşitli veritabanları ve depolama teknolojileriyle etkileşim kurmak için soyutlama katmanı sağlar.

- Farklı veritabanları (MySQL, PostgreSQL, MongoDB vb.) ile aynı arayüzü kullanarak çalışmanıza olanak tanır ve kod tutarlılığı sağlar. Bu sayede kod belirli bir veritabanına bağımlı hale gelmez.
- Create (ekleme), Read (okuma), Update (güncelleme) ve Delete (silme) işlemlerini standart arayüzlerle gerçekleştirmenizi sağlar. JPA spesifikasyonunu destekler ve veritabanı tablolarını Java sınıflarına eşleme işlemini kolaylaştırır
- Sadece ilişkisel veritabanlarını değil, NoSQL veritabanlarını (MongoDB, Cassandra vb.) da destekler.
- Bakım kolaylığı sağlar. 
