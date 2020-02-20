package com.redhat;

import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class ProductAggregationStrategy implements AggregationStrategy {

    
    public Exchange aggregate(Exchange original, Exchange resource) {

        //System.out.println(original.getIn().getBody().getClass());
        //System.out.println(resource.getIn().getBody().getClass());
        String productName = (String)(original.getIn().getBody());
        String price = (String)(resource.getIn().getBody());
        Output op= new Output();
        op.setPrice(Integer.parseInt(price));
        op.setProductName(productName);
        Gson gson = new Gson();
        //String mergeResult= productName.concat(": ").concat(resource.getIn().getBody(String.class)) ;
        if (original.getPattern().isOutCapable()) {
            original.getOut().setBody(gson.toJson(op));
        } else {
            original.getIn().setBody(gson.toJson(op));
        }

        return original;
    }
}