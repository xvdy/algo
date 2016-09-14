# -*- coding:utf-8 -*-
__author__ = 'xdy'


class Stack:
    def __init__(self):
        self.container = []

    def push(self, value):
        self.container.append(value)

    def pop(self):
        return self.container.pop(-1) if self.container else None

    def is_empty(self):
        return len(self.container) == 0

    def echo_me(self):
        print('bottom-->top %s' % str(self.container))