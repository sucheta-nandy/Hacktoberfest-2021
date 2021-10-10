A=[]
for v in range(6):
    A.append(input('Enter the number'))
    print(A)

def bubbleSort(A):
    n = len(A)
    for i in range(0,n):
        for j in range(n-1,i,-1):
            if A[j] < A[j-1]:
                A[j],A[j-1]=A[j-1],A[j]


bubbleSort(A)
print('Sorted Array :')
print(A)
