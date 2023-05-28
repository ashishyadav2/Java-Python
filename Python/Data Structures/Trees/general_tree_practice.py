class TreeNode:
    def __init__(self,data):
        self.data = data
        self.children = []
        self.parent = None

    def add_child(self,child):
        child.parent = self
        self.children.append(child)
    
    def print_tree(self):
        spaces = ' '*self.get_level()*3
        prefix = spaces+"|--" if self.parent else ""
        print(prefix+self.data)
        if len(self.children) > 0:
            for child in self.children:
                child.print_tree()

    def get_level(self):
        level = 0
        p = self.parent
        while p:
            p = p.parent
            level +=1
        return level

def build_tree():
    root = TreeNode("Nilupul (CEO)")

    chinmay = TreeNode("Chinmay (CTO)")
    vishwa = TreeNode("Vishwa Infrastructure head")

    chinmay.add_child(vishwa)
    chinmay.add_child(TreeNode("Aamir (Application Head)"))

    vishwa.add_child(TreeNode("Dhaval (Cloud Manager)"))
    vishwa.add_child(TreeNode("Abhijit (App Manager)"))

    gels = TreeNode("HR Head")
    gels.add_child(TreeNode("Peter (Recruitment Manager)"))
    gels.add_child(TreeNode("Waqas (Policy Manager)"))

    root.add_child(chinmay)
    root.add_child(gels)

    return root

if __name__ == '__main__':
    root = build_tree()
    root.print_tree()
    pass