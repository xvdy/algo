# -*- coding:utf-8 -*-


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
