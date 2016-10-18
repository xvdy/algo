# -*- coding:utf-8 -*-


def number_binary_tree(n):
    count = [1, 1]

    for i in xrange(2, n + 1):
        current = 0
        for j in xrange(i):
            current += count[j] * count[i - j - 1]
        count.append(current)

    return count[n]


if __name__ == '__main__':
    result = number_binary_tree(3)
    assert result==5

