"""
    Arrays are stored in contiguous memory --- > in order.
    If all we need is  to store data and iterate through it step by step, knowing indices
    
    Lookup or Access to Arrays is: O(1)
    Push: O(1)
    Insert: O(n)
    Delete: O(n)
    
"""



strings = ['a', 'b', 'c', 'd']
print(strings)

strings.append('e') # O(1) ---> adding one item
print(strings)

strings.pop() # O(1) ---> removing one item
print(strings) 

strings.insert(0, 'Nisarg') # O(n) ---> in this case O(5), because of iterating to every element and assigning new index
print(strings)



