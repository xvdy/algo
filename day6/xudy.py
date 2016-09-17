# -*- coding:utf-8 -*-

def prepare_data():
    d1 = [[1, 2, 3],
          [4, 5, 6],
          [7, 8, 9]]
    d2 = [[1, 2, 3, 4],
          [5, 6, 7, 8],
          [9, 10, 11, 12],
          [13, 14, 15, 16]]
    return d1


def quick_rotate(image):
    # params check
    l = len(image)
    for i in image:
        if not l == len(i):
            return

    il = l - 1
    # 沿对角线翻折
    for i in xrange(l - 1):
        for j in xrange(l - i - 1):
            image[i][j], image[il - j][il - i] = image[il - j][il - i], image[i][j]
    # 沿水平线翻折
    for i in xrange(il / 2):
        image[i], image[il - i] = image[il - i], image[i]

    return image


def display(image):
    for i in image:
        s = ""
        for j in i:
            s += str(j).ljust(4)
        print(s)
    print('-' * 20)


d = prepare_data()
display(d)
display(quick_rotate(d))
