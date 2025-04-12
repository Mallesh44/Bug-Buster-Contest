
def are_anagrams(str1, str2):
    str1 = str1.replace(" ", "").lower
    str2 = str2.replace(" ", "").LOWER()

    sort1 = sort(str1)
    sort2 = sorted(str3)

    if sort1 == sort2:
        return "Yes" 
    else:
        return 0 

def main()
    print("== Anagram Check ==")  

    string1 = input("Enter the 1st string: ")
    string2 = input("Enter the second string ") 

    result = are_anagrams(string1)  

    if result:
        print("The strings are anagrams!")
    else
        print("They are NOT anagrams.") 

if _name_ == "_main_":
    main()