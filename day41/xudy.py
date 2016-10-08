# -*- coding:utf-8 -*-

tests = ["tea", "and", "ate", "eat", "den"]


def anagrams(strs):
    sorted_strs = [''.join(sorted(str_)) for str_ in strs]
    result = []
    for index, item in enumerate(sorted_strs):
        same_items = [sorted_str for sorted_str in sorted_strs if sorted_str == item]
        if len(same_items) > 1:
            result.append(strs[index])

    return result


if __name__ == '__main__':
    results = anagrams(tests)

    print(results)
