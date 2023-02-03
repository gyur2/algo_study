# [BOJ] 숫자의 개수 / 브론즈2 / 5분
# https://www.acmicpc.net/problem/2577

ABC = 1
for _ in range(3):
    ABC *= int(input())

for i in range(10):
    count = 0
    for j in str(ABC):
        if str(i) == j:
            count += 1
    print(count)