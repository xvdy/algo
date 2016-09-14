# -*- coding:utf-8 -*-
__author__ = 'xdy'


class Node(object):
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def add_left(self, TreeNode):
        self.left = TreeNode

    def add_right(self, TreeNode):
        self.right = TreeNode

    def __str__(self):
        return self.value

    def echo(self):
        print(self.value)
