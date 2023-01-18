n = input()

L = 0
R = 0
half = len(n) // 2

for i in range(half):
    L += int(n[i])
    R += int(n[i+ half])

if L == R:
    print("LUCKY")
else:
    print("READY")