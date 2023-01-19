n = int(input())
class_info = []
for _ in range(n):
    class_info.append(list(map(int, input().split())))

friends = [[0] * n for _ in range(n)]

for grade in range(5):
    for i in range(n-1):
        for j in range(i+1, n):
            if class_info[i][grade] == class_info[j][grade]:
                friends[i][j] = 1
                friends[j][i] = 1           

cnt = []
for f in friends:
    cnt.append(f.count(1))

print(cnt.index(max(cnt)) + 1)