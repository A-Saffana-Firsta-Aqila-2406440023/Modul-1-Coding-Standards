# Reflection 1

## 1. Clean Code Principles Applied
- **Meaningful Naming**: I have applied meaningful naming for variables, methods, and classes. I choose this because it makes the code "self-documenting," allowing other developers (or my future self) to understand the logic without reading deep comments.
- **Small and Focused Functions**: I split the application logic into four focused packages. By keeping these roles separate, I ensure each function has a small scope. I chose this because it prevents logic from getting tangled, making the application much easier to test and maintain.
  - **Model**: Represents the data.
  - **Controller**: Only manages requests/responses and forwards them to the service.
  - **Service**: Implements the business logic.
  - **Repository**: Handles database access. 

## 2. Secure Coding Practices Applied
- **UUID for Product Identification**: I implemented UUID (Universally Unique Identifier) to give each product a unique ID. This makes it harder for anyone to guess or access other product data by simply changing a number in the URL, keeping the information more secure.

## 3. Areas for Improvement
- **Weak Form Validation (Quantity)**: I noticed that the quantity field still accepts text. This is a mistake because it could break the business logic or cause errors in calculations. After this, I can improve the code by changing the data type to an integer and adding the `@Min(0)` annotation to ensure we only store non-negative values.
- **Handling Empty Inputs**: Currently, the form accepts empty values, which could lead to a `NullPointerException` when the application tries to process the data. It is a risk for application stability. After this, I can implement validation using `@NotBlank` or `@NotNull` to reject empty submissions.