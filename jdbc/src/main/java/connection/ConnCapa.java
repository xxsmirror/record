package connection;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class ConnCapa {
    public static void main(String[] args) throws Exception {
        //加载配置
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druid.properties"));
        DataSource dataSource =DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
    }
}
