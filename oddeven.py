n=input("Enter the Number")
o=0
e=0
i=0
if(n.isdigit()):
    while(i<len(n)):
        n1=int(n[i])
        if(n1%2==0):
            e+=1
            i+=1
        else:
            o+=1
            i+=1
    print("Even Count")
    print(e)
    print("Odd Count")
    print(o)
else:
    print("Invlid Input")