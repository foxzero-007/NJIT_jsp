package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class c3p0Util {
    private static ComboPooledDataSource ds=new ComboPooledDataSource();

    //获取数据源
    public static DataSource getDataSource(){
        return ds;
    }
    //获取一个连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
