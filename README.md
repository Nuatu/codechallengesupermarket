Java Code Challenge
=======================================

Supermarket sells the following 3 products: 

* Product A = $20
* Product B = $50 (or 5 for the price of 3)
* Product C = $30
 
Implement the code for a checkout register that calculates the price
of a given sequence of items. The input is a product list as a
String, e.g "ABBACBBAB" : for which the output should be the integer 240.
 
Implement the following:
 
 
    public interface Supermarket {
     
       public int checkout(String items);
     
    }

Solution
========
Algorithm takes in string, splits string into an array of characters, iterates through array to determine qty of each product, calculates totalCostA, runs helper method calculateTotalCostB to determine discount/cost of product B, calculates totalCostC, calculates and returns grandTotal.