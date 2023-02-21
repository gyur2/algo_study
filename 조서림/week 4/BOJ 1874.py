n = int(input())
seq = []
for _ in range(n):
    seq.append(int(input()))

ans = []
stack = []
num = 1

for target in seq:
    while len(stack) == 0 or stack[-1] < target:
        stack.append(num)
        ans.append('+')
        num += 1
    
    if target == stack[-1]:
        stack.pop()
        ans.append('-')
    else:
        print("NO")
        exit()
        
for a in ans:
    print(a)