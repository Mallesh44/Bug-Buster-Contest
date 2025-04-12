matrix = [
    [1, 2, 3],
    [4, 5]  
]


transpose = []
for i in range(len(matrix)):
    row = []
    for j in range(len(matrix[0])):
        row.append(matrix[j][i])  
    transpose.append(row)


print("Transpose of the matrix:")
for row in transpose:
    print(row)  
