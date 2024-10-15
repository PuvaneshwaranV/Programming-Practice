s=input("Enter the String: ")
def StrExpand(s):
    l=len(s)
    i=0
    ans=""
    while(i<l):
        if(s[i].isalpha() and s[i+1].isdigit()):
            p=i
            i=i+1
            n=0
            k=10
            while(i<l and s[i].isdigit()):
                n=(n*k)+int(s[i])
                i=i+1
            for j in range(n):
                ans+=s[p]
        else:
            i=l+1
    if(i!=l or i==l+1 or s[l-1].isalpha() or s[0].isdigit()):
        return "Invalid Input"
    else:
        return ans
ans1=StrExpand(s)
print(ans1)


