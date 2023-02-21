# [BOJ] 나이순 정렬 / 실버5 / 5분
# https://www.acmicpc.net/problem/10814

member = []
for _ in range(int(input())):
    member.append(list(input().split()))

member.sort(key=lambda x:int(x[0]))
for i in member:
    print(*i)
