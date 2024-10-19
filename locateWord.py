def string(s2):
    try:
        s5 = ""
        for i in range(len(s2)):
            s5 += s2[i]
            if i != (len(s2) - 1):
                s5 += " "
        return s5
    except:
        return "Invalid Input"
def locateWord(s):
    try:
        s1 = s.split(" ") 
        s2 = [None] * len(s1)  
        i = 0
        while i < len(s1):
            s3 = s1[i]
            j = 0
            k = 0
            s4 = ""
            while j < len(s3):
                if s3[j].isdigit():
                    k = int(s3[j])  
                else:
                    s4 += s3[j]
                j += 1
            s2[k] = s4  
            i += 1
        s5 = string(s2)  
        return s5
    except (IndexError, ValueError) as e:
        return f"Invalid Input: {e}"  
s = "t2o j3oin 4WonderBiz I0 Technolog5ies wan1t"
s4 = locateWord(s)
print(s4)
