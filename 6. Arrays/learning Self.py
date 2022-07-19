# class classroom:
#     def __init__(self):
#         self.name = "Nisarg"
#         self.age = 21
        
#     # SELF tells which object is supposed to use the function
#     def update(self): 
#         self.age = 50  
        
#     def compare(self, obj2):
#         if self.age == obj2.age:
#             print("Gadzooks!")
#         else:
#             print("Eh!")     
        
# st1 = classroom()
# st2 = classroom()

# print(st1.name)  #---> Nisarg
# print(st2.name)  #---> Nisarg

# st2.name = "Vatsal"
# print(st2.name)  #---> Vatsal


# st2.update() # in this case, the update will point to st2, that is self will direct to st2

# print(st1.age)  # 21
# print(st2.age)  # 50


# st1.compare(st2)  # in this case self will point to st1


class Restuarant:
    def __init__(self, name, cuisine):
        self.name = "A Restuarant"
        self.cuisine = "Indian"
        
    def describe_resturant(self):
        print("Welcome to ", self.name.title(), " ! We're happy to serve you ", self.cuisine.title(), 
              ". Enjoy your meal ;)")
    
    def open_restuarant (self):
        print(self.name.title(), " is Open!")
        
r1 = Restuarant("D' Viilla", "Italian")

print(r1.name)
print(r1.cuisine)

r1.open_restuarant()
r1.describe_resturant()


