package com.ing.devschool.utils.helpers;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.ing.devschool.Transaction;
import com.ing.devschool.utils.Constants;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JacksonHelper {

    public static void writeTransactionToJson(
            File jsonFile,
            List<Transaction> transactionList,
            int numberOfTransactions)
    {

        boolean isArray = false;
        try {
            FileOutputStream fos = new FileOutputStream(jsonFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);


            JsonGenerator jsonGenerator = new JsonFactory().createGenerator(bos);

            jsonGenerator.setPrettyPrinter(
                    new DefaultPrettyPrinter()
            );

            if (numberOfTransactions > 0) {
                isArray = true;
                jsonGenerator.writeStartArray();
            }
            for (int i = 0; i < numberOfTransactions; i++) {
                Transaction transaction = transactionList.get(i);
                jsonGenerator.writeStartObject();

                jsonGenerator.writeStringField("date",
                        Constants.jsonDateFormat.format(transaction.getDate()));
                jsonGenerator.writeNumberField("transactionId",
                        transaction.getTransactionNo());

                jsonGenerator.writeObjectFieldStart("itemSummary");
                for (Map.Entry<String, Integer> item : transaction.getItemList().entrySet()) {

                    jsonGenerator.writeNumberField(
                            item.getKey(), item.getValue()
                    );
                }
                jsonGenerator.writeEndObject();

                jsonGenerator.writeEndObject();

            }
            if (isArray) {
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.flush();
            jsonGenerator.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
