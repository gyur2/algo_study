import sys
import math

n, l = map(int, sys.stdin.readline().split())
pool = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
pool.sort(key=lambda x: (x[0], x[1]))

answer = 0
plank = 0

for start, end in pool:
    start = max(start, plank)
    cnt = math.ceil((end-start) / l)
    plank = start + cnt * l
    answer += cnt

print(answer)