Docker for activemq artemis
docker run -p 8161:8161 -p 61616:61616 -e ARTEMIS_USERNAME=veladii -e ARTEMIS_PASSWORD=password -e 'ARTEMIS_MIN_MEMORY=1512M' -e 'ARTEMIS_MAX_MEMORY=3048M' vromero/activemq-artemis

Docker for rabbitmq; The default login is guest guest
docker run -p 15672:15672 -p 5672:5672 --name rabbit-test rabbitmq:3-management
