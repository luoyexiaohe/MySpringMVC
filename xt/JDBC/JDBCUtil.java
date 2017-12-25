package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCUtil {
    private static String url = null;  
    private static String name = null;  
    private static String user = null;  
    private static String password = null;  
  
    private static Connection conn = null;  
    private static PreparedStatement pst = null;  
    
    /**
     * ʵ�������ݿ�����
     */
    public JDBCUtil() {
        ResourceBundle rb = ResourceBundle.getBundle("cfg/cfg", Locale.ENGLISH);
        name = rb.getString("jdbcDriver");
        url = rb.getString("jdbcUrl");
        user = rb.getString("jdbcUser");
        password = rb.getString("jdbcPassword");
        
        try {  
            Class.forName(name);//ָ����������  
            conn = DriverManager.getConnection(url, user, password);//��ȡ����  
//            pst = conn.prepareStatement(sql);//׼��ִ�����  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally{
            
        }
    }
    
    /**
     * ��ѯsql��䣬���������װ��hashMap������
     * @author John
     * @param sql
     * @return
     * @throws SQLException
     * 2017��10��17�� ����9:29:40
     */
    public Map query(String sql) throws SQLException{
        pst = conn.prepareStatement(sql);//׼��ִ�����  
        printSql(sql);
        ResultSet ret = pst.executeQuery();
        if(!ret.next()) {
        	System.out.println("��sql���δ�ܲ�ѯ������");
        	return null;
        }
          Map resultMap = new HashMap();
        int count = pst.getMetaData().getColumnCount();
        for (int i = 1; i <= count; i++) {
            String key = pst.getMetaData().getColumnName(i);
            Object val = ret.getObject(i);
            resultMap.put(key, val);
        }
        return resultMap;
    }
    
    public List<Bean> query(Bean bean) throws SQLException {
    	return null;
    }

    public Bean queryExact(Bean bean) throws SQLException {
    	return null;
    }
    

    public void update(String sql) throws Exception{
    	 pst = conn.prepareStatement(sql);//׼��ִ�����  
    	 printSql(sql);
    	 pst.executeUpdate();
    }
    
    private void printSql(String sql ) {
    	System.out.println(sql);
    }
}
