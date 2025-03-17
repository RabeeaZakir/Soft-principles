
# 🍰 Online Baking Shop - Polymorphism Implementation

## Objective  
This project demonstrates the **Polymorphism** principle in **Software Design & Architecture**.  
We implement an **Online Baking Shop Order System**, showing two versions:  
Without Polymorphism: (Bad Practice - Code Duplication)  
With Polymorphism: (Good Practice - Reusability & Scalability)  

---

## ❌ Problem (Without Polymorphism)  
In the **WithoutPolymorphism.java** file, each bakery item has a separate method (`orderCake()`, `orderCookies()`, etc.), which leads to:  
- ❌ **Code duplication**  
- ❌ **Difficult maintenance**  
- ❌ **Adding new items requires modifying existing code**  

---

## ✅ Solution (With Polymorphism)  
In the **WithPolymorphism.java** file, we use **method overriding** by creating:  
✔ A parent class `BakeryItem`** with a common method `order()`.  
✔ Child classes (`Cake`, `Cookies`, `Pastry`, etc.)** implementing their own version of `order()`.  
✔ An `OrderProcessor` **class** to process orders dynamically.  
 
