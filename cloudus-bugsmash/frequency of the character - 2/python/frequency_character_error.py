def character_frequency(text, char):
 
    text = text.lower()
    char = char.lower()

   
    return text.count(char)


text = input("Enter a string: ")
if not text:
    print("The input string is empty.")
    exit()

char = input("Enter the character to find its frequency: ")
if len(char) != 1:
    print("Please enter exactly one character.")
    exit()


freq = character_frequency(text, char)


print(f"The frequency of '{char}' in the string is: {freq}")
