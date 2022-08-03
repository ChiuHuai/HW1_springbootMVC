package com.practice.Service;



import com.practice.Model.Meal;
import com.practice.Model.Order;
import com.practice.Model.Orders;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {

    List<Orders> ordersList;
    List<List<Order>> orderLists; // many days
    List<Order> orderList; //per day
    List<Meal> mealList; //for person1
    List<Meal> mealList2; //for person2


    public OrdersService(){
        this.ordersList = new ArrayList<>();
        this.orderLists = new ArrayList<>();
        this.orderList = new ArrayList<>();

//        mealList
        this.mealList = new ArrayList<>();
        this.mealList.add(new Meal("hamburger",100,"This is delicious!"));
        this.mealList.add(new Meal("Coke",50,"nice!"));
        this.orderList.add(new Order(1,calctotalPriceAMealList(mealList),"Bill", mealList));

//        mealList2
        this.mealList2 = new ArrayList<>();
        this.mealList2.add(new Meal("pancake",80,"Nice and fluffy."));
        this.mealList2.add(new Meal("coffee",50,"Locally roasted."));
        this.orderList.add(new Order(2,calctotalPriceAMealList(mealList2),"Bill", mealList2));

        this.orderLists.add(0,orderList);
        this.ordersList.add(new Orders(orderLists,calcRevenuedays(orderLists),1));

    }
    //calculate revenue per day
    public int calcRevenuedays(List<List<Order>> llo){
        int total = 0;
        for(List<Order> lo: llo){
            for(Order o: lo){
                total += o.getTotalPrice();
            }
        }
        return total;
    }

    //calculate totalPrice in a single mealList
    public int calctotalPriceAMealList(List<Meal> lm){
        int total = 0;
        for(Meal m: lm){
            total += m.getPrice();
        }
        return total;
    }

    public Orders getOrdersByNo(int no){
        for(int i=0; i<this.ordersList.size(); i++){
            if(this.ordersList.get(i).getNo()==no) {
                return this.ordersList.get(i);
            }
        }
        return null;
    }


}
