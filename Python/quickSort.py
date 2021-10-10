A=[]
for a in range(8):
    A.append(int(input('enter number: ')))
print(A)


n = len(A)

p = 0

r = n - 1

def partition(A,p,r):
    x = A[r]
    i = p -1
    
    for j in range (p,r):
        if (A[j]<= x):
            i = i + 1
            temp1 = A[i]
            A[i] = A[j]
            A[j] = temp1

    temp2 = A[i+1]
    A[i+1] = A[r]
    A[r] = temp2
    return i+1

def quickSort(A,p,r):
    if(p<r):
        q = partition(A,p,r)
        quickSort(A,p,q-1)
        quickSort(A,q+1,r)


quickSort(A,p,r)
print('sorted array: ')
print(A)
