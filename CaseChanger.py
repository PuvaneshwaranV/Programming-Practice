n=input("Enter the String")
n1=len(n)
i=0
n2=""
while(i<n1 and i!=-1):
    if(ord(n[i])>64 and ord(n[i])<91):
        n2+=n[i]
        i+=1
        while(i<n1 and n[i]!=" "):
            if(ord(n[i])>64 and ord(n[i])<91):
                n2+=n[i]
                i+=1
            elif(ord(n[i])>47 and ord(n[i])<58):
                n2+=chr(ord(n[i]))
                i+=1
            elif(ord(n[i])>96 and ord(n[i])<123):
                n2+=chr(ord(n[i])-32)
                i+=1
            else:
                 print("Input must Alphabets or Numbers")
                 i=-2
                 break
    elif(ord(n[i])>96 and ord(n[i])<123):
        n2+=n[i]
        i+=1
        while(i<n1 and n[i]!=" "):
            if(ord(n[i])>64 and ord(n[i])<91):
                n2+=chr(ord(n[i])+32)
                i+=1
            elif(ord(n[i])>47 and ord(n[i])<58):
                n2+=chr(ord(n[i]))
                i+=1
            elif(ord(n[i])>96 and ord(n[i])<123):
                n2+=n[i]
                i+=1
            else:
                 print("Input must Alphabets or Numbers")
                 i=-2
                 break
    elif(ord(n[i])>47 and ord(n[i])<58):
                n2+=0
                i+=1
    if(i<n1 and n[i]==" "):
         n2+=n[i]
    i+=1
if(i!=-1):
    print(n2)
