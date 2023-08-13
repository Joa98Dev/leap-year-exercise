#Create an input file that only allows int data
enter_year = int(input())

#Function that checks if the variable year store a leap year or not
def leap_year(year):

    #Checks if the year is divisible between 4 and 400
    if year % 4 == 0 and year % 400 == 0:
        return f'{year} is a leap year'
    
    #Checks if the year is divisible between 4, but not divisible between 100
    elif year % 4 == 0 and year % 100 != 0:
        return f'{year} is a leap year'
    
    #Checks if the year is divisible between 100 and 400
    elif year % 100 == 0 and year % 400 == 0:
        return f'{year} is a leap year'
    
    #If the year does not meet the above requirements it's not a leap year
    else:
        return f'{year} is not a leap year'

#Prints the result
print(leap_year(enter_year))