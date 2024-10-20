## roda o comando para criação da imagem
`docker build -t docker-images .`

---
### crinado o container com a imagem criada.
`docker run -d -p 8080:8080 --name container-docker docker-images`<br>

---
### Quando fizer um novo codigo na master deve ser criado uma outra imagesn com o comando abaixo <br>
`docker build -t novaimagem1.0 .` depois criar um container<br>
` docker run -d -p 8080:8080 --name java1.0 novaimagem1.0` <br>
---
