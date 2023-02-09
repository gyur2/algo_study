s = input()

cnt = [0, 0] # 0과 1이 몇 번씩 등장했는지 count

prev = ""
for c in s:
    if prev != c:
        cnt[int(c)] += 1
        prev = c
        
print(min(cnt))