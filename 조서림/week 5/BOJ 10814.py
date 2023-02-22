import sys

n = int(sys.stdin.readline())
member = []
for i in range(n):
    age, name = map(str, sys.stdin.readline().split())
    member.append((name, int(age), i))

for name, age, order in sorted(member, key=lambda x: (x[1], x[2])):
    print(age, name)