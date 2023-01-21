N = int(input())

words = []
for _ in range(N):
    words.append(input())
    
answer = N
for word in words:
    check = [0] * 26
    prev = word[0]
    check[ord(prev) - 97] = 1 # a는 97
    
    for i in range(1, len(word)):
        curr = word[i]
        if (check[ord(curr) - 97] == 0) or (check[ord(curr) - 97] == 1 and prev == curr):
            prev = curr
            check[ord(prev) - 97] = 1
        else:
            answer -= 1
            break

print(answer)

# check == 0 : 상관 없음
# check == 1 : prev와 curr가 같으면 괜찮음, prev와 curr가 다르면 정답에서 제외