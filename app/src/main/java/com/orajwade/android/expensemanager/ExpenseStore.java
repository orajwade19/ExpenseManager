package com.orajwade.android.expensemanager;

import java.util.ArrayList;
import java.util.List;

public class ExpenseStore {
    private static ExpenseStore sExpenseStore;
    private List<Expense> expenseList;

    public ExpenseStore Get()
    {
        if(sExpenseStore==null)
        {
            sExpenseStore = new ExpenseStore();
        }
        return sExpenseStore;
    }

    private ExpenseStore()
    {
        expenseList = new ArrayList<Expense>();
    }

    public void addExpense(Expense expense)
    {
        expenseList.add(expense);
    }
}
