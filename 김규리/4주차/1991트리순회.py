#참고 https://jm-codingmemo.tistory.com/22

n = int(input())
indata = {}

for i in range(n):
    v, l, r = map(str, input().split())
    indata[v] = [l, r]
root = 'A'

def preorder(v): #전위순회
    if v != '.':
        print(v, end='')
        preorder(indata[v][0])
        preorder(indata[v][1])


def inorder(v): #중위 순회
    if v != '.':
        inorder(indata[v][0])
        print(v, end='')
        inorder(indata[v][1])

def postorder(v): #후위 순회
    if v != '.':
        postorder(indata[v][0])
        postorder(indata[v][1])
        print(v, end='')

preorder(root)
print()
inorder(root)
print()
postorder(root)