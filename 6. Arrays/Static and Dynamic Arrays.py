"""
    python lists are in-built dynamic, which python automatically allocate memory
    Which is sometimes not a good thing when you want to manage memory on your own.
    Low level languages like C++ allows this
"""

#creating arrays from scratch




# class myArray:

class myArray():
    
    def __init__(self):
        self.length = 0
        self.data = []
        
    def get(self, index):
        return self.data[index]
    
    def push(self, item):
        self.data.append(item)
        self.length += 1
        print(self.data, self.length)
        
    def pop(self):
        elementRemoved = self.data.pop(-1)
        self.length -= 1 
        print(elementRemoved, self.length)
        print("====================")
            
arr1 = myArray()  

arr1.push(1)
arr1.push('Nisarg')
arr1.push('Vatsal')

print(arr1.data)
    
