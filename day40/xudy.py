# -*- coding:utf-8 -*-


def get_next(current):
    current_item = current[0]
    current_count = 0
    result = ''
    for index, item in enumerate(current):
        if current_item == item:
            current_count += 1
        else:
            result += (str(current_count) + current_item)
            current_count = 1
            current_item = item
    # 最有一个字符,也需要再统计一下
    result += (str(current_count) + current_item)
    return result


def get_nth(n):
    next = '1'
    for i in xrange(1, n):
        next = get_next(next)

    return next


if __name__ == '__main__':
    # result = get_next('21')
    # print(result)
    print(get_nth(3))
