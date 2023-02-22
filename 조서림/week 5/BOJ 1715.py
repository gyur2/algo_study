import sys
from queue import PriorityQueue

n = int(sys.stdin.readline())
if n == 1:
    print(0)
    exit()

bundle = PriorityQueue()
for _ in range(n):
    bundle.put(int(sys.stdin.readline()))
    
answer = 0
while not bundle.empty():
    b1 = bundle.get()
    b2 = bundle.get()
    
    answer += b1 + b2
    if not bundle.empty(): bundle.put(b1 + b2)
    
print(answer)