def int_to_binary(n):
    try:
        if not isinstance(n, int) or n < 0:  # Check for non-integer or negative input
            raise ValueError("Input must be a non-negative integer")
        
        if n == 0:
            return "0"
    
        binary = ""
        while n > 0:
            binary = str(n % 2) + binary
            n = n // 2
        return binary
    
    except ValueError as ve:
        return str(ve)
    except Exception as e:
        return "An error occurred: " + str(e)

# Example usage:
num = 10
print(f"Binary representation of {num} is {int_to_binary(num)}")

invalid_num = "abc"
print(f"Binary representation of {invalid_num} is {int_to_binary(invalid_num)}")
