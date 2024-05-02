package com.food.ordering.system.domain.event;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.OrderId;

public interface DomainEvent<O extends AggregateRoot<OrderId>> {
}
