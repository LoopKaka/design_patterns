## Problem with Solution 2

1. If a constructor has many fields, it becomes difficult to remember the correct sequence of parameters. The caller must pass values in the exact order expected by the constructor.

2. If fields like salary or skill are optional, the caller still has to pass placeholder values such as 0 or null.

3. Optional parameters are difficult to maintain with a constructor-based approach. If more optional fields are added later, the constructor becomes longer and harder to use correctly.
