package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import persistence.CustomersMapper;
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
			System.out.println(order.getOrderNum());
			System.out.println(order.getOrderDate());
			OrdersMapper mapper = session.getMapper(OrdersMapper.class); 
			Orders order1 = mapper.selectOrders(10003);
			System.out.println(order1.getOrderNum());
			System.out.println(order1.getCustId());
			
			
			CustomersMapper custMapper = session.getMapper(CustomersMapper.class);
			Customers cust = new Customers();
			/*cust.setCustName("测试");
			cust.setCustAddress("地址一");
			cust.setCustCity("广州");
			cust.setCustContact("19128873738");
			cust.setCustCountry("中国");
			cust.setCustEmail("acheao@foxmail.com");
			cust.setCustSate("0");	
			custMapper.insertOne(cust);
			System.out.print(cust.getCustId()+"----------");
			
			Orders or = new Orders();
			or.setOrderDate(new Date());
			or.setCustId(cust.getCustId());
			mapper.add(or);*/
			
			List<Orders> orderList = new ArrayList();
			for(int i=0;i<3;i++){
				Orders or = new Orders();
				or.setOrderDate(new Date());
				or.setCustId(10001);
				orderList.add(or);
//				mapper.add(or);
			}
			mapper.batchInsert(orderList);
			for(Orders or : orderList){
				System.out.println(or.getOrderNum());
			}
			
			/*Orders or = new Orders();
			or.setOrderDate(new Date());
			or.setCustId(10006);
			orderList.add(or);
			mapper.add(or);*/
			
			/*事务测试：新增四个对象，其中10001符合外键约束，10006不符合，commit后抛出异常，
			SqlSession调用close();close()调用事务回滚，所以四条记录都插入失败
			其中try(){},()中的内容表示或者资源，当catch到异常后，关闭资源*/
			
			session.commit();
		}
	}	
	

}
