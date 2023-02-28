class BinarySearchTree:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    def addChild(self, val):
        if val == self.data:
            return
        if val < self.data:
            if self.left:
                self.left.addChild(val)
            else:
                self.left = BinarySearchTree(val)

        else:
            if self.right:
                self.right.addChild(val)
            else:
                self.right = BinarySearchTree(val)

    def pre_order_traversal(self):
        elements = []
        elements.append(self.data)
        if self.left:
            elements += self.left.pre_order_traversal()
        if self.right:
            elements += self.right.pre_order_traversal()
        return elements

    def in_order_traversal(self):
        elements = []
        if self.left:
            elements += self.left.in_order_traversal()
        elements.append(self.data)
        if self.right:
            elements += self.right.in_order_traversal()
        return elements

    def post_order_traversal(self):
        elements = []
        if self.left:
            elements += self.left.post_order_traversal()
        if self.right:
            elements += self.right.post_order_traversal()
        elements.append(self.data)
        return elements

    def max_of_tree(self):
        if self is None:
            return
        max_node = self.data
        if self.right:
            max_node = max(max_node, self.right.max_of_tree())
        return max_node

    def min_of_tree(self):
        if self.left is None:
            return self.data
        return self.left.min_of_tree()
    
    # def min_of_tree(self):
    #     if self is None:
    #         return
    #     min_node = self.data
    #     if self.left:
    #         min_node = min(min_node, self.left.min_of_tree())
    #     return min_node

    def sum_of_tree(self):
        if self is None:
            return
        sum_of_tree = self.data
        if self.right:
            sum_of_tree += self.right.sum_of_tree()
        if self.left:
            sum_of_tree += self.left.sum_of_tree()
        return sum_of_tree


def build_trees(nums):
    root = BinarySearchTree(nums[0])
    for i in nums:
        root.addChild(i)
    return root


if __name__ == '__main__':
    nums = [2, 9, 46, 7, 95, -90, 49, 64]
    nums_tree = build_trees(nums)
    pre = nums_tree.pre_order_traversal()
    in_order = nums_tree.in_order_traversal()
    post_order = nums_tree.post_order_traversal()
    max_node = nums_tree.max_of_tree()
    min_node = nums_tree.min_of_tree()
    sum = nums_tree.sum_of_tree()
    print("Pre Order: {}".format(pre))
    print("In Order: {}".format(in_order))
    print("Post Order: {}".format(post_order))
    print("Max: {}".format(max_node))
    print("Min: {}".format(min_node))
    print("Sum: {}".format(sum))
