## 方法一
```
GET megacorp/employee/_search
{
    "size":"0",
    "aggs":{
        "uniq_age":{
            "terms":{
                "field":"age"
            }
        }
    }
}
```

## 方法二
cardinality
[官网文档](https://www.elastic.co/guide/en/elasticsearch/guide/current/cardinality.html)
