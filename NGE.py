arr=[6,3,9,10,8,2,1,15,7]
arr1=['_']*len(arr)
i=0
while(i<len(arr)):
    k=0
    j=0
    m=0
    index=0
    while(j<len(arr)):
        if(arr[i]<arr[j]):
            t=arr[j]-arr[i]
            if(m==0):
                k=t
                index=j
                m+=1
            elif(k>t):
                k=t
                index=j
                m+=1
        j+=1
    if(m!=0):
        arr1[i]=arr[index]
    i+=1
print(arr1)