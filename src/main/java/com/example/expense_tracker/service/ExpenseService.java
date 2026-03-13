package com.example.expense_tracker.service;

import com.example.expense_tracker.model.Expense;
import com.example.expense_tracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense updateExpense(Long id, Expense updatedExpense) {
        Expense expense = repository.findById(id).orElseThrow();

        expense.setTitle(updatedExpense.getTitle());
        expense.setCategory(updatedExpense.getCategory());
        expense.setAmount(updatedExpense.getAmount());
        expense.setDate(updatedExpense.getDate());

        return repository.save(expense);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    public Double getTotalSpending() {
        return repository.getTotalSpending();
    }

    public List<Object[]> getCategorySummary() {
        return repository.getCategorySummary();
    }
}