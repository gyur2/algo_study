# 백준 1316: 그룹 단어 체커
# 풀이 시간: X, 인터넷 참고
# https://hyunsun99.tistory.com/142

N = int(input())
correctCase = N

for _ in range(N):
    word = input()
    for j in range(0, len(word) - 1):
        if word[j] == word[j + 1]:
            pass
        elif word[j] in word[j + 1:]:
            correctCase -= 1
            break
print(correctCase)
