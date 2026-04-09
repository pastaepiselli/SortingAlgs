# erald sort
def selection_sort1(arr: list[int]) -> list[int]:
    min = 100 
    for i in range(len(arr) - 1):
        indice = arr[i]
        # indice del numero minimo
        for j in range (len(arr)):
            if arr[j] < min:
                min = arr[j]
          #      if arr[0] == min:
                    
        arr[i + 1] = min
        indice = arr[i + 1]
    return arr



# mia versione 
def selection_sort(arr: list[int]) -> list[int]:
    for i in range(len(arr)):
        # indice del numero minimo
        min = i 
        for j in range (i ,len(arr)):
            if arr[j] < arr[min]:
                min = j 
        if i != min:
            arr[i], arr[min] = arr[min], arr[i]
    return arr
            
if __name__ == "__main__":
    l: list[int] = [5, 3, 4, 6, 1, 2]
    print(selection_sort(l))
