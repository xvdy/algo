# -*- coding:utf-8 -*-
import math


# 这个开始我还没有考虑dp什么那么多,自己想没有想出来,看了网上讨论.
# 假设台阶总是为100阶
# 分为51种情况,有0次两个台阶,有1次上两个台阶...有50次上两个台阶.
# 没有实现,太麻烦

# def count_stairs(n):
#     if n % 2 == 0:
#         count_2 = n / 2 + 1
#         start = 3
#     else:
#         count_2 = (n + 1) / 2 + 1
#         start = 2
#
#     counts = 1
#     for i in xrange(count_2):
#         for j in xrange(start, i):
#             counts *= c(n - 2 * j, 1)
#         counts + count_stairs(n - 1)
#     counts += 2 if start == 3 else 1
#     return counts
#
#
# def c(m, n):
#     return math.factorial(m) / math.factorial(n) ** 2


def count_stairs_dp(n):
    f1 = 1
    f2 = 2
    fn = 0
    if n == 1:
        return f1
    if n == 2:
        return f2
    for i in xrange(n):
        fn = f1 + f2
        f1 = f2
        f2 = fn
    return fn


print(count_stairs_dp(10))
