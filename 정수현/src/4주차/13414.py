# [BOJ] 수강신청 / 실버3 / 20분
# https://www.acmicpc.net/problem/13414
# 그냥 풀면 시간초과 남
import sys

# order = 수강신청한 순서
K, L = map(int, input().split())
sugang = {}
order = 1

for i in sys.stdin:
    sid = i.strip()
    sugang[sid] = order
    order += 1

for j in sorted(sugang.items(), key = lambda x: x[1])[:K]:
    print(j[0])