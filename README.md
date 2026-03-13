# Expense Tracker API

A RESTful backend service for managing and tracking personal expenses.

## Tech Stack
- Java
- Spring Boot
- PostgreSQL
- Maven

## Features
- Add a new expense
- View all expenses
- Update an expense
- Delete an expense
- Calculate total spending
- Category-based spending summary

## API Endpoints
### Add Expense
POST /api/expenses

Example request body:
{
 "title": "Groceries",
 "category": "Food",
 "amount": 500,
 "date": "2026-03-13"
}

### Get All Expenses
GET /api/expenses

### Update Expense
PUT /api/expenses/{id}

### Delete Expense
DELETE /api/expenses/{id}

### Get Total Spending
GET /api/expenses/total

### Category Summary
GET /api/expenses/summary

## How to Run
1. Install PostgreSQL
2. Create database
CREATE DATABASE expensesdb;
3. Update application.properties
4. Run the Spring Boot application

## Author
Trisha Roshan
