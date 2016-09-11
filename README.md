#Learn Spring Framework
##Review the business case of the Inventory Management System
In our inventory management system, we have the concept of a product and a service for handling them. In particular, the business has requested the ability to increase prices across all products. Any decrease will be done on an individual product basis, but this feature is outside the scope of our application. 

##The validation rules for price increase are:
1. The maximum increase is limited to 50%.
2. The minimum increase must be greater than 0%.

 Find below a class diagram of our inventory management system.

![alt tag](https://docs.spring.io/docs/Spring-MVC-step-by-step/images/inventory-system-classdiagram.png)

##Learning Resources 
1. http://docs.spring.io/docs/Spring-MVC-step-by-step/