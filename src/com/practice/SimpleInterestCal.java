package com.practice;

import java.math.BigDecimal;

public class SimpleInterestCal {
    private BigDecimal principle;
    private BigDecimal interest;
    public SimpleInterestCal(String principle, String interest){
        this.principle=new BigDecimal(principle);
        this.interest=new BigDecimal(interest);

    }
    public BigDecimal calculateSimpleInterest(int years){

      return  (principle.multiply(interest)).multiply(new BigDecimal(years));
    }
}
