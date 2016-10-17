# -*- coding:utf-8 -*-
from utils.tree import Node
from utils.queue import Queue


# 通过两个队列来访问
# current_queue存储正在遍历的当前层, next_queue存储需要遍历的下一层
def level_visit_two_queue(root):
    current_queue, next_queue = [root, ], []
    while current_queue:
        current_level = []
        for i in current_queue:
            current_level.append(i.value)
            if i.left:
                next_queue.append(i.left)
            if i.right:
                next_queue.append(i.right)
        print(current_level)
        current_queue, next_queue = next_queue, []


# 通过一个队列,：每一次打印一个结点的时候，如果该结点有子结点，则把该结点的子结点放到一个队列的末尾。
# 接下来到队列的头部取出最早进入队列的结点，重复前面的打印操作，直至队列中所有的结点都被打印出来为止.
def level_visit_one_queue(root):
    queue = Queue()
    queue.enqueue(root)
    while queue:
        queue_head = queue.dequeue()
        print(queue_head.value)
        if queue_head.left:
            queue.enqueue(queue_head.left)
        if queue_head.right:
            queue.enqueue(queue_head.right)


def prepare_data():
    root = Node(3)
    root.left = Node(9)
    root.right = Node(20)
    root.right.left = Node(15)
    root.right.right = Node(7)

    return root


if __name__ == '__main__':
    root = prepare_data()
    level_visit_two_queue(root)
    level_visit_one_queue(root)
