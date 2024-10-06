memory1=int(input("Enter The Memory one's Bits Value: "))
memory2=int(input("Enter The Memory Two's Bits Value: "))
i=1
def RAM(i,memory1,memory2): 
    if(memory1!=0 and memory2!=0):
        while(i<=memory1 or i<=memory2):
            if(memory1<memory2):
                memory2-=i
                i+=1
            elif(memory2<memory1):
                memory1-=i
                i+=1
            else:
                memory1-=i
                i+=1
        return i,memory1,memory2
    else:
        return i,memory1,memory2
i,memory1,memory2=RAM(i,memory1,memory2)
print(i,memory1,memory2)

