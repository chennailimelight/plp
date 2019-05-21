Feature: Product Details

@execute
Scenario: Valid Products

Given admin is on Product Details page
When admin enters wrong product id
Then displays 'Product not available'

@execute
Scenario: Invalid merchant id

Given admin is on Product Details page
When admin enters invalid id
Then displays 'Please fill valid merchant id'

@execute
Scenario: Invalid Category Name

Given admin is on Product Details page
When admin enters invalid Category Name
Then displays 'Please fill valid Category'
  
@execute
Scenario: Valid details

Given admin is on Product Details page
When admin enters valid product details
Then displays 'Product Information' 