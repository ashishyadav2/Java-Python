class TreeNode: #class definition
    def __init__(self,data): #constructor
        self.data = data 
        self.children = []
        self.parent = None

# This code defines a class called TreeNode. This class represents a node in a tree data structure.

# The __init__ method is a constructor that initializes a new instance of the TreeNode class. It takes one parameter, data, which is the value that the node will hold. The constructor initializes three instance variables:

# self.data: This is the data that the node holds.
# self.children: This is a list of child nodes. Initially, this list is empty.
# self.parent: This is a reference to the parent node. Initially, it is set to None.
# The children and parent variables are used to connect nodes in a tree. By default, a new node is created without any children, and the parent is set to None. These variables can be modified later to create a tree structure.

    def add_child(self,child): 
        child.parent = self 
        self.children.append(child)
    
# This code defines a method called add_child for the TreeNode class. This method takes one parameter, child, which is an instance of the TreeNode class that will be added as a child of the current node.

# The method first sets the parent of the child node to be the current node (self). This is done so that the child node knows who its parent is.

# Next, the child node is appended to the children list of the current node using the append method.

# This add_child method is used to build a tree structure. Each node in the tree can have any number of child nodes. When a new child node is added to a parent node, the parent-child relationship is established by setting the child's parent to be the parent node, and adding the child to the parent's list of children.
    def print_tree(self):
        spaces = ' '*self.get_level()*3
        prefix = spaces+"|--" if self.parent else ""
        print(prefix+self.data)
        if len(self.children)>0:
            for child in self.children:
                child.print_tree()

# This code defines a method called print_tree for the TreeNode class. This method prints out the tree rooted at the current node in a readable format.

# The method first calculates the level of the current node in the tree by calling the get_level method. It then creates a string of spaces that corresponds to the level of the current node multiplied by 3. This string of spaces is used to visually align the nodes in the tree.

# The prefix variable is then created, which is either an empty string if the current node has no parent, or a string that includes the appropriate number of spaces and a vertical bar followed by two hyphens (|--) to visually represent the connection between parent and child nodes.

# The data of the current node is then printed out, with the appropriate prefix.

# If the current node has any children, the method recursively calls the print_tree method on each child node. This will print out the tree rooted at each child node in a similar format, indented by an additional three spaces for each level deeper in the tree.

# Overall, this method is useful for visualizing the structure of a tree data structure and understanding the relationships between nodes.



    def get_level(self): #going bottom to top parent to parent and incrementing level
        level = 0
        p = self.parent
        while p:
            level+=1
            p = p.parent
        return level

# This code defines a method called get_level for the TreeNode class. This method returns the level of the current node in the tree data structure.

# The level variable is initialized to zero. Then, a pointer p is created and set to the parent of the current node. The method then enters a while loop that continues until the pointer p is None.

# During each iteration of the loop, the level counter is incremented by 1, and p is set to the parent of the current node. This continues until the pointer p is None, which means that the current node is the root of the tree.

# Finally, the level counter is returned, which represents the level of the current node in the tree.

# This method is useful for other methods that need to print the tree or manipulate its structure based on the level of a particular node.

def build_product_tree():
    root = TreeNode("Electronics") #made instance of TreeNode class and added data 'Electronics' in it assigned that value to root
    laptop = TreeNode("Laptop") #made instance of TreeNode class... same as above
    laptop.add_child(TreeNode("acer"))
    laptop.add_child(TreeNode("macbook"))
    laptop.add_child(TreeNode("asus"))

    tvs = TreeNode("TV")
    tvs.add_child(TreeNode("samsung"))
    tvs.add_child(TreeNode("lg"))

    mobile = TreeNode("Mobile")
    mobile.add_child(TreeNode("apple"))
    mobile.add_child(TreeNode("google"))
    mobile.add_child(TreeNode("samsung"))

    root.add_child(laptop) #made laptop as a child of root
    root.add_child(tvs)
    root.add_child(mobile)
    return root

if __name__ == '__main__':
    root = build_product_tree()
    root.print_tree()
    pass
# This code checks whether the script is being run as the main program by checking if the special variable __name__ is equal to '__main__'.

# If the script is being run as the main program, then the build_product_tree() function is called. This function is not defined in the code snippet provided, so it is likely defined in a different module or further down in the same module.

# Using the if __name__ == '__main__': statement is a common practice in Python to separate code that is meant to be executed when a script is run directly from code that is meant to be imported as a module by other scripts. When a module is imported, the code in the if block is not executed. However, when a script is run directly, the code in the if block is executed. This allows a module to both define functions and classes that can be imported by other modules, and also include code that can be executed as a script.