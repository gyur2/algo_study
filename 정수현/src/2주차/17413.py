# [BOJ] 단어 뒤집기 2 / 실버3 / X
# https://www.acmicpc.net/problem/17413
# stack?
# https://velog.io/@bye9/%EB%B0%B1%EC%A4%80%ED%8C%8C%EC%9D%B4%EC%8D%AC-17413-%EB%8B%A8%EC%96%B4-%EB%92%A4%EC%A7%91%EA%B8%B02

# answer = 최종 출력물
# word = 각 단어들을 뒤집어서, 또는 그대로 저장 후 answer에 추가
S = list(input())
answer = ''
word = ''

# flag = tag 부분인 <>에서는 true, 아니면 false
flag = False

for i in S:
    # tag 부분이 아닐 경우
    if flag == False:

        # tag 부분을 만나면 True로 flag 전환
        if i == '<':
            flag = True
            word += i

        # 공백일 경우 word를 answer에 추가해주고 초기화
        elif i == ' ':
            word += i
            answer += word
            word = ''

        # 둘 다 아닐 경우, 일반 단어이기 때문에 뒤집어서 word에 추가
        else:
            word = i + word

    # tag 부분일 경우
    elif flag == True:
        word += i

        # >일 경우, tag가 끝났기 때문에 False 전환 및 word 초기화
        if i == ">":
            flag = False
            answer += word
            word = ''

print(answer + word)