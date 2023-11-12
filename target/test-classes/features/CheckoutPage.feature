

Feature: Place order for products

  @placeOrder
Scenario Outline: Search experience for placing order
Given User is on GreenCart landing page
When User searched with <Name> and extracted actual name of product
And added "3" items of the selected product to the cart
Then User proceeds to Checkout and validate <Name> in checkouts page
And Verify User has ability to enter promo code and place order

Examples:
|Name|
|Tomato|

