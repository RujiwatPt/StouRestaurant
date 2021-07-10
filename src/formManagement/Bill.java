/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formManagement;

/**
 *
 * @author Jin
 */
public class Bill {

    private String billID, MemberID, StaffID, OrderID, TableID, FoodID,FoodName;
    private int Amount, Price, Total, Receive, Change;

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String memberID) {
        MemberID = memberID;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String staffID) {
        StaffID = staffID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getTableID() {
        return TableID;
    }

    public void setTableID(String tableID) {
        TableID = tableID;
    }

    public String getFoodID() {
        return FoodID;
    }

    public void setFoodID(String foodID) {
        FoodID = foodID;
    }
    
     public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getReceive() {
        return Receive;
    }

    public void setReceive(int receive) {
        Receive = receive;
    }

    public int getChange() {
        return Change;
    }

    public void setChange(int change) {
        Change = change;
    }

    public int getTotal() {
        Total = Amount * Price;
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public Bill() {
        super();
    }

}
