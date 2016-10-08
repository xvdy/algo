# -*- coding:utf-8 -*-


def is_pair(left, right):
    pair_map = {'(': ')', '[': ']', '{': '}'}
    return pair_map.get(left) == right


def paren_validate(str_):
    l = []
    for index, item in enumerate(str_):
        if item in [')', ']', '}']:
            if not l:
                return False
            last_paren = l.pop()
            if not is_pair(last_paren, item):
                return False
        else:
            l.append(item)

    return False if l else True

if __name__ == '__main__':
    result = paren_validate("[({})]")
    print(result)
