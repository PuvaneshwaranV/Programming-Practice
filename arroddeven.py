arr=[-23,1,-2,-34,0,64]
i=0
while(i<(len(arr)-1)):
    k=arr[i]
    t=i
    j=i+1
    while(j<len(arr)):
        if(k>arr[j]):
            k=arr[j]
            t=j
        j+=1
    arr[t]=arr[i]
    arr[i]=k
    i+=1
print(arr)
i=0
j=len(arr)-1
t=0
k=j
arr1=[0]*len(arr)
while(i<len(arr)):
    if((arr[i]%2)!=0):
        arr1[t]=arr[i]
        t+=1
    else:
        arr1[k]=arr[i]
        k-=1
    i+=1
print(arr1)