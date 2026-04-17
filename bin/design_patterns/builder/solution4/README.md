## Advantages of Builder Design Pattern

1. We can set values before creating the final object.
   - First, we set values in the builder.
   - Then we call build() to create the actual object.

2. Easy to create an object.
   - We do not need to pass all values in one big constructor.
   - We can create the object step by step.

3. We do not need to remember the order of constructor parameters.

4. Optional fields are easy to handle.
   - If `address`, `salary`, or `skill` is optional, we can skip them.
   - We do not need to pass `null` or `0` manually.

5. Avoids too many constructors.
   - Without builder, we may create many constructors for different optional fields.
   - With builder, one `Builder` class can handle many combinations.

6. It can help with validation.
   - You can validate parameters before creating object.
   - If values are invalid, we can stop object creation inside build().
