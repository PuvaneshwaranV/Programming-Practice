str=input("Enter the word")
mid=int(((len(str))/2))
o=len(str)%2
k=mid
i=0
p=""
while(i<len(str)):
    if(k<len(str)):
        j=0
        if(o==1):
            for u in range(2*len(str)-(i*2)):
                p+=" "
            while(j<(i+1) and j<=(mid+1)):
                p+=str[mid+j]
                j+=1
        else:
            for u in range(2*len(str)-(i*2)):
                p+=" "
            while(j<(i+1) and j<=(mid)):
                p+=str[mid+j]
                j+=1
        p+="\n"
        k+=1
        i+=1
    else:
        j=0
        if(o==1):
            for u in range(2*len(str)-(i*2)):
                p+=" "
            while(j<(i+1) and j<=(mid)):
                p+=str[mid+j]
                j+=1
            t=i-mid
            for e in range(t):
                p+=str[e]
        else:
            j=1
            for u in range(2*len(str)-(i*2)):
                p+=" "
            while(j<(i+1) and j<=(mid-1)):
                p+=str[mid+j-1]
                j+=1
            p+=str[mid+j-1]
            t=i-mid+1
            for e in range(t):
                p+=str[e]
        p+="\n"
        k+=1
        i+=1
print(p)
