s1="abcdefgh"
s2="beh"
i=0
s3=""
while(i<(len(s1))):
    j=0
    while(j<(len(s2))):
        if(s1[i]==s2[j]):
            break
        j+=1
    if j==len(s2):
        s3+=s1[i]
    i+=1
s1=s3
print(s1)
        