# [BOJ] 소가 길을 건너간 이유 1 / 브론즈1 / 25분
# https://www.acmicpc.net/problem/14467

# locate = 소의 위치
locate = ['' for _ in range(10)]
answer = 0
N = int(input())

# c = 소의 번호, l = 소의 위치
for i in range(N):
    c, l = input().split()
    # 소의 번호가 1 ~ 10이므로 번호에서 1을 빼주기
    locate[int(c) - 1] += l

# print(locate)

for i in range(len(locate)):
    # 만약 빈 인덱스다 -> 소를 관찰하지 않았다
    # 그러므로 그 인덱스는 넘긴다
    if len(locate[i]) == 0:
        continue

    # locate의 각 인덱스 내부를 검사
    # -1을 안 하면 out of range이므로 주의!!!
    # locate[i], 즉 현재 인덱스의 어떤 문자가 다음 문자와 다르면
    # 소가 이동을 한 것이기 때문에 answer를 1만큼 늘려준다.
    for j in range(len(locate[i]) - 1):
        if locate[i][j] != locate[i][j + 1]:
            answer += 1

print(answer)