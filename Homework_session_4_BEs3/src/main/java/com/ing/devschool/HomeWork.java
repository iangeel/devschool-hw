package com.ing.devschool;

import com.ing.devschool.utils.helpers.CsvHelper;
import com.ing.devschool.utils.helpers.JacksonHelper;

import java.io.*;
import java.util.*;

public class HomeWork {

    public static void main(String[] args) {

        File csvInputFile = new File(
                "./src/main/resources/bakery-transactions.csv"
        );
        File jsonFile = new File(
                "./src/main/resources/bakery-summary.json"
        );

        List<Transaction> myList;

        //1. reading from csv
        myList = CsvHelper.readOneByOne(csvInputFile);
        System.out.println("\nCSV read: OK");

        //2. aggregates trasactions by id
        System.out.println("\nAggregates transactions by the transaction id");
        CsvHelper.showTransactionsById(3);

        //3. sorting the transactions based on the number of items belonging to a transaction id
        System.out.println("\nSorted collection:");
        Collections.sort(myList);
        for(int i =0;i<5;i++) {
            System.out.println(myList.get(i).toString());
        }

        //4. writing into json
        JacksonHelper.writeTransactionToJson(jsonFile, myList,3);
        System.out.println("\nJSON write: OK");

    }


}
