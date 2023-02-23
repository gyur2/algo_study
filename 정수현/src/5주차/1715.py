# [BOJ] 카드 정렬하기 / 골드4 / 35분
# https://www.acmicpc.net/problem/1715
# https://cocobi.tistory.com/204

# 우선순위 큐 사용
from queue import PriorityQueue

answer = 0
card = PriorityQueue()

for i in range(int(input())):
    card.put(int(input()))

# 우선순위 큐에 남은 원소가 없을 때까지 계속 더하기
while card.qsize() != 0:
    current = card.get()
    if card.qsize() == 0:
        break
    current += card.get()
    answer += current
    card.put(current)

print(answer)
