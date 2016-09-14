# -*- coding:utf-8 -*-
__author__ = 'xdy'


class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self, node):
        self.head = node

    def add_node(self, node):
        current_node = self.head

        while current_node.next:
            current_node = current_node.next

        current_node.next = node

    def echo_me(self):
        current_node = self.head

        while current_node.next:
            print(current_node.value)
            current_node = current_node.next

        print(current_node.value)
