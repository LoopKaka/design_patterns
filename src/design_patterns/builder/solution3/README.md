## Problem with Solution 3

1. Constructor overloading becomes confusing when many fields have the same type. We can also face compilation errors if multiple constructors have the same signature.
   Example: Employee(String name, String email, String address) and Employee(String name, String email, String skill) both become Employee(String, String, String) for Java.

2. We can end up creating too many parameterized constructors. In the worst case, if we try to support every possible combination of optional fields, the number of constructors can grow close to 2^n, where n is the number of optional parameters.

3. Optional parameters are still difficult to manage. Constructor overloading does not handle all combinations cleanly, especially when multiple optional fields have the same data type.
