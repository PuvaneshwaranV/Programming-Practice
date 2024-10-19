def distance(x, y):
    try:
        if x >= y:
            return x - y
        else:
            return y - x
    except Exception as e:
        print(f"Error calculating distance: {e}")
        return None

def mindiff(Marr):
    try:
        if len(Marr) < 2:
            raise ValueError("Array must contain at least two elements")
        
        i = 0
        k = distance(Marr[0], Marr[1])  # Initialize with the first two elements' distance
        while i < len(Marr):
            j = i + 1
            while j < len(Marr):
                n = distance(Marr[i], Marr[j])
                if n is not None and n < k:
                    k = n
                j += 1
            i += 1
        return k
    except Exception as e:
        print(f"Error in mindiff: {e}")
        return None

def pair(Marr, k):
    try:
        ans = []
        i = 0
        while i < len(Marr):
            j = i + 1
            while j < len(Marr):
                n = distance(Marr[i], Marr[j])
                if n is not None and n == k:
                    ans.append(Marr[i])
                    ans.append(Marr[j])
                j += 1
            i += 1
        return ans
    except Exception as e:
        print(f"Error finding pairs: {e}")
        return []

def short(ans):
    try:
        i = 0
        while i < len(ans) - 1:
            j = i + 1
            k = ans[i]
            t = i
            while j < len(ans):
                if k > ans[j]:
                    k = ans[j]
                    t = j
                j += 1
            ans[t] = ans[i]
            ans[i] = k
            i += 1
        return ans
    except Exception as e:
        print(f"Error sorting the array: {e}")
        return ans

def inputs(Marr, M):
    try:
        for i in range(M):
            Marr[i] = int(input("Enter the Element: "))
        return Marr
    except ValueError:
        print("Invalid input! Please enter integers only.")
        return []

try:
    M = int(input("Enter the length of the array: "))
    if M <= 0:
        raise ValueError("Length must be a positive integer.")
    
    Marr = [None] * M
    Marr = inputs(Marr, M)
    
    if len(Marr) < 2:
        raise ValueError("At least two elements are required to find the minimum difference.")
    
    Marr = short(Marr)
    k = mindiff(Marr)
    
    if k is not None:
        ans = pair(Marr, k)
        print("Pairs with the minimum difference:", ans)
    else:
        print("Could not calculate minimum difference.")

except ValueError as e:
    print(f"Input error: {e}")
except Exception as e:
    print(f"An unexpected error occurred: {e}")
