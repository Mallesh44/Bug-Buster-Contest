def bubble_sort(arr):
n = len(arr)
for i in range(n):
swapped = False
for j in range(0, n-i-1):
if arr[j] > arr[j+1]:
arr[j], arr[j+1] = arr[j+1], arr[j]
swapped = True
if not swapped:
break
return arr

# Example usage
unsorted_list = [39, 12, 18, 85, 72, 10, 2, 18]
print("Unsorted list is:", unsorted_list)
sorted_list = bubble_sort(unsorted_list)
print("Sorted list is:", sorted_list)
