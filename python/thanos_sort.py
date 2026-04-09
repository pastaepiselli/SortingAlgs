# lo so che rimuove elementi da una lista mentre la si cicla e un problema
# ma tanto ogni volta che calcolo r si richiama len(l) quindi r e sempre in range corretto

import random
def isSorted(l: list[int]) -> bool:
    for i in range(len(l) - 1):
        if l[i] > l[i + 1]:
            return False
    return True

def thanosSort(l: list[int]) -> list[int]:
    while(not isSorted(l)):
        half: int = int (len(l) / 2)
        for i in range(half):
            r = random.randint(0, len(l) - 1)
            del l[r]
    return l

if __name__ == "__main__":
    l: list[int] = [2, 1, 3, 4, 5]
    print(thanosSort(l))


