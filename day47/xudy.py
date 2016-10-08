# -*- coding:utf-8 -*-


def get_reverse_polish_result(expression):
    stack = []
    ops = {'+': lambda x, y: x+y,
           '-': lambda x, y: x-y,
           '*': lambda x, y: x*y,
           '/': lambda x, y: x/y,
           }
    for item in expression:
        if item in ['+', '-', '*', '/']:
            right = stack.pop()
            left = stack.pop()
            stack.append(ops.get(item)(left, right))
        else:
            stack.append(int(item))

    return stack.pop()

if __name__ == '__main__':
    tests = [['2', '1', '+', '3', '*'], ['4', '13', '5', '/', '+']]
    for test in tests:
        result = get_reverse_polish_result(test)
        print(result)
