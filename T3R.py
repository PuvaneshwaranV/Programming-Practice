arr=[3,4,2,3,4,4,4,4,16,3,15,16,15,15,16,2,3]
arr1=['_']*6
i=0
while(i<len(arr)):
    j=0
    if(arr[i]!=arr1[0] and arr[i]!=arr1[1] and arr[i]!=arr1[2]):
        j+=1
        k=i+1
        while(k<len(arr)):
            if(arr[k]==arr[i]):
                j+=1
            k+=1
        if(arr1[3]=="_" or (arr1[3])<j):
            arr1[5]=arr1[4]
            arr1[4]=arr1[3]
            arr1[3]=j
            arr1[2]=arr1[1]
            arr1[1]=arr1[0]
            arr1[0]=arr[i]
        elif(arr1[4]=="_" or (arr1[4])<j):
            arr1[5]=arr1[4]
            arr1[4]=j
            arr1[2]=arr1[1]
            arr1[1]=arr[i]
        elif(arr1[5]=="_" or (arr1[5])<j):
            arr1[5]=j
            arr1[2]=arr[i]
    i+=1
for p in range(3):
    print(arr1[p])