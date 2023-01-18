# 백준 1920번: 수 찾기(실버4)
# 풀이 시간: 20분
# 시간 초과로 실패해서 인터넷 참고함

# 입력받기
N = int(input())
A = set(input().split())

M = int(input())
B = list(input().split())

for i in range(len(B)):
    print(1) if B[i] in A else print(0)
