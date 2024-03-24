**DOCKER VE SANAL MAKİNE(VM)**

**Sanal Makine(VM):** 

Sanal makine(VM), bir bilgisayarın sanal bir kopyasıdır. Kendi işletim sistemine, donanım kaynaklarına(CPU, RAM) ve yazılımlarına sahiptir. Birden fazla işletim sistemini tek bir fiziksel makinede çalıştırmanıza olanak sağlar. Tam donanımlı ayrı bir bilgisayar gibi davranır.

**Sanal Makinelerin Avantajları:**

- Windows işletim sistemine sahip bir bilgisayarda Linux veya macOS gibi farklı işletim sistemleri sanal makine kullanılarak çalıştırılabilir. Yeni bir yazılımı farklı bir ortamda çalıştırmak ve test etmek için sanal makine kullanılabilir.
- Sanal makineler, ana bilgisayardan izole edilmiş bir ortamda çalıştığı için güvenli bir ortam oluşturulur.

**Sanal Makinelerin Dezavantajları:**

- Sanal makineler, ana bilgisayarın donanım kaynaklarını(CPU, RAM) kullanır. Bu nedenle, sanal makineler ana bilgisayarın performansını düşebilir.

**Docker:** 

Docker, uygulamaları paketlemek ve dağıtmak için kullanılan bir platformdur. Uygulamayı, kütüphaneler ve bağımlılıkları ile birlikte bir "container" içerisinde çalıştırır. Bu container'lar, ana işletim sisteminin çekirdeğini paylaşır. Var olan işletim sisteminin üzerinde izole edilmiş bir ortamda uygulamayı çalıştırır.

**Docker'ın Avantajları:**

- Docker container'ları, daha hafif ve hızlıdırlar. Saniyeler içinde oluşturulabilir ve dağıtılabilir. Sanal makinelerden daha az kaynak tüketirler.
- Herhangi bir işletim sisteminde çalıştırılabilir. 

**Docker'ın Dezavantajları:**

- Docker container'ları, ana işletim sistemiyle aynı çekirdeği paylaştığı için, ana bilgisayara erişim izni olan bir container, ana bilgisayara zarar verebilir.
