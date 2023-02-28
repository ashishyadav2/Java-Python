class BinarySearchTreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    def add_child(self, data):
        if data == self.data:  # if data is already present no addition
            return
        if data < self.data:
            if self.left:  # if your not at leaf node it has some node
                # recursively call add child function
                self.left.add_child(data)
            else:  # else create left node
                self.left = BinarySearchTreeNode(data)
        else:
            if self.right:
                self.right.add_child(data)
            else:
                self.right = BinarySearchTreeNode(data)

    def in_order_traversal(self):
        elements = []
        if self.left:  # if some thing present in left side. visit left tree
            elements += self.left.in_order_traversal()

        elements.append(self.data)  # insert data from base node

        if self.right:
            elements += self.right.in_order_traversal()

        return elements

    def search(self, val):
        if self.data == val:
            return True

        if val < self.data:  # val may be in left tree
            if self.left:  # if left node exists
                return self.left.search(val)

        if val > self.data:
            if self.right:
                return self.right.search(val)

        return False

    def find_max(self):
        if self is None:
            return
        max_val = self.data
        if self.right:
            max_val = max(max_val, self.right.find_max())
        return max_val

    def find_min(self):
        if self.left is None: #go down until you reach a node whose left is None and return the self.data do this recursively
            return self.data
        return self.left.find_min()

    def delete(self, val):
        if val<self.data:
            if self.left:
                self.left = self.left.delete(val)

        elif val>self.data:
            if self.right:
                self.right = self.right.delete(val)
        
        else: #it will run if it val == self.data
            if self.left is None and self.right is None: #case 1 if it is the leaf node return None
                return None
            if self.left is None: #case 2 if only right ir present return right
                return self.right
            if self.right is None: #case 2 if only left is present return left
                return self.left

            else: # case 3 the node to be deleted has more than one child then find max in left sub tree replace it with the node data to be deleted and return new left sub tree
                max_val = self.left.find_max()
                self.data = max_val
                self.left  = self.left.delete(max_val)

        return self


def build_tree(elem):
    root = BinarySearchTreeNode(elem[0])

    for i in range(1, len(elem)):
        root.add_child(elem[i])

    return root


if __name__ == '__main__':
    numbers = [2, 9, 46, 7, 95, 0, 49, 64]
    numbers_tree = build_tree(numbers)
    print(numbers_tree.in_order_traversal())
    numbers_tree.delete(49)
    print(numbers_tree.in_order_traversal())
