"""
    Create a function to reverse a string:
    "My name is Nisarg" should be:
    "grasiN si eman mY"
"""

import string
from turtle import back


def reverseString(sentence):
    # check input
    if (type(sentence) == str):
        if len(sentence) > 2:
            backward = sentence[::-1]
            print(backward)
        else:
            print("Beep! Try Again...")    
    else:
        print("Beep! Try Again...")



reverseString("My name is Nisarg")
reverseString(2)
reverseString("A")

