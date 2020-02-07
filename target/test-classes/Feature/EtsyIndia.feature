Feature: Etsy product purchage
As a registered visitor of Etsy,i want to search product.
Add the product to my cart then i go to purchage page
and make the payment by using my credit card,and make 
the conformation of my purchage.

@smoke
Scenario Outline: Purchasing the product via Etsy India Pvt Ltd.

Given I am at the Etsy Login Page,I entered my User Name "<Usr_Nme>" Password "<PWD>" 
And Click the Login btn 
And I entered the product name "<Product_Name>" in the search box.
And click the search button.
When I select the product and add it into my cart.
And I confirm my product and proceed to checkout page.
Then I enter my Delivery Address "<Full_name>","<Street_address>","<Flat>","<Postal_code>","<City>"
And I move to payment page and enter my credit card details "<Name_on_card>","<Card_Number>","<Security_Code>".
 

Examples: 
| Usr_Nme  | PWD | Product_Name  |Full_name|Street_address|Flat|Postal_code|City|Name_on_card|Card_Number|Security_Code|
|ravi.shekhar082@gmail.com|IVAR092|iPhoneCase|Ravi|Delhi|Rohini|110009|Delhi|Ravi|1254785654|5847|


@sanity
Scenario: Purchasing the product via Etsy India Pvt Ltd.

Given I xam at the Etsy Login Page,I entered my User Name  Password 
And Clickx the Login btn 
And I entexred the product name  in the search box.
And click txhe search button.
When I selecxt the product and add it into my cart.
And I confirmx my product and proceed to checkout page.
Then I enter mxy Delivery Address 
And I move to pxayment page and enter my credit card details 
 
