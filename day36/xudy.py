# -*- coding:utf-8 -*-
"""
看了你的逻辑,还是你的时间复杂度低一点儿O(m*n), m为字符串个数,n为公共子串长度
我的是先求第一个字符串和第二个字符串的的公共子串a,然后a再与第三个字符串像比求得公共子串c...依次类推.时间复杂度肯定要比你的高.
"""


def get_longest_common_prefix(l):
    def get_common_prefix(a, b):
        if not a or not b:
            return ''
        steps = min(len(a), len(b))
        result = ''
        index = 0
        while index < steps:
            if a[index] == b[index]:
                result += a[index]
            else:
                return result
            index += 1
        return result

    return reduce(get_common_prefix, l)


if __name__ == '__main__':
    result = get_longest_common_prefix(["abcdef", "abcdk", "abcfk"])
    print(result)
