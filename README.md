./bin/zookeeper-server-start.sh config/zookeeper.properties
./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic KakfaExample2 --from-beginning
./bin/kafka-server-start.sh config/server.properties
./bin/kafka-topics.sh config/tools-log4j.properties --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic KakfaExample2
./bin/zookeeper-server-start.sh config/zookeeper.properties
./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic KakfaExample2 --from-beginning
./bin/kafka-server-start.sh config/server.properties
./bin/kafka-topics.sh config/tools-log4j.properties --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic KakfaExample2
