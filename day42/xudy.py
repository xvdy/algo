# -*- coding:utf-8 -*-


def parse_path(path):
    split_path = path.split('/')
    result_path = []
    for path_item in split_path:
        if not path_item or path_item == '.':
            continue
        elif path_item == '..':
            if result_path:
                result_path.pop()
        else:
            result_path.append(path_item)

    return '/' + '/'.join(result_path)

if __name__ == '__main__':
    tests = ['//', '/home/', '/a/./b/../../c/', '/../']
    for test in tests:
        result = parse_path(test)
        print(result)
