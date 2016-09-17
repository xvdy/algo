# -*- coding:utf-8 -*-
# 大整数加法 可以通过链表来实现, 保留进位就ok

def plus_one(o1):
    carry = 1
    result = []
    for i in o1[::-1]:
        if carry:
            i += carry
            carry = 0
        if i > 9:
            i = 0
            carry = 1
        result.insert(0, i)
    if carry:
        result.insert(0, carry)

    return result


test = [1, 2, 3, 4, 9]
t2 = [9, 9, 9]

r = plus_one(test)
r2 = plus_one(t2)
print(r)
print(r2)
