DispatcherServlet做的事非常简单，就是根据HTTP请求的url和请求方法找到对应的Controller去执行。

最原始的开发是Servlet+jsp+java Bean+jdbc这种模式，后来高手们在这之上做了封装，衍生出了SSH的开发模式，后来Hibernate渐渐不行了，就被Mybatis取代了，变成了SSM框架