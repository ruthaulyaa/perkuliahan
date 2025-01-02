# -*- coding: utf-8 -*-
"""
Created on Thu Apr 22 21:54:21 2021

@author: ASUS
"""

def f(x):
    return x**2
def change_str(name):
    return name.upper()
def vector_length(x,y):
    return (x**2 + y**2)**(1/2)
def sum_plu_product_up_to(n):
    sum = 0
    product = 1
    for i in range(1,n):
        sum = sum + i
        product = product * i
    return sum + product

def add_user(name, gender="u"):
    if gender == "u":
        string = "User " + name + "not added"
    else:
        string = "user " + name + " added successful"
    return string

       