def valid(k,m,p,n1):
    y=0
    while(y<p):
        if(n1[y].isdigit()):
            while(y<p and n1[y].isdigit()):
                y+=1
            k+=1
            y-=1
        elif(n1[y]!=" "):
            m=1
            break
        y+=1
    return k,m
def prime(n2):
    o=2
    while(o<(n2/2)):
        if(n2%o==0):
            return 1
        o+=1
    return 0
def logic(s,k,m,n,n1,p):
    if(k==n and m==0):
        i=0
        while(i<p):
            ans=2
            if(n1[i].isdigit):
                n2=0
                k=10
                while(i<p and n1[i].isdigit()):
                    n2=(n2*k)+int(n1[i])
                    i=i+1
                if(n2>3 and n2%2!=0):
                    ans=prime(n2)
                if(ans==0 or n2==2 or n2==3):
                    s+=str(n2)
                    s+=" "
            i+=1
        return s  
    else:
        return "Invalid Input"
n=int(input("Enter the Length"))
n1=input("Enter the Intgers with space between them")
p=len(n1)
k=0
m=0
s=""
k,m=valid(k,m,p,n1)
s=logic(s,k,m,n,n1,p)
print(s)