# [BOJ] 듣보잡 / 실버4 / 10분
# https://www.acmicpc.net/problem/1764

N, M = map(int, input().split())
X, Y = set(), set()

for _ in range(N):
    X.add(input())
for _ in range(M):
    Y.add(input())

print(len(X & Y))
print(*sorted(X & Y), sep='\n')
