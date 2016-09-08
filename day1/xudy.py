# -*- coding:utf-8 -*-
__author__ = 'xdy'


# 全排列函数
def permutation(result, str, list):
    """
        取一个数组的全排列
        list：为输入列表
        str：传空字符串
        result： 为结果列表
    """
    if len(list) == 1:
        result.append(str + "," + list[0])
    else:
        for temp_str in list:
            temp_list = list[:]
            temp_list.remove(temp_str)
            permutation(result, str + "," + temp_str, temp_list)


def main():
    tests = "2763541"
    tests_list = [test for test in tests]
    all_sorts = []
    permutation(all_sorts, "", tests_list)

    int_all_sorts = [int("".join(all_sort.split(",")[1:])) for all_sort in all_sorts]

    int_all_sorts.sort()

    if int_all_sorts[-1] == int(tests):
        print(int_all_sorts[0])
    else:
        print(filter(lambda x: x > int(tests), int_all_sorts)[0])


if __name__ == '__main__':
    main()

