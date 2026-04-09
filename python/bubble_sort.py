"""
algoritmo di sorting che controlla gli elementi adiacenti, se il precedente e maggiore 
viene swappato, l'elemento maggiore sale a destra come una bolla. 

notazione O(n^2) ce una versione piu ottimizzata che evita di ciclare per lo swap 
"""
def bubble_sort(arr: list[int]):
    for i in range(len(arr)):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                # swap 
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

"""
versione ottimizzata perche se non avviene lo uno swap esce subito dal ciclo
esempio la lista viene sortata dopo uno swap o e gia sortata evita di ciclare costantemente
"""
def optimize_bubblesort(arr: list[int]):
    for i in range(len(arr)):
        swap: bool  = False
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swap = True
        if not swap:
            break

if __name__ == "__main__":
    l: list[int] = [3, 6, 9, 5, 2, 12, 7]
    optimize_bubblesort(l)
    print(l)

