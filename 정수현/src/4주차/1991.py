# [BOJ] 트리 순회 / 실버1 / X
# https://www.acmicpc.net/problem/1991
# https://jm-codingmemo.tistory.com/22
# 이전에 직접 작성한 소스코드 참고

N = int(input())
# root = key, [left, right] = value
tree = {}

for i in range(N):
    root, left, right = input().split()
    tree[root] = [left, right]

def preorder(root):
    if root != ".":
        print(root, end = "")
        preorder(tree[root][0])
        preorder(tree[root][1])

def inorder(root):
    if root != ".":
        inorder(tree[root][0])
        print(root, end = "")
        inorder(tree[root][1])

def postorder(root):
    if root != ".":
        postorder(tree[root][0])
        postorder(tree[root][1])
        print(root, end = "")

# 항상 A가 루트 노드가 되므로
preorder('A')
print()
inorder('A')
print()
postorder('A')