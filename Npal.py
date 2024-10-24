s1="he 8768 knonk Malayalam"
s1=s1.lower()
s2=s1.split(" ")
i=0
while(i<(len(s2))):
    j=(len(s2[i])//2)
    s3=""
    s3=s2[i]
    k=0
    while(k<j):
        if(s3[k]!=s3[len(s2[i])-1-k]):
            break
        k+=1
    if(k!=j):
        print(s2[i])
    i+=1