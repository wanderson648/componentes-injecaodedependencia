package com.desafio1.aula.services;

import com.desafio1.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double orderCalc = order.getBasic() - (order.getBasic() * order.getDiscount() / 100.0);

        if (order.getBasic() < 100.0) {
            return orderCalc + 20;
        } else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
            return orderCalc + 12;
        }
        return orderCalc;
    }
}
