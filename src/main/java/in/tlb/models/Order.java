package in.tlb.models;

import in.tlb.enums.OrderType;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@RequiredArgsConstructor
public class Order {

    BigDecimal price;

    BigDecimal quantity;

    LocalDateTime createdAt;

    OrderType ordertype;

}
