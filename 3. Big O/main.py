import time

"""
A good code is 1) readable and 2) scalable
Big-O allows us to measure this idea of scalable
There are many ways to solve a problem through a code
1) Efficient and 2) Inefficient
"""

"""
    Here below the big o notation of findNemo is O(n) 
    Evertytime we have to look for in the list, if there is a nemo
    if four elements are there, 4 times the operation will be perform....; N elements----> N times
    O(n) is also called Linear Time
    Here N is the number of input elements.
"""

list = ['nemo'] * 100000
def findNemo(listName):
    t1 = time.time()
    for i in range(100000):
        if i == 'nemo':
            print('Found Nemo!')
    print ( time.time() - t1 , ' seconds!')
    
findNemo(list)