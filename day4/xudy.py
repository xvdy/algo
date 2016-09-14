# -*- coding:utf-8 -*-

from utils.tree import Node
from utils.stack import Stack


def prepare_date():
    root = Node(1)

    root.add_left(Node(2))
    root.add_right(Node(3))

    root.left.add_left(Node(4))
    root.left.add_right(Node(5))
    root.right.add_left(Node(6))
    root.right.add_right(Node(7))

    root.left.left.add_left(Node(8))

    return root


def preorder_visit(node):
    if not node:
        return
    node.echo()
    preorder_visit(node.left)
    preorder_visit(node.right)


def preorder_visit_no_recruse(node):
    current = node
    s = Stack()
    while current or not s.is_empty():
        if current:
            current.echo()

            if current.right:
                s.push(current.right)

            if current.left:
                current = current.left
            else:
                current = None

        else:
            current = s.pop()


def inorder_visit(node):
    if not node:
        return
    inorder_visit(node.left)
    node.echo()
    inorder_visit(node.right)


def inorder_no_recruse(node):
    current = node
    l = Stack()
    r = Stack()

    while current:
        if current.right:
            r.push(current.right)
        if current.left:
            l.push(current.left)
            current = current.left
        else:
            ln = l.pop()
            while ln:
                ln.echo()
                ln = l.pop()
            rn = r.pop()
            rn.echo()
            current = rn


def post_visit(node):
    if not node:
        return
    post_visit(node.left)
    post_visit(node.right)
    node.echo()


root = prepare_date()

print("pre")
preorder_visit(root)  # 1245367
preorder_visit_no_recruse(root)
print("in")
inorder_visit(root)
# inorder_no_recruse(root)
print("post")
post_visit(root)
