class TreeNode: # v, l, r로 이루어져 있는 자료 구조
    def __init__(self, elem):
        self.elem = elem
        self.left_child = None
        self.right_child = None

    def __repr__(self):
        return str(self)

    def __str__(self):
        return f"{self.elem}"

    def __eq__(self, other):
        if not isinstance(other, TreeNode):
            return False

        if self is other or self.elem == other.elem:
            return True

        return False


def preorder(indata): #전위순회
    ret = []
    born = indata[0][0]
    root = indata[0][0]

    def preorder_recursive(root):
        if root is None:
            return
        ret.append(root)
        preorder_recursive(root.left_child)
        preorder_recursive(root.right_child)
    preorder_recursive(born)
    return ret


def inorder(indata): #중위 순회
    ret = []
    born = indata[0][0]
    root = indata[0][0]

    def inorder_recursive(root):
        if root is None:
            return
        inorder_recursive(root.left_child)
        ret.append(root)
        inorder_recursive(root.right_child)
    inorder_recursive(born)
    return ret


def postorder(indata): #후위 순회
    ret = []
    born = indata[0][0]
    root = indata[0][0]

    def postorder_recursive(root):
        if root is None:
            return
        postorder_recursive(root.left_child)
        postorder_recursive(root.right_child)
        ret.append(root)
    postorder_recursive(born)
    return ret


if __name__ == "__main__":
    n = int(input())
    indata = []

    for i in range(n):
        v, l, r = map(TreeNode, input().split()) #데이터를 class TreeNode로 받기
        indata.append([v, l, r])

    for i in indata:
        if i[1].elem != '.':
            i[0].left_child = TreeNode(i[1].elem)

        if i[2].elem != '.':
            i[0].right_child = TreeNode(i[2].elem)
        #print(i[0], i[0].left_child, i[0].right_child)
    # print(id(indata[0][0].right_child))
    # print(id(TreeNode('A').right_child)) #왜 가리키는 게 다른지 모르겠어
    #print(indata[0][0].right_child.left_child) #E가 나와야하는 데 안나와.....
    #print(indata)

    result = ''
    for i in preorder(indata):
        result += str(i)
    print(result)

    result = ''
    for i in inorder(indata):
        result += str(i)
    print(result)

    result = ''
    for i in postorder(indata):
        result += str(i)
    print(result)