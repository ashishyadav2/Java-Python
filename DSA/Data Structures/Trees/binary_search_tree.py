class BinarySearchTreeNode:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
    
    def add_child(self,data):
        if data == self.data: #if data is already present no addition
            return
        if data<self.data:
            if self.left: #if your not at leaf node it has some node
                self.left.add_child(data) # recursively call add child function
            else: # else create left node
                self.left = BinarySearchTreeNode(data)
        else:
            if self.right:
                self.right.add_child(data)
            else:
                self.right = BinarySearchTreeNode(data)

    def in_order_traversal(self):
        elements = []
        if self.left: # if some thing present in left side. visit left tree
            elements += self.left.in_order_traversal()

        elements.append(self.data) # insert data from base node

        if self.right:
            elements += self.right.in_order_traversal()        

        return elements

    def search(self,val):
        if self.data == val:
            return True

        if val<self.data:# val may be in left tree
            if self.left: # if left node exists
                return self.left.search(val)

        if val>self.data:
            if self.right:
                return self.right.search(val)
        
        return False

def build_tree(elem):
    root = BinarySearchTreeNode(elem[0])

    for i in range(1,len(elem)):
        root.add_child(elem[i])

    return root

if __name__ == '__main__':
    numbers = [17,4,1,20,9,23,18,24]
    numbers_tree = build_tree(numbers)
    # print(numbers_tree.in_order_traversal())
    print(numbers_tree.search(20))