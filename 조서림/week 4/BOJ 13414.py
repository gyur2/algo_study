import sys

k, l = map(int, sys.stdin.readline().split())

students = {}

for i in range(l):
    students[sys.stdin.readline().strip()] = i

students = sorted(students.items(), key=lambda x: x[1])

for i in range(min(k, len(students))):
    print(students[i][0])