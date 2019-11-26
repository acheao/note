package mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import persistence.OrdersMapper;

public class MybatisTest {
	public static void main(String[] args){
		String resource = "config/mybatis-configuration.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			
			Orders order = session.selectOne("persistence.OrdersMapper.selectOrders",10003);
			System.out.println(order.getOrder_num());
			System.out.println(order.getOrder_date());
			
			OrdersMapper mapper = session.getMapper(OrdersMapper.class); 
			Orders order1 = mapper.selectOrders(10003);
			System.out.println(order1.getOrder_num());
			System.out.println(order1.getOrder_date());
			
		}
	}	

}
