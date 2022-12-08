# harshafiles
 
and the number itself is called a prime number. 2, 3, 5, 7 etc. are prime numbers as they do not have any other factors. But 6 is not prime (it is composite). 
Task : 
To find prime and composite numbers between two inputs. 
Approach : 
 
•	We add two inputs in the python code. 
•	Check if num is greater than 1. 
•	If the number entered is either 0 or 1, we say that the number is neither prime nor composite number. 
•	Print the result. 
•	As two numbers will be entered in the input,the numbers between two inputs will be shown along with whether they are prime or composite. 
                  
 	 
Now let’s see how to write a program to find prime and composite numbers between two inputs with Python: 
 
Source Code: 
 
 
 
 
x=int(input("Enter starting number: ")) y=int(input("Enter end number: ")) if x>0 and y>0:     print()     a=0     b=0     if x==1:         print("1 is nor prime nor composite number")         x=x+1 
for i in range(x,y+1):         for j in range(2,i):             if i%j==0:                 a=a+1 
                print(i,"is composite")                 break         else:             b=b+1 
            print(i,"is Prime")     print() 
    print(f"There are {a} composite numbers and {b} prime numbers in given range.") else: 
    print("Enter only positive integers")  
 
 
Output: 
 
  
 	 
 
 
 
 
 
 
 
 
. 
  
