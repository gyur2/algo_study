n, m, r = map(int, input().split())
arr = []
for _ in range(n):
    arr.append(list(map(int, input().split())))

for _ in range(r):
    for t in range(min(m, n) // 2):
        r, c = t, t
        rows, cols = n - 2 * t, m - 2 * t
        tmp = arr[r][c]
        # 좌
        for cur_r in range(r + 1, r + rows):
            original = arr[cur_r][c]
            arr[cur_r][c] = tmp
            tmp = original
        # 하
        for cur_c in range(c + 1, c + cols):
            original = arr[r + rows - 1][cur_c]
            arr[r + rows - 1][cur_c] = tmp
            tmp = original
        # 우
        for cur_r in range(r + rows - 2, r - 1, -1):
            original = arr[cur_r][c + cols - 1]
            arr[cur_r][c + cols - 1] = tmp
            tmp = original
        # 상
        for cur_c in range(c + cols - 2, c - 1, -1):
            original = arr[r][cur_c]
            arr[r][cur_c] = tmp
            tmp = original

for r in arr:
    print(" ".join(map(str, r)))

#https://velog.io/@dd9s2/%EB%B0%B1%EC%A4%80-16926-%EB%B0%B0%EC%97%B4-%EB%8F%8C%EB%A6%AC%EA%B8%B0-1-Python