## Problem with Solution 1

1. This class is not immutable because it exposes public setter methods. After an Employee object is created, its field values can still be changed using methods like setName(), setEmail(), setSalary(), etc.
