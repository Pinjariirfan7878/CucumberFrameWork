Feature: Search and Place Order for Products
@OfferPage
Scenario Outline: Search Experience for product search in both Home and Offer Page

Given User is on GreenCart Landing Page
When User search with Shortname <Name> and extracted actual name of product 
Then User search for <Name> shortname in offer page
And validate both extract product name is same of offer page and home page

Examples:

| Name |
| Tom  |
| Tom  |


