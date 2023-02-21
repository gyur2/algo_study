# [BOJ] 스택 수열 / 실버2 / 30분
# https://www.acmicpc.net/problem/1874
# push를 오름차순으로 진행하기
# pop != top일 경우 No

# answer = +, - 추가
# flag = No일 경우 True, 아닐 경우 False
# nowNum = 숫자 하나당 단 한 번의 push가 가능하기 때문에 지정함
stack, answer = [], []
flag = False
nowNum = 1
n = int(input())

for i in range(n):
    S = int(input())

    # stack의 길이가 0이거나 stack의 top < S이면 push
    if len(stack) == 0 or stack[-1] < S:
        while nowNum <= S:
            stack.append(nowNum)
            answer.append("+")
            nowNum += 1
        answer.append("-")
        stack.pop()

    # S == top일 경우 그대로 pop
    elif stack[-1] == S:
        answer.append("-")
        stack.pop()

    # 이 외의 케이스는 생성 불가능한 케이스.
    else:
        flag = True
        break

print(*answer, sep = '\n') if flag == False else print("NO")
