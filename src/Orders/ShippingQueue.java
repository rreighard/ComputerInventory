package Orders;

import Orders.Order;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to
change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this
template
 */
/**
 *
 * @author smv159
 */
public class ShippingQueue {
    private LocalTime startDate; //The date this queue was started
    private LinkedList<Order> ordersToShip = new LinkedList<Order>();
    public ShippingQueue() {
        this.setStartDate();
        this.buildShippingQueue();
        this.printShippingQueue();
    }
    public void setStartDate() {
        this.startDate = LocalTime.now();
    }
    public void buildShippingQueue() {
        //Add a first order to 'seed' the list
        this.ordersToShip.add(new Order(null, this.startDate, 1));
        //This loop adds 40 more test orders
        for (int i = 0; i < 20; i++) {
            this.addOrder(new Order(new ArrayList<String>(Arrays.asList("Test A" + 1)) ,
                    this.startDate.plus((i * 20), ChronoUnit.MINUTES), i%3));

            this.addOrder(new Order(new ArrayList<String>(Arrays.asList("Test B"+i)) ,
                    this.startDate.minus((i * 20), ChronoUnit.MINUTES), i%3));
        }
    }
    public void addOrder(Order newOrder) {
        boolean orderAdded = false;
        boolean insertDecision = false;
        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        //Loop to determine where to insert the new Order
        while (orderIterator.hasNext()) {
            insertDecision = orderIterator.next().decideToInsert(newOrder);
            if (insertDecision) {
                ordersToShip.add(orderIterator.previousIndex(), newOrder);
                orderAdded = true;
                break;
            }
        }
        //Order not added in loop - i.e., it belongs at end
        if (orderAdded == false) {
            //Add to end of list if not added in loop
            ordersToShip.add(newOrder);
        }
    }
    public void printShippingQueue() {
        ListIterator<Order> orderIterator = ordersToShip.listIterator();
        while (orderIterator.hasNext()) {
            System.out.println(removeItem());
        }

        System.out.println("Is empty? " + (ordersToShip.size() == 0 ? "yes" : "no"));
    }

    public Order removeItem(){
        return ordersToShip.removeFirst();
    }
}