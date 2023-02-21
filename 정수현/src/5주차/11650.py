# [BOJ] 좌표 정렬하기 / 실버5 / 15분
# https://www.acmicpc.net/problem/11650
# 알고리즘 자체는 쉬운데 시간초과가 많이 남

graph = []
for _ in range(int(input())):
    graph.append(list(map(int, input().split())))

graph.sort()

for i in graph:
    print(*i)