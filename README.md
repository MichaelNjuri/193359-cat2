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

   - **Arrays** : It uses contiguous memory allocation ,where elements are stored in successive memory locations. 

   - **Linked Lists** :Use dynamic memory allocation,where each element (node) is stored anywhere in the  memory,Nodes are also    connected by  pointers hence eliminating the need for a fixed size. 

   2.  **Insertion and deletion**

   - **Arrays** : This operations require element shifting hence leading to linear time complexity (O(n)).
   
   - **Linked lists** :It is efficient since it only involves pointer adjustments,while middle operations require traversal (O(n)) in order to locate the insertion and deletion points.

   3. **Performance**

   - **Arrays** :Accessing elements is fast due to direct indexing  using their positioning.(O(n)) is used for unsorted arrays and (O(log n)) for sorted arrays using binary search.

   - **Linked lists** : Accessing elements is slow due to sequential traversal which results in linear time complexity(O(n)) 