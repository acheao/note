package persistence;

import mybatis.Orders;

public interface OrdersMapper {
	public Orders selectOrders(int id);

}
