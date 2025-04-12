def gcd(a, b):
    while a:  
        b, a = a, b % a  
    return b  


def lcm(a, b):
    return abs(a * b) / gcd(a, b)  


num1 = input("Enter the first number: ")  
num2 = input("Enter the second number: ")


gcd_result = gcd(num1, num2)
lcm_result = lcm(num1, num2)


print("The GCD of " + num1 + " and " + num2 + " is " + str(gcd_result))  
print("The LCM of " + num1 + " and " + num2 + " is " + str(lcm_result))
