# -*- coding:utf-8 -*-


def length_of_last_word(str_):
    split_str = str_.split(" ")
    if not split_str:
        return 0

    return len(split_str[-1])

if __name__ == '__main__':
    result = length_of_last_word("hello world")
    print(result)