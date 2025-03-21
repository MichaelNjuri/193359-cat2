# 193359-cat2

## Q1.md 
###  Rules of Big O notation in algorithm analysis

  1. **Ignore constants**
  - Coefficients and lower-order terms are irrelevant for large input sizes.
  - **Eg**: 'O(2n) → O(n), O(n + 5) → O(n).'

  2. **Focus on the dominant term**
  - Only the term with the highest growth rate matters.
  - **Eg**:  'O(n² + n) → O(n²).'

  3.  **Iterative Loops**
  -  A single loop iterating n times is O(n).
  - Nested loops multiply complexities: 'O(n × n) → O(n²)- A s.'

  4.  **Recursive Calls Multiply**
  - Analyze recursive algorithms using recurrence relations.
  - **Eg**: 'A binary search splits input in half each time: O(log n).'

  5. **Drop Non-Dominant Terms**
  - For combined complexities, retain only the highest term.  
  - **Eg**: 'O(n + n² + log n) → O(n²).'

  ## Q2.md
  ### Difference between arrays and linked lists:

   1. **Memory allocation**
   -
    