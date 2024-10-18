s=input("Enter the String: ")
i=0
s1=""
while(i<(len(s)-1)):
    if(s[i]=="a"  or s[i]=="e"  or s[i]=="i" or s[i]=="o" or s[i]=="u" or s[i]=="A" or s[i]=="E" or s[i]=="I" or s[i]=="O" or s[i]=="U"):
        pass
    else:
        s1+=s[i]
    i+=1
print(s1)
