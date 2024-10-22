arr=[2,2,3,3,4,4,5,5]
i=0
k=0
s=[]
while i<len(arr):
    if(arr[i]==0):
        k+=1
    elif((i+1)<len(arr) and arr[i]==arr[i+1]):
        arr[i]+=arr[i]
        s.append(arr[i])
        arr[i+1]=0
    else:
        s.append(arr[i])
    i+=1
while(k>0):
    s.append(0)
    k-=1
print(s)
