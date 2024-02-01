# To speed up the process of the solution,
# i added line number 31(words.remove(element)). This line basically
# removes the word from the original list after 
# it has been found so that in the next iteration 
# it does not get encountered again and waste time
# handling it.

def allsteps(word):
    '''
    >>> allsteps("APPLE")
    ['ALEPPO', 'APPEAL', 'CAPPLE', 'DAPPLE', 'LAPPED', 'LAPPER', 'LAPPET', 'PALPED', 'PAPULE', 'RAPPEL', 'UPLEAP']
    >>> allsteps("UC")
    ['CUB', 'CUD', 'CUE', 'CUM', 'CUP', 'CUR', 'CUT', 'LUC', 'UCA']
    >>> allsteps("BEARCAT")
    ['ACERBATE', 'BACTERIA', 'BRACCATE', 'BRACTEAL', 'CARTABLE', 'SCABRATE']
    '''
    url = "http://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt"
    import os
    from urllib.request import urlopen
    wordfile = urlopen(url)
    words = wordfile.read().decode('utf-8').upper().split()

    outputList=[]
    alphabets=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    tempWord=word
    for char in alphabets:
        tempWord+=char
        for element in words:
            if sorted(tempWord)==sorted(element):
                outputList.append(element)
                words.remove(element)
        tempWord=word
        
    return sorted(outputList)


import doctest
if __name__ == "__main__":
  doctest.testmod(verbose=True)