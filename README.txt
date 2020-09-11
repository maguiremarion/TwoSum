Lab 2 - README.txt

Group Members:
Maguire Marion

Notes:

This implementation works by taking in an array from the user and then sorting it using selection sort. The program also takes in a target value.

It then uses pointers from the left and right to scan through the array to find two integers which add up to the target value. If these values do exist, it returns their index in the sorted array. If they don't it returns -1.


Since the array is already created (in hindsight I should've made it's length based on how many inputs the user gives), I then check how many items in the array are '0' in order to properly calculate where the indices are and then print them.