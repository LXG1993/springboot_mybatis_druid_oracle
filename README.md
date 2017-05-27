# spring boot使用oracle数据库演示
1. 因为授权的原因，oracle的jar包，在maven上都下载不下来，遇到下载不下来oracle驱动的同学，需要到oracle官网下载，然后添加到项目中，果maven私服中有oracle驱动包的请无视。
2. 数据源使用的是druid.
3. 集成了mybatis.

# spring boot连oracle的重点
1. 要自已建一个配置类，这里使用到两个注解@Configuration和@ConfigurationProperties

```

@Configuration
/*这里的oracle名字要与application.properties中的相同*/
@ConfigurationProperties("oracle")

public class OracleConfiguration {
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Bean
    DataSource dataSource() throws SQLException {

        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);

        return dataSource;
    }
```
2. 添加以上代码后，在application.properties中指定oracle的username、password和url三个参数即可。

# application.properties完整配置

```
#配置数据源 (为了最简化演示，druid所有参数都用默认的)
spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
#配置数据库驱动
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
#配置数据库用户名
oracle.username=new_oms
#配置数据库密码
oracle.password=new_oms
#配置数据库连接字符串
oracle.url=jdbc:oracle:thin:@//172.30.0.242:1520/oradb01
##集成MyBatis
#mybatis指向实体所在目录
mybatis.typeAliasesPackage=com.lolibaba.models
#mybatis指向mapper文件所在目录
mybatis.mapperLocations=classpath:mappers/*.xml
```
