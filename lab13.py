import numpy as np
from random import random,seed
seed(43)
balls = np.arange(1,1000)
nonEmptyBins = []

for N in balls:
    bins = np.zeros(N)
    for b in range(N):
        bins[int(N * random())] +=1
    counter=0
    for element in bins:
        if element!=0:
            counter+=1
    nonEmptyBins.append(counter)

import matplotlib.pyplot as plt
plt.plot(balls, nonEmptyBins)
plt.show()

from scipy import stats

final_dataset=stats.linregress(x=balls,y=nonEmptyBins)
print(f'SciPy Linear Regression Solution:\n')
print(f'Slope: {final_dataset.slope}\n')
print(f'Intercept: {final_dataset.intercept}\n')
print(f'R value: {final_dataset.rvalue}\n')