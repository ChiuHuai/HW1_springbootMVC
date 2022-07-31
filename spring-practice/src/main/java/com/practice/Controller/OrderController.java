package com.practice.Controller;

import com.practice.Model.Meal;
import com.practice.Model.Order;
import com.practice.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/{seq}")
    public String getOrderBySeq(@PathVariable int seq, Model model){
        Order order = this.orderService.getOrderBySeq(seq);
        model.addAttribute("order",order);
        return "order";
    }

}
