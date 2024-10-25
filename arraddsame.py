arr=[2,2,3,3,4,4,5,5]
i=0
k=0
s=[0]*len(arr)
while i<len(arr):
    if(arr[i]==0):
        pass
    elif((i+1)<len(arr) and arr[i]==arr[i+1]):
        arr[i]+=arr[i]
        s[k]=arr[i]
        arr[i+1]=0
        k+=1
    else:
        s[k]=arr[i]
        k+=1
    i+=1
print(s)
