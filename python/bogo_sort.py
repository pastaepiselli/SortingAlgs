"""
bogosort o stupid sort!!!
se arr non e sorted shuffla completamente 

notazione media O(n ^ 2 * !n)
"""
import random 
def isSorted(arr: list[int]) -> bool:
    for i in range(1, len(arr)):
        if arr[i] < arr[i - 1]:
            return False
    return True

def bogo_sort(arr: list[int]) -> None:
    while not isSorted(arr):
        random.shuffle(arr)
if __name__ == "__main__":
    l: list[int] = [1, 4, 3, 5, 2, 5, 7, 1]
    bogo_sort(l)
    print(l)
