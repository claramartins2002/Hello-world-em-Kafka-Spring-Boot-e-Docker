# Estudos Mensageria: Kafka

> Conjunto de microservices simples para testar o envio de mensagens via topic no Kafka. O serviço foi utilizado por meio de imagem Docker e implementado em API simples Java Spring Boot.
## Linguagens e tecnologias utilizadas

- Spring Boot
- Kafka
- Spring Web 
- Docker


## Descrição
Primeiro, foi criada a instância do Kafka através de um container no Docker através do arquivo kafka-docker-compose.yml, que precisa ser inicializado via terminal `docker-compose -f kafka-docker-compose.yml up -d`. Assim, o console já fica disponível. Depois foi criado um topic com o nome topic-teste, na API producer. Assim, é possível enviar mensagens através do endereço `http://localhost:8080/mensagem`, com um body de único parâmetro, chamado mensagem. Rodando também o consumer, no log dessa API, as mensagens produzidas serão mostradas. Mesmo que o producer não estivesse funcionando enquanto a mensagem foi enviada, assim que o serviço estiver ativo, ele receberá a mensagem e a exibirá. 






