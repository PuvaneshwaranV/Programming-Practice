def less100(n):
    while(n>0):
        if(n%11==0):
            return n
        n+=1
def greater100(n):
    while(n>0):
        k=n
        r=0
        re=0
        while(k>0):
            re=k%10
            r=r*10+re
            k=int(k/10)
        if(n==r):
            return n
        n+=1
n=input("Enter the Number")
try:
    n=n+1
    if(n>9):
        if(n<100):
            k=less100(n)
            print(k)
        else:
            k=greater100(n)
            print(k)
    else:
        print("Input must be greater than 9")
except:
    print("Invalid input")