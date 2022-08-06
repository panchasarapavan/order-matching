package in.tlb.algos;

import in.tlb.models.Order;
import in.tlb.services.OrderService;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
public class FirstInFirstOut {

    private final OrderService orderService;

    @Inject
    public FirstInFirstOut(OrderService orderService){
        this.orderService = orderService;
    }

    public void firstInFirstOutAlgo(final Order order) {
        orderService.saveOrder(order);
        log.info("Saved First Order");
    }

}
