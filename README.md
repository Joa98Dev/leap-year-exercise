# The Leap Year Exercise 🎆
This is a common programming exercise in which we have to make a small program that tell us if a year is leap or not.

This exercise challenge our logicaL skills and make us to "translate" that logical problem into coding.

## How does it works? 🥸
A leap year is a year that has an extra day in it, so unlike a normal year that has 365 days, a leap year has 366 days.

To calculate which year is or not a leap one, we have to follow these parameters:
* The year must be at the same time divisible between **4** and **400**.
* If the year is divisible between **4** but it isn't between **100** then it is a leap year.
* Also if the year is divisible between **100** and **400** then it's a leap year.

## But how can we "translate" that logic into coding ⌨️
First we have to analyze the problem, if you pay attention we need to check continually if the year is leap (true) or not (false).

Yep! as you already figure it out, we have to use the famous ***Conditionals***.

But first we have to make the function that will store the conditionals.

> *For this example I will use Python, but remember the logic are the same in all programming languages, it will only differs int the syntax*

~~~
    def leap_year(year):
~~~
* In python ***def*** is the special word that we use to declare a function
* Then we add a name to our function, in these case I name it as ***leap_year***
* But what is that inside the parenthesis? Well, all function must have parameters. Yes even if between the parenthesis is an emtpy space, that means that will have a void parameter.
* In our case we create a parameter called ***year*** *(We can give it any name that we want)*.

Ok, we already created our fucntion, so then we will create inside it the conditionals.

~~~
    def leap_year(year):
        if year % 4 == 0 and year % 400 == 0:
            return f'{year} is a leap year'
~~~
So, what did we just do? 🥸
We declare a condition that will check if the ***year*** is a number that when we divide it between 4 or between 400 its residue must be 0 (That means that is divisible).

Also we add that if the condition is true, then returned as the year + the message "is a leap year"

To make it simple we will use the formatted string, that allow us to include it inside it variables, expressions and results of function calls.

Ok we already did the first part! 

Do you remember the parameters to know if a year is leap?

* The year must be at the same time divisible between **4** and **400**.
* If the year is divisible between **4** but it isn't between **100** then it is a leap year.
* Also if the year is divisible between **100** and **400** then it's a leap year.

So, now we just have to repeat the first conditional logic and adapt each condition depending of the parameter that must do:

~~~
def leap_year(year):

    if year % 4 == 0 and year % 400 == 0:
        return f'{year} is a leap year'
    
    elif year % 4 == 0 and year % 100 != 0:
        return f'{year} is a leap year'
    
    elif year % 100 == 0 and year % 400 == 0:
        return f'{year} is a leap year'
~~~

After the first `if`, we just add `elif`.

`elif` is a diminutive of the words `else` and `if` and is the Python equivalent of other porgramming languages that use literally `else if`.

So, when we add a year the program will check if the number meets the requiremnts that we add to the conditionals.

But...
What would happen if the year added doesn't meet any of the requirements above? 😯
