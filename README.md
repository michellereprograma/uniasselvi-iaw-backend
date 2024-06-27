# uniasselvi-iaw-backend
Projeto de backend do seminário interdisciplinar - Implementação de uma aplicação web

Esse projeto, disponibiliza uma API para que o frontend tenha acesso aos dados salvos em base de dados, e monte uma tela de listagem de smartphones.

Para se basear, foi utilizado como exemplo a playlist abaixo:
-  https://www.youtube.com/playlist?list=PLC8TqXFuvRUQt9fX5qeqjuGxuo_dM9Wvv - (Projeto API de teste com Java)

Foi utilizado o Java Spring Boot.
Foi utilizado o https://start.spring.io/ para inicializar o projeto com a linguagem, projeto, versões e dependências necessárias.

Foi utilizado a base de dados MariaDB:
- https://www.digitalocean.com/community/tutorials/how-to-install-mariadb-on-ubuntu-22-04

Como o projeto é apenas de listagem de dados, utilizamos o dbeaver para poder criar a tabela e inserir os registros manualmente:
- https://dbeaver.io/download/

Abaixo os scripts SQL para criar a tabela e inserir os registros:

CREATE TABLE smartphone
(
id INT PRIMARY KEY,
nome VARCHAR(200),
marca VARCHAR(50),
tamanho_tela DOUBLE,
cor VARCHAR(50),
processador VARCHAR(50),
memoria_ram VARCHAR(50),
espaco_interno VARCHAR(50),
preco DOUBLE,
data_lancamento DATE,
url_imagem VARCHAR(500)  
);

INSERT INTO smartphone
(id, nome, marca, tamanho_tela, cor, processador, memoria_ram, espaco_interno, preco, data_lancamento, url_imagem)
VALUES
(1,'iPhone 13 Pro Max','Apple',6.7,'Azul-Sierra','2x 3.22 GHz Avalanche','6 GB','1 TB',13639.12,'2021-03-01','https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-13-family-select-2021?wid=940&hei=1112&fmt=jpeg&qlt=80&.v=1629842667000');

INSERT INTO smartphone
(id, nome, marca, tamanho_tela, cor, processador, memoria_ram, espaco_interno, preco, data_lancamento, url_imagem)
VALUES
(2,'iPhone 12','Apple',6.6,'Rosa','1x 2.12 GHz Avalanche','6 GB','64 GB',11629.12,'2020-02-02','https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-family-select-2021?wid=940&hei=1112&fmt=jpeg&qlt=80&.v=1617135051000');

INSERT INTO smartphone
(id, nome, marca, tamanho_tela, cor, processador, memoria_ram, espaco_interno, preco, data_lancamento, url_imagem)
VALUES
(3,'Galaxy S21 Ultra','Samsung',6.8,'Prateado','1x Cortex-X1 2.9 GHz','16 GB','512 GB',5399.99,'2021-01-03','https://images-submarino.b2w.io/produtos/01/00/img/2810434/6/2810434628_1SZ.jpg');

Exemplo do que a API irá retornar:

[
{
"id": 1,
"nome": "iPhone 13 Pro Max",
"marca": "Apple",
"tamanhoTela": 6.7,
"cor": "Azul-Sierra",
"processador": "2x 3.22 GHz Avalanche",
"memoriaRam": "6 GB",
"espacoInterno": "1 TB",
"preco": 13639.12,
"dataLancamento": "2021-03-01",
"urlImagem": "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-13-family-select-2021?wid=940&hei=1112&fmt=jpeg&qlt=80&.v=1629842667000"
},
{
"id": 2,
"nome": "iPhone 12",
"marca": "Apple",
"tamanhoTela": 6.6,
"cor": "Rosa",
"processador": "1x 2.12 GHz Avalanche",
"memoriaRam": "6 GB",
"espacoInterno": "64 GB",
"preco": 11629.12,
"dataLancamento": "2020-02-02",
"urlImagem": "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/iphone-12-family-select-2021?wid=940&hei=1112&fmt=jpeg&qlt=80&.v=1617135051000"
},
{
"id": 3,
"nome": "Galaxy S21 Ultra",
"marca": "Samsung",
"tamanhoTela": 6.8,
"cor": "Prateado",
"processador": "1x Cortex-X1 2.9 GHz",
"memoriaRam": "16 GB",
"espacoInterno": "512 GB",
"preco": 5399.99,
"dataLancamento": "2021-01-03",
"urlImagem": "https://images-submarino.b2w.io/produtos/01/00/img/2810434/6/2810434628_1SZ.jpg"
}
]

A ideia de Utilizar uma listagem de smartphones veio de um projeto que jã havia desenvolvido em python, onde é lido um arquivo .csv, que contém em cada linha dados de um smartphone, e posteriormente é criado um html renderizado com os dados pegos do arquivo de entrada (csv):
- https://github.com/michellesantosdev/gerador-relatorio-produtos