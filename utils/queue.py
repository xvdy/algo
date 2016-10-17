# -*- coding:utf-8 -*-
__author__ = 'xdy'


class Queue:
    def __init__(self):
        self.container = []

    def enqueue(self, value):
        self.container.append(value)

    def dequeue(self):
        if self.container:
            queue_head = self.container[0]
            self.container = self.container[1:]
            return queue_head

    def __nonzero__(self):
        return len(self.container) > 0
