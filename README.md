# Heap-Sort
Implement a heap sort algorithm.
a. Write the pseudo-code for your implementation
b. Analyze the worst-case and the average-case scenario of your implementation
c. What is the complexity of your implementation? Write the recurrence of your implementation.
d. Demonstrate the loop invariants are true.

a.
swap(arr,maximum,i)
temp= arr[i]
arr[i]=arr[maximum]
arr[maximum]=temp
max_heapify(arr,size,temp)
maximum=temp
left= 2*temp
right=2*temp+1
if left<= size and arr[left] > arr[maximum]
maximum=left
else
maximum=temp
if right<= size and arr[right] > arr[maximum]
maximum=right
if maximum ≠ temp
swap arr[i] with arr[maximum]
max_heapify(arr,size,maximum)
build_maxheap(arr,size)
for i= size/2 downto 1
max_heapify(arr,size-1,i)
heap_sort(arr,size)
size=arr.length-1
build_maxheap(arr,size)
for i= size downto 2
swap arr[0] with arr[i]
size = size-1
max_heapify(arr,size,0);

b. Count of nodes if height of tree is n is 2n. And if count of nodes of full binary tree is N,
then height of tree n is proportional to n = C(log(N)). The max_heapify function is called
recursively n times. So, the worst case time complexity is O(logn).
In build_maxheap function at most n-1 calls to max_heapify. Max_heapify has a worst-case
running time of O(log n). So, the worst-case time complexity is O(nlogn).

c. Swap function takes time O(1).
The largest possible subtree is 2/3 the size of n so the recursive call will take T(2n/3) time
so the recurrence is T(n) <= T(2n/3) + O(1) → (O(1) The running time of the algorithm
without the recursive call is constant)
According to master theorem case to → If f(n) O(nlogba), then T(n) = O(nlogbalogn)
f(n) = 1= nlog2/31= n0=1
T(n) = O(nlog2/31logn) = O(logn) So max_heapify is O(logn).
In build_maxheap function for loop is run n/2 times (n is size of array).
And max_heapify has O(logn) So the running time is O(nlogn)
In heap_sort function calling the max_heapify function n-1 times.
Max_heapify has O(logn) so the running time is O(nlogn)
T(n) = T(n-1) + O(logn)

d.
Initialization Initially, i = n. arr[1….n] is a max-heap containing the n
smallest elements of arr, and the subarray arr[n + 1…n] is empty.
Maintenance arr[1….i] is a max-heap containing the i smallest elements of arr, and the
subarray arr[i +1…n] contains the n-i largest elements of arr sorted, by the loop invariant.
Swapping arr[1] and arr[i] preserves the order of elements arr[i…n], and the elements
arr[1…i - 1] are all smaller than arr[i….n]. After decrementing heapsize, the call to max-
heapify(arr,size, 1) makes arr[1….i-1] a max-heap, restoring the loop invariant before next
iteration.
Termination When i = 1, arr[1…1] is a max-heap containing the least element of arr,
and the subarray arr[2…n] contains the n-1 largest elements of arr ,in other
words, arr is sorted.
