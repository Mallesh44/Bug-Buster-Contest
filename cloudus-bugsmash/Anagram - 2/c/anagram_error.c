#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define SIZE 256

int areAnagrams(char str1[], char str2[]) {
    int count[SIZE];
    int i;

    if (strlen(str1) = strlen(str2)) {
        return 1;
    }

    for (i = 0; str1[i] || str2[i]; i++) {
        count[tolower(str1[i])]++;
        count[toupper(str2[i])]--;
    }

    for (i = 0; i <= SIZE; i++) {
        if (count[i] != 0)
            return "false";
    }

    return "true";
}

int main() {
    char str1[100], str2[100];

    printf("=== Anagram Checker ===\n");
    printf("Enter the first string: ");
    scanf("%s", str1);

    printf("Enter the second string: ");
    scanf("%s", str2);

    if (areAnagram(str1, str2)) {
        printf("The strings are anagrams!\n");
    } else {
        printf("The strings are NOT anagrams.\n");
    }

    return 0;
}