package persistence;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import mybatis.Orders;


public interface OrdersMapper {
	public Orders selectOrders(int id);
	@Insert("INSERT INTO orders (order_num,order_date,cust_id) values (#{order_num},#{order_date},#{cust_id})")
	public void insert(Orders order);
	
	public void add(Orders order);
	
	public void batchInsert(List<Orders> orderLst);
	

}
