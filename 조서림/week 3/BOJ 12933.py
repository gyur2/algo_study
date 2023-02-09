def quack(s):
    duck = []
    sound = "quack"
    
    for c in s:
        if c == "q": # q일 때
            flag = True
            for i in range(len(duck)):
                if len(duck[i]) % 5 == 0: # 울음소리가 완성된 오리가 있다면 새 울음 시작
                    duck[i] += c
                    flag = False
                    break
            if flag: # 울음소리가 완성된 오리가 없다면 새 오리 시작
                duck.append("q")
        
        else: # q가 아닐 때
            flag = True
            for i in range(len(duck)):
                if len(duck[i]) % 5 == sound.find(c): # 울음소리 순서에 맞는 오리가 있다면 해당 오리에 문자 추가
                    duck[i] += c
                    flag = False
                    break
            if flag:
                return -1 # 울음소리 순서에 맞는 오리가 없다면 잘못된 울음소리
    
    for d in duck:
        if len(d) % 5 != 0: # 울음소리를 완성하지 못한 오리가 있다면 잘못된 울음소리
            return -1
    return len(duck) # 오리의 수 return

s = input()
print(quack(s))