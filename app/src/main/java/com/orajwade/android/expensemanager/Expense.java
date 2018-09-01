package com.orajwade.android.expensemanager;

import java.util.UUID;

public class Expense {
    private UUID expenseId;
    private String name;
    private int amount;
    private String category;

    public Expense()
    {
        this.expenseId = UUID.randomUUID();
        this.name = "Default";
        this.amount = 0;
        this.category = "Other";
    }

    public UUID getExpenseId() {
        return expenseId;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

   public Expense(String name,String amount,String category)
   {
       this.expenseId = UUID.randomUUID();
       this.name = name;
       this.amount = Integer.parseInt(amount);
       this.category = category;
   }
}
