import pandas as pd
from sklearn.datasets import fetch_california_housing
cali = fetch_california_housing()
cali_df = pd.DataFrame(cali.data, columns=cali.feature_names)
cali_df['MedHouseValue'] =pd.Series(cali.target)

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test =train_test_split( cali.data, cali.target,random_state=11)

from sklearn.linear_model import LinearRegression
mu_regress = LinearRegression()
mu_regress.fit(X=X_train, y=y_train)
predicted = mu_regress.predict(X_test)
expected = y_test
z = zip(predicted[::1000], expected[::1000])

from sklearn import metrics
R2_score=metrics.r2_score(expected, predicted)
MSE=metrics.mean_squared_error(expected, predicted)

print(f'R2 score: {R2_score}')
print(f'MSE score: {MSE}\n')
# The above statements show the multiple regression for all features combined

# The following code block shows the linear regression for each feature
# in the california dataset. 
cali_df['target']=cali.target
y = cali_df['target']
for num, feature_in_data in enumerate(cali.feature_names):
    X_single = cali_df[feature_in_data].values.reshape(-1, 1)
    X_train, X_test, y_train, y_test = train_test_split(X_single, y, test_size=0.2, random_state=42)
    
    individual = LinearRegression()
    individual.fit(X_train, y_train)
    
    y_pred = individual.predict(X_test)
    
    print(f'Metrics about Feature {num}')
    print(f"R2 score: {metrics.r2_score(y_test, y_pred)}")
    print(f"MSE score: {metrics.mean_squared_error(y_test, y_pred)}\n")


