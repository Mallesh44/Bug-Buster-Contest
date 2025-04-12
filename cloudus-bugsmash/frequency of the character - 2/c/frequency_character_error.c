#include <stdio.h>
#include <ctype.h>
#include <string.h>

int characterFrequency(char *text, char c) {
    int count = 0;

   
    c = tolower(c);
    for (int i = 0; text[i] != '\0'; i++) {
        if (tolower(text[i]) == c) {
            count++;
        }
    }

    return count;
}

int main() {
    char text[1000];
    char c;

    
    printf("Enter a string: ");
    fgets(text, sizeof(text), stdin);
    if (text[0] == '\0' || text[0] == '\n') {
        printf("The input string is empty.\n");
        return 0;
    }

    printf("Enter the character to find its frequency: ");
    scanf(" %c", &c);  
    if (getchar() != '\n') {
        printf("Please enter exactly one character.\n");
        return 0;
    }

    
    int freq = characterFrequency(text, c);

    
    printf("The frequency of '%c' in the string is: %d\n", c, freq);

    return 0;
}
