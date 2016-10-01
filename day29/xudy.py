# -*- coding:utf-8 -*-
"""
valid palindrome
"""


def is_palindrome(str_):
    l = len(str_)
    i, j = 0, l - 1
    while i < l and j >= 0:
        char_i = str_[i]
        char_j = str_[j]
        if not char_i.isalpha():
            i += 1
            continue
        if not char_j.isalpha():
            j -= 1
            continue
        if char_i.lower() != char_j.lower():
            return False
        else:
            i += 1
            j -= 1

    return True


if __name__ == '__main__':
    result = is_palindrome("A man, a plan, a canal: Panama")
    print(result)
