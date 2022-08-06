package in.tlb.services.impl;

import in.tlb.enums.OrderType;
import in.tlb.models.Order;
import in.tlb.services.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.PriorityQueue;

@Slf4j
public class InMemoryOrderServiceImpl implements OrderService {

    private final PriorityQueue<Order> buyOrdersRepo = new PriorityQueue<>();
    private final PriorityQueue<Order> sellOrderRepo = new PriorityQueue<>();

    @Override
    public Order saveOrder(Order order) {
        if (OrderType.BUY.equals(order.getOrdertype())) {
            buyOrdersRepo.add(order);
            return order;
        } else if (OrderType.SELL.equals(order.getOrdertype())) {
            sellOrderRepo.add(order);
            return order;
        }
        return null;
    }

    @Override
    public PriorityQueue<Order> getBuyOrders() {
        return buyOrdersRepo;
    }

    @Override
    public PriorityQueue<Order> getSellOrders() {
        return sellOrderRepo;
    }
}
