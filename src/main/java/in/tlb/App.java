package in.tlb;

import com.google.inject.Guice;
import com.google.inject.Injector;
import in.tlb.algos.FirstInFirstOut;
import in.tlb.enums.OrderType;
import in.tlb.models.Order;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Slf4j
public class App 
{
    public static void main( String[] args )
    {

        Injector injector = Guice.createInjector(new OrderMatchingModule());

        FirstInFirstOut firstInFirstOut = injector.getInstance(FirstInFirstOut.class);

        firstInFirstOut.firstInFirstOutAlgo(Order.builder()
                        .createdAt(LocalDateTime.now())
                        .ordertype(OrderType.SELL)
                        .price(BigDecimal.ONE)
                        .quantity(BigDecimal.TEN)
                .build());

    }
}
