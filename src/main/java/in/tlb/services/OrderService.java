package in.tlb.services;

import in.tlb.models.Order;

import java.util.PriorityQueue;

public interface OrderService {

    Order saveOrder(Order order);

    /*
        should not really be a public function but this temporary
        will have better encapsulation in later versions
     */
    PriorityQueue<Order> getBuyOrders();

    PriorityQueue<Order> getSellOrders();
}
