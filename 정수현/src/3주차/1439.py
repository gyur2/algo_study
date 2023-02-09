# [BOJ] 뒤집기 / 실버5 / 15분
# https://www.acmicpc.net/problem/1439
# 풀이 방법: 0이 연속된 항의 개수와 1이 연속된 항의 개수를 각각 계산,
# 항의 수가 적은 쪽을 뒤집으면 되는데, 항이 적은 쪽의 수가 곧 뒤집어야 할 횟수.

S = input()
count0 = 0
count1 = 0
answer = 0

for i in range(len(S) - 1):
    if S[i] != S[i + 1]:
        # 왜인지 한줄로 줄여쓰는 게 안 돼서.. 일단 이렇게 적음
        if S[i] == '0':
            count0 += 1
        else:
            count1 += 1

# 위의 for문은 0 -> 1이나 1 -> 0 으로 바뀔 때만 count되기 때문에,
# 마지막 항의 검사도 꼭 해줘야 함
if S[-1] == '0':
    count0 += 1
else:
    count1 += 1

# 0의 항과 1의 항의 수가 같으면 뭘 뒤집어줘도 상관X
print(count0) if count0 <= count1 else print(count1)