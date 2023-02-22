import sys

n = int(sys.stdin.readline())
word = {}
for _ in range(n):
    w = sys.stdin.readline().strip()
    word[w] = len(w)
    
for w, l in sorted(word.items(), key=lambda x: (x[1], x[0])):
    print(w)