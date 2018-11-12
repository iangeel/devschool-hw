package com.ing.devschool.utils.helpers;

import com.ing.devschool.Transaction;
import com.ing.devschool.utils.Constants;
import com.ing.devschool.utils.Item;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class CsvHelper {

    private static HashMap<Integer, List<Transaction>> transcations = new HashMap<>();
    private static List<Transaction> finalList = new LinkedList<>();


    private static synchronized void addToList(Transaction transaction) {
        List<Transaction> transactionList = transcations.get(transaction.getTransactionNo());

        if(transactionList == null) {
            transactionList = new LinkedList<>();
            transactionList.add(transaction);
            transcations.put(transaction.getTransactionNo(), transactionList);
        } else {
            transactionList.add(transaction);
        }
    }

    public static void showTransactionsById(int id) {
        if(transcations.containsKey(id)) {
           for(Transaction t : transcations.get(id)) {
                   t.printSimpleTransaction();

           }
        }
    }



    public static List<Transaction> readOneByOne(File csvInputFile) {

        try {
            Reader reader = new BufferedReader(new FileReader(csvInputFile));

            CSVParser csvParser = new CSVParserBuilder()
                    .withSeparator(',')
                    .build();

            CSVReader csvReader = new CSVReaderBuilder(reader)
                    .withSkipLines(1)
                    .withCSVParser(csvParser)
                    .build();

            String[] line;

            while ((line = csvReader.readNext()) != null) {

                Date date = Constants.dateFormat.parse(line[0] + " " + line[1]);
                int transactionNo = Integer.parseInt(line[2]);
                String item = line[3];

                addToList(new Transaction(date, transactionNo, new Item(item, 1)));


            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        transcations.forEach((transactionId, list) -> {
            Map<String, Integer> items = new HashMap<>();
            Date date = null;
            int transNo = 0;
            for(Transaction t : list) {
                Integer x = items.put(t.getItem().getName(), t.getItem().getContor());
                if(x != null) {
                    items.put(t.getItem().getName(), t.getItem().getContor() + x);
                }
                date = t.getDate();
                transNo = t.getTransactionNo();
            }
            finalList.add(new Transaction(date, transNo,items));
        });

        return finalList;
    }





}
