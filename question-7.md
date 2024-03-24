**API GATEWAY, SERVICE DISCOVERY VE LOAD BALANCER**

**API Gateway:**

API'lar için tek bir giriş noktası sağlayarak, API'ları yönetmeyi ve korumayı kolaylaştırır. API'ları kimlik doğrulama, yetkilendirme ve diğer güvenlik mekanizmaları aracılığıyla güvenli hale getirir.

- Gelen API isteklerini uygun hizmetlere yönlendirir.
- API isteklerini kimlik doğrulama ve yetkilendirme süreçlerinden geçirir.
- API kullanımını sınırlar ve aşırı kullanımı önler.
- API'leri kötü niyetli kullanımlara ve saldırılara karşı korur.
- Sıkça yapılan isteklerin yanıtlarını önbelleğe alarak performansı artırır.
- API'ları otomatik olarak ölçeklendirerek artan trafikle başa çıkmaya yardımcı olur.
- API kullanımını izler ve loglar, bu sayede kullanım desenleri ve potansiyel sorunlar hakkında bilgi sağlar.

**Service Discovery:**

- Hizmetlerin manuel olarak yapılandırılmasına gerek kalmadan, otomatik olarak bulunmasını ve bağlanmasını sağlar.
- Birden fazla hizmet örneği varsa, istemcileri otomatik olarak kullanılabilir bir örneğe yönlendirir.
- Trafiği birden fazla hizmet örneği arasında dağıtarak yükü dengelemeye yardımcı olur.

Service discovery temel olarak üç kavram üzerinde durmaktadır:

**Discovery:** Hizmetlerin dinamik bir ortamda cluster içerisindeki diğer hizmetler ile iletişim kurabilmeleri için, birbirlerinin IP ve port bilgilerini bulmasını sağlar.

**Health Check:** Sadece ayakta olan hizmetlerin sistemde kalmaları, diğerlerinin ise dinamik bir şekilde sistem dışı kalmalarını sağlar.

**Load balancing:** Bir hizmete gelmiş olan request’in, bu hizmeti sağlayan diğer instance’lara da dinamik olarak dağıtılmasını sağlar.

Service discovery’i uygulayabilmek için “Client-side service discovery” ve “Server-side service discovery” olmak üzere iki farklı pattern bulunmaktadır:

**Client-side Discovery**: Service instance’ları, kendi network location’larını Service Registry üzerine kayıt ederler. Bu sayede, buradaki servislere, hangi IP ve port üzerinden erişilebileceği bilgisi service registry üzerinde bulunur. Client ise herhangi bir request’i göndermeden önce service registry’e gelerek, request göndermek istediği servisin location bilgilerini elde eder ve o bilgiler doğrultusunda request işlemini gerçekleştirir.

**Server-side Discovery**: Client ilk olarak service registry ile konuşmak yerine direkt olarak load balancer ile konuşur. Load balancer ise service registry üzerinden ilgili servisin location bilgilerini alarak, route işlemini kendisi gerçekleştirmektedir.

**Load Balancer:**

Load balancer'lar, genellikle yazılım tabanlı veya donanım tabanlı olarak uygulanabilir. Yazılım tabanlı load balancer'lar, esneklik ve ölçeklenebilirlik sağlar ve bulut tabanlı hizmetlerde yaygın olarak kullanılır. Örneğin, Kubernetes gibi kapsayıcı yönetim platformları, load balancer'ları dahili olarak sağlar.

- Gelen istekleri belirli bir mikroservise yönlendirir. Bu, belirli bir mikroservisin yük altında kalmamasını ve diğerlerine kıyasla daha fazla yükü üstlenmemesini sağlar. Farklı mikroservis örnekleri arasında yükü dengeler. Eğer bir mikroservis örneği yoğun bir yüke maruz kalırsa, load balancer bu mikroservisin üzerine binen yükü azaltmak için trafiği diğer örnekler arasında yeniden dağıtabilir.
- Bir mikroservis örneği yanıt vermez hale geldiğinde, trafik yönlendirmesini diğer sağlıklı örnekler arasında yeniden düzenleyerek hata toleransını ve yedekleme mekanizmasını sağlar.

