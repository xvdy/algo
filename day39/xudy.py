# -*- coding:utf-8 -*-


def roman2int(roman):
    char_map = {'I': 1,
                'V': 5,
                'X': 10,
                'L': 50,
                'C': 100,
                'D': 500,
                'M': 1000}

    sum = char_map[roman[-1]]
    index = len(roman) - 2
    while index >= 0:
        if char_map[roman[index]] < char_map[roman[index + 1]]:
            sum -= char_map[roman[index]]
        else:
            sum += char_map[roman[index]]
        index -= 1

    return sum


if __name__ == '__main__':
    result = roman2int("VIII")
    print(result)
