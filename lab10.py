import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
from pandas import DataFrame, Series
sh_raw = pd.read_csv('/Users/samee/OneDrive/Desktop/Imam/bhaiya desktop/Python-CS2023/movies.csv',
   header = None, 
   names = ['Year','Title','Comic','IMDB','RT','','OpeningWeekendBoxOffice','AvgTicketPriceThatYear','EstdOpeningAttendance','USPopThatYear'])

sh = sh_raw[np.isfinite(
          sh_raw.OpeningWeekendBoxOffice)]
print(sh.head(5))

 
# Normalize and scatterplot the scores
imdb_normalized = sh.IMDB / 10         
sh.insert(10,'IMDBNormalized',imdb_normalized)
rt_normalized = sh.RT/100        
sh.insert(11, 'RTNormalized', rt_normalized)
sh.plot.scatter(x ='RTNormalized', y ='IMDBNormalized')
plt.show()

print(sh[['RTNormalized','IMDBNormalized']].corr())
print(sh[['RTNormalized','IMDBNormalized']].describe())

#Required Questions

#1
print(sh[sh['Comic']=='DC'])
#2
two_columns_dc_movies = sh[sh['Comic'] == 'DC']
print(two_columns_dc_movies[['Year', 'Title']])
#3
print(sh[sh['Comic']=='Marvel'][['Year','Title']])
#4
sh.plot.scatter(x='Year', y='AvgTicketPriceThatYear')
plt.xlabel('Year')
plt.ylabel('Average Ticket Price That Year')
plt.show()
#5
print(sh[['Year','AvgTicketPriceThatYear']].corr())
#6
statistics_for_opening_weekend = sh['OpeningWeekendBoxOffice'].describe()
print(statistics_for_opening_weekend)