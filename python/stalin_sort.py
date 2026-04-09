"""
lo stalinsort controlla scorrendo ogni elemento della lista se non e in ordine l'elemento viene eliminato

notazione O(n), i tutti i casi possibili 
"""
def stalin_sort(l: list[int]) -> list[int]:
    lastKept = l[0]
    i = 1 
    while i < len(l):
        if l[i] >= lastKept:
            lastKept = l[i]
            i += 1 
        else: 
            l.pop(i)
    return l

if __name__ == "__main__":
    l: list[int] = [5, 3, 6, 1, 6, 3, 8, 31, 3]
    print(stalin_sort(l))
