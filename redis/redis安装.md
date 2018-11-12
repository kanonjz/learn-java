## Linux下安装redis
步骤：
1. 选择一个文件夹存放redis
```
cd usr
mkdir redis
cd redis
```
2. 从官网下载源码
```
wget http://download.redis.io/releases/redis-4.0.2.tar.gz
```
3. 解压并编译
```
tar xzf redis-4.0.2.tar.gz
cd redis-4.0.2.tar.gz
make
```
4. 安装完成
5. 在src目录里存放着redis服务启动的程序`redis-server`和命令行交互程序`redis-cli`
7. 得先启动redis服务，才能运行命令行交互程序
```
./redis-server
```
8. 这里有一点不方便的地方，就是你在启动服务之后，控制台就会一直停留在服务启动的状态，你就无法在控制台做任何其他事情，所以我们需要配置redis服务在后台运行。
这里我们需要修改配置文件`redis.conf`，找到`daemonize`项修改为`yes`，保存并退出

![配置](http://kanon-blog.oss-cn-hangzhou.aliyuncs.com/for-github/redis-2.JPG)

9. 使用刚才修改过的配置文件启动redis
```
src/redis-server redis.conf
```
10. 这样redis就在后台启动了。我们可以来测试一下，打开`redis-cli`命令行交互程序，输入`ping`，得到结果`pong`

