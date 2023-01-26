s = input()

tag = False
word = ""

for c in s:
    if c == "<": # tag check
        tag = True
        
    if tag == False: # tag가 아닐 때
        if c == " ":
            print(word, end=" ")
            word = ""
        else:
            word = c + word
    else: # tag일 때
        if c == ">":
            print(word, end=">")
            tag = False
            word = ""
        else:
            word += c

print(word) # 문장이 단어로 끝났을 때, 마지막 단어 출력