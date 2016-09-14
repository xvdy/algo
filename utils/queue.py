# -*- coding:utf-8 -*-
__author__ = 'xdy'


class Queue:
    def __init__(self):
        self.container = []

    def enqueue(self, value):
        self.container.append(value)

    def dequeue(self):
        if self.container:
            return self.container[0]
