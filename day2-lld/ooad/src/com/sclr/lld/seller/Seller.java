package com.sclr.lld.seller;

import com.sclr.lld.objects.Sellable;

public class Seller {
    public void sell(Sellable obj){
        System.out.println(obj.getSellingPrice());
    }
}
