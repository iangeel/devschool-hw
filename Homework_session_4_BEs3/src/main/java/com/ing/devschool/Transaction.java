package com.ing.devschool;

import com.ing.devschool.utils.Constants;
import com.ing.devschool.utils.Item;
import java.util.*;


public class Transaction implements Comparable<Transaction> {
    private Date date;
    private Integer transactionNo;
    private Item item;
    private Map<String, Integer> itemList;

    public Transaction(Date date, Integer transactionNo, Item item) {
        this.date = date;
        this.transactionNo = transactionNo;
        this.item = item;
    }

    public Transaction(Date date, Integer transactionNo,  Map<String, Integer> itemList) {
        this.date = date;
        this.transactionNo = transactionNo;
        this.itemList = itemList;
    }

    public Date getDate() {
        return date;
    }


    public Integer getTransactionNo() {
        return transactionNo;
    }

    public Item getItem() {
        return item;
    }

    public Map<String, Integer> getItemList() {
        return itemList;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(String itemName : itemList.keySet()) {
            sb.append(itemName);
            sb.append(" ");
        }
        return "Transaction{" +
                "date=" + date +
                ", transactionNo=" + transactionNo +
                ", itemList=" + sb +
                '}';
    }

    public void printSimpleTransaction() {
        System.out.println("Transaction [" + this.getTransactionNo() + "]: " +
                "on " + Constants.dateFormat.format(this.getDate()) +
                ". Item transactioned - " + this.getItem().getName());
    }

    @Override
    public int compareTo(Transaction transaction) {
        return transaction.getItemList().size() - this.getItemList().size();
    }
}
