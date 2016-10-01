# -*- coding:utf-8 -*-
import re


def is_valid_num(str):
    num_pattern = '^[+-]?\d+(\.\d+)?(e[+-]?\d+(\.\d+)?)?$'

    return True if re.match(num_pattern, str) else False


if __name__ == '__main__':
    result = is_valid_num('1.1e1')
    print(result)
