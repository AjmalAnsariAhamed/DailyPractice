package com.practice;

import java.math.BigDecimal;

public class SimpleInterestCal {
    private String principle;
    private String interest;
    public SimpleInterestCal(String principle, String interest){
        this.principle=principle;
        this.interest=interest;

    }
    public BigDecimal calculateSimpleInterest(int years){
        BigDecimal forPrinciple= new BigDecimal(this.principle);
        BigDecimal forInterest = new BigDecimal(this.interest);
      return  (forPrinciple.multiply(forInterest)).multiply(new BigDecimal(years));
    }
}
