A=[]
for v in range(6):      #limit - 6 numbers
    A.append(int(input('Enter number :')))
    print(A)

def selectionSort(A):
    n =len(A)
    for j in range (0,n-1):
        smallest = j
        for i in range(j+1,len(A)):
            if A[i] < A[smallest]:
                smallest=i

        A[j],A[smallest]=A[smallest],A[j]

selectionSort(A)
print('Sorted Array :')
print(A)
