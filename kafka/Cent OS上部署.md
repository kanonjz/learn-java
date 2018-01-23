## kafka在cent OS上的安装和部署

1. 安装。官网上推荐从镜像网站下载。
```
wget http://mirrors.shu.edu.cn/apache/kafka/1.0.0/kafka_2.11-1.0.0.tgz
```

2. 解压。
```
tar -zxvf kafka_2.11-1.0.0.tgz
```

## 遇到的问题
1. consumer无法接受到producer的数据（未解决）
```
ERROR Error when sending message to topic test with key: null, value: 5 bytes with error: (org.apache.kafka.clients.producer.internals.ErrorLoggingCallback)
org.apache.kafka.common.errors.TimeoutException: Failed to update metadata after 60000 ms.
```

## 参考资料
1.[官方quickstart](http://kafka.apache.org/quickstart)
