# [BOJ] 균형잡힌 세상 / 실버4 / 20분
# https://www.acmicpc.net/problem/4949

bracketList = ['(', ')', '[', ']']
bracketFront = ['(', '[']

while True:
    # bracket = stack의 역할
    bracket = ""
    S = input()

    # .가 입력으로 들어올 시 입력 종료
    if S == ".":
        break

    for i in S:
        # 문자열 중 괄호를 발견했을 경우
        if i in bracketList:
            # stack의 top이 '(' 또는 '['일 경우
            if len(bracket) > 0 and bracket[-1] in bracketFront:
                # 스택의 top이 ()나 []가 될 경우 pop
                if (bracket[-1] == '(' and i == ')') or (bracket[-1] == '[' and i == ']'):
                    bracket = bracket[:-1]
                # 아닐 경우에는 stack에 저장
                else:
                    bracket += i
            else:
                bracket += i

    print("yes") if len(bracket) == 0 else print("no")