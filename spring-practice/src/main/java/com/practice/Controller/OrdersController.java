package com.practice.Controller;

import com.practice.Model.Order;
import com.practice.Model.Orders;
import com.practice.Service.OrderService;
import com.practice.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @GetMapping("/{no}")
    public String getOrderBySeq(@PathVariable int no, Model model){
        Orders orders = this.ordersService.getOrdersByNo(no);
        model.addAttribute("orders",orders);
        return "orders";
    }

}
