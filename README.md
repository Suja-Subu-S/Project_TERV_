# Project_TERV_
develop a project online food delivery system using java 

Overview
This is a basic implementation of an Online Food Delivery System in Java. The system allows users to interact with a restaurant, browse the menu, add food items to their cart, select a delivery option, and track the status of their order. The code demonstrates object-oriented principles like classes, objects, lists, and basic input/output handling.

Features
Restaurant Menu: The system displays the restaurant's food menu, allowing users to choose food items.

Order Management: Users can add items to their order and calculate the total cost.

Delivery Options: Users can choose between two delivery options: Standard and Express.

Order Tracking: The system allows users to track the status of their order in three stages:

Order Placed

Out for Delivery

Delivered

Components
FoodItem Class:

Stores details about food items, including the name and price.

Has a constructor to initialize the food item.

Restaurant Class:

Represents a restaurant, with a list of food items (menu).

Provides methods to add food items to the menu and display the menu to the user.

Order Class:

Stores the food items added by the user.

Calculates the total price of the order.

Manages the order status and delivery options.

Provides methods to track the order status.

Main Class:

Acts as the entry point for the application.

Initializes the restaurant with a sample menu.

Allows users to add food items to the cart, choose a delivery option, and track the order status.

How It Works
1. Initialization
A sample restaurant "Tasty Bites" is created with a menu consisting of three items: Burger, Pizza, and Pasta. Each item has a price.

2. Menu Display
The menu is displayed to the user, with each item numbered for easy selection.

3. Order Selection
Users can enter the item number to add food items to their order. The system adds the selected item to the cart and shows a confirmation message.

The process continues until the user enters 0 to finish the order.

4. Delivery Option
After completing the order, users are prompted to choose a delivery option: Standard or Express.

5. Order Summary
The system displays a summary of the order, including:

Food items and their prices.

The selected delivery option.

The total cost of the order.

6. Order Tracking
Users can track the status of their order, which moves through three stages:

Order Placed: When the order is confirmed.

Out for Delivery: When the order is being delivered.

Delivered: When the order reaches the user.
