def quicksort(liste):
if len(liste) <= 1:
    return liste
pivotelement = liste.pop()
links = [element for element in liste if element < pivotelement]
rechts = [element for element in liste if element >= pivotelement]
return quicksort(links) + [pivotelement] + quicksort(rechts)
# Quelle: http://de.wikipedia.org/wiki/Python_(Programmiersprache)