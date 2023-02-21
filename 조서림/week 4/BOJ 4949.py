open = ["(","["]
close = [")","]"]

while True:
    s = input()
    if s == ".": break
    
    stack = []
    flag = True
    
    for c in s:
        if c in open:
            stack.append(c)
        elif c in close:
            if len(stack) == 0 or open.index(stack.pop()) != close.index(c):
                print("no")
                flag = False
                break
    
    if flag:
        print("yes") if len(stack) == 0 else print("no")