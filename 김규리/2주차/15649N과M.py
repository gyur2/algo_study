def dfs():
    if len(s) == m:
        print(' '.join(map(str, s)))
        return

    for i in range(1, n + 1):
        if i in s:
            continue
        s.append(i)
        dfs()
        s.pop()


n, m = map(int, input().split())
s = []

dfs()

#재귀 어케 쓰나 참고함
#https://jamesu.dev/posts/2020/04/13/baekjoon-problem-solving-15649/