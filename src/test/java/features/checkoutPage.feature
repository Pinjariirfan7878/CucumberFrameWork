Feature: Search and Place Order for Products
@PlaceOrder
Scenario Outline: Search Experience for product search in both Home and Offer Page

Given User is on GreenCart Landing Page
When User search with Shortname <Name> and extracted actual name of product 
And Added "3" items of the selected to the cart
Then user proceeds to the checkout and validate the <Name> item in checkout page
And verify user has ability to enter promo code and place the order

Examples:

| Name |
| Tom |


