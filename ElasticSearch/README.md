## 安装ElasticSearch
### Windows安装ElasticSearch
1. 安装Java8环境
2. 到官网上下载ES并解压安装包
3. 运行`bin\elasticsearch.bat`，浏览器打开`http://localhost:9200/`，如果显示如下说明安装成功。
```
{
  "name" : "3DGFA_8",
  "cluster_name" : "elasticsearch",
  "cluster_uuid" : "8C7MiF4rSa6MqgdZFe5GyQ",
  "version" : {
    "number" : "6.1.1",
    "build_hash" : "bd92e7f",
    "build_date" : "2017-12-17T20:23:25.338Z",
    "build_snapshot" : false,
    "lucene_version" : "7.1.0",
    "minimum_wire_compatibility_version" : "5.6.0",
    "minimum_index_compatibility_version" : "5.0.0"
  },
  "tagline" : "You Know, for Search"
}
```
这就意味着你现在已经启动并运行一个 Elasticsearch 节点了，你可以用它做实验了。 单个 节点 可以作为一个运行中的 Elasticsearch 的实例。 而一个 集群 是一组拥有相同 cluster.name 的节点， 他们能一起工作并共享数据，还提供容错与可伸缩性。(当然，一个单独的节点也可以组成一个集群) 你可以在 elasticsearch.yml 配置文件中 修改 cluster.name ，该文件会在节点启动时加载 (这个重启服务后才会生效)。

### Linux安装ElasticSearch
1. 安装Java环境
2. 用wget命令安装ES
3. 解压安装包
4. 启动ES
```
./bin/elasticsearch
```
5. 开通远程访问。修改config/elasticsearch.yml，去掉network.host的注释，将它的值改成本机ip，然后重新启动ES。
```
network.host: 0.0.0.0
```
6. 如果想后台启动ES，则使用如下命令
```
./elasticsearch -d 
```

## 安装kibana
1. 用wget命令安装kibana，并解压
2. 修改配置文件`vim config/kibana.yml`
```
# 将默认配置改成如下：

server.port: 5601
server.host: "0.0.0.0"
elasticsearch.url: "http://192.168.2.41:9200"
kibana.index: ".kibana"
```
3. 启动kibana
```
.bin/kibana
```
4. 后台启动kibana
```
./bin/kibana &
```

## python es API
[官方GitBook](https://elasticsearch-py.readthedocs.io/en/master/index.html)

## 学习资源
[阮一峰：全文搜索引擎 Elasticsearch 入门教程](http://www.ruanyifeng.com/blog/2017/08/elasticsearch.html)  
[Elasticsearch: 权威指南](https://www.elastic.co/guide/cn/elasticsearch/guide/current/index.html)  
[简书：快速入门](https://www.jianshu.com/p/ddee872c69c1)

