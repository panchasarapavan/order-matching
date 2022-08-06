package in.tlb;

import com.google.inject.AbstractModule;
import in.tlb.services.OrderService;
import in.tlb.services.impl.InMemoryOrderServiceImpl;

public class OrderMatchingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(OrderService.class).to(InMemoryOrderServiceImpl.class);
    }

}
