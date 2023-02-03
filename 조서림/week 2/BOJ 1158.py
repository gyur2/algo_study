from collections import deque

n, k = map(int, input().split())
num = deque([i for i in range(1,n+1)])

print("<", end="")
for i in range(n-1):
    for _ in range(k-1):
        num.append(num.popleft())
    print(num.popleft(), end="")
    print(",", end=" ")

print(num.popleft(), end="")
print(">")