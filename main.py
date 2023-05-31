
'''print(2+3)
print(9-8)
print(4*6)
print(8/4)
print(5/2)
print(5//2)
print(8+9-10)
print(8+2*3)
print((8+2)*3)
print(2**3)
print(10//3)
print(10%3)
print('navib')
print("'navin'")
print("navin's laptop")
print('navin "laptop"')
x=2
print(x+3)
print(x)
name='youtube'
names='YOUTUBE'
print(name+'rocks')
print(name+' rocks')
print(name[3])
print(name[-1])
print(names[3])
print(name[0:2])
print(names[0:2])
print(name[1:4])
print(name[1:])
print(name[:])
print(name[:9])
print(name[3:10])
print('my '+name[:])
print('my '+name[1:])
nums=[25,12,36,95,14]
print(nums)
print(nums[2])
print(nums[2:])
print(nums[-1])
names=['navin','kiran','john']
print(names)
values=[9.5,'Navin',25]
print(values)
mil=[nums,names]
print(mil)
print(nums)
nums.append(45)
print(nums)
nums.insert(2,77)
print(nums)
nums.remove(14)
print(nums)
nums.pop()
print(nums)
nums.extend([29,12,14,36])
print(nums)
print(min(nums))
print(max(nums))
print(sum(nums))
nums.sort()
print(nums)
tup=(21,36,14,25)
print(tup)
print(tup[1])
s={22,25,14,21,5}
print(s)
s={25,14,98,63,75,98}
print(s)
data={1:'Navin',2:'Kiran',4:'Harsh',3:'Shubh'}
print(data)
print(data[4])
print(data.get(2))
keys=['Navin','Kiran','Harsh']
values=['Python','Java','JS']
data=dict(zip(keys,values))
print(data)
data['Monika']='CS'
print(data)
prog={'JS':'Atom','CS':'VS','Python':['Pycharm','Sublime'],'Java':{'JSE':'Netbeans','JEE':'Eclipse'}}
print(prog['JS'])

num=5
print(id(num))
name='navin'
print(id(name))
a=10
b=a
print(id(a))
print(id(b))
print(id(10))
k=10
print(id(k))
a=9
print(id(a))
print(id(k))
num=2.5
print(type(num))
num=5
print(type(num))
num=5+6j
print(type(num))
a=5.6
b=int(a)
print(b)
print(float(b))
c=complex(a,float(b))
print(c)
print(b>a)
print(a>b)
k=a>b
print(type(k))
print(int(True))
print(int(False))
L=[25,36,45,12]
print(type(L))
T=(25,36,4,57,12)
print(type(T))
S='Navin'
print(type(S))
D={1:'Ke',2:'Pe',3:"Le"}
print(type(D))
E={'A':'Ke','B':'Le','C':'Me','D':'Ne'}
print(type(E))
print(D)
print(E)
print(D.keys())
print(D.values())
print(E.keys())
print(E.values())
x=4
x=x+2
print(x)
x=x-2
print(x)
x=x*2
print(x)
x=x/2
print(x)
a=5
b=4
print(a<8 and b<5)
print(a<8 and b<2)
print(a<8 or b<2)
x=True
print("hi")
print(not x)'''


'''
a=5
b=6
print("Value of a is ",a)
print("Value of b is ",b)
temp=a
a=b
b=temp
print("Swap Value of a is",a)
print("Swap Value of b is ",b)
'''

'''
a=5
b=6
a=a+b #11
b=a-b #5
a=a-b #6
print(a)
print(b)
 '''

'''import math
c=pow(3,2)
x=math.pow(3,2)
y=math.pow(5,2)
print(c)
print(x)
print(y)
print(math.pi)
print(math.e)
print(math.sqrt(25))
print(math.factorial(5))
'''
'''import math
print(math.sqrt(25))
print(math.pow(3,2))
print(math.factorial(5))
'''

'''
import math
x=math.sqrt(25)
print("The sqrt of x is",x)
y=math.sqrt(15)
print("The sqrt of y is",y)

print("Floor",(math.floor(2.9)))
print("Ceil",(math.ceil(2.3)))
'''

'''
x=int(input("Enter 1st number:"))
y=int(input("Enter 2nd number:"))
z=x+y
print(z)
'''

'''
x=input("Enter First Name:")
y=input("Enter Last Name:")
z=x+y
print(z)
'''

'''
x=7
if x>6:
   print("x is Greater than 5")
print("Executed")
'''
'''
x=6
if x%2==0:
    print("Even")
'''
'''
x=4
if x%2==0:
    print("Even")

else :
    print("Odd")
print("Done") 
'''

'''
x=6

if x==1:
    print("One")
elif x==2:
    print("Two")
elif x==3:
    print("Three")
else:
    print("Not in Range")
'''

'''i=1
while i<5:
    print("Hello")
    i=i+1

i=1
while i<5:
    print("Hello",i)
    i=i+1

i=1
while i<5:
    print(i)
    i=i+1 
'''
'''
x=['navin','65.2',5]
for i in x:
    print(i)

for i in range(10):
    print(i)

for i  in range(0,10,2):
    print("Even",i)

for i  in range(1,10,2):
    print("odd",i)

for i in range(10,1,-1):
    print("Negative", i)
 '''
'''
print("#")
print("#")
print("#")
print("#")

print("#",end="")
print("#",end="")
print("#",end="")
print("#",end="")
'''

'''
for j in range(0,4):
    print("#", end="")
for j in range(0,4):
    print("#", end="")
for j in range(0,4):
    print("#", end="")
for j in range(0,4):
    print("#", end="")
'''

'''
for j in range(0,4):
    print("#", end="")
print()
for j in range(0,4):
    print("#", end="")
print()
for j in range(0,4):
    print("#", end="")
print()
for j in range(0,4):
    print("#", end="")
'''
'''
for i in range(4):
   for j in range(0,4):
       print("#",end="")
'''

'''
for i in range(4):
   for j in range(0,4):
       print("#",end="")
   print()
'''
'''
for i in range(4):
   for j in range(i+1):
       print("#",end="")
   print()
'''
'''
for i in range(4):
   for j in range(4-i):
       print("#",end="")
   print()
'''
'''
for i in range(4):
    for j in range(i):
        print("#",end="")
    print()
'''
'''nums=[12,16,15,18,21,25]
for num in nums:
    if num%5==0:
        print(num)
    else:
        print("Not Found")
'''
'''
nums=[12,16,15,18,21,26]
for num in nums:
    if num%5==0:
        print(num)
else:
    print("Not Found")
'''
'''
nums=[12,16,15,18,21,26]
for num in nums:
    if num%5==0:
        print(num)
        break
else:
    print("Not Found")
'''
'''num=6
for i in range(2,num):
    if num%i==0:
        print("Non Prime")

else:
    print("Prime")
   '''
'''
num=6
for i in range(2,num):
    if num%i==0:
        print("Non Prime")
        break
else:
    print("Prime")
'''
from array import *
'''k=array('i',[5,9,8,4,2])
print(k)
print(k.buffer_info())
print(k.typecode)
print(k[3])
for i in k:
    print(i)
'''
'''k=array('u',['a','e','i'])
print(k)
for i in k:
    print(i)
'''
'''
k=array('i',[])
n=int(input("Enter the Size of Array"))
for i in range(n):
    x=int(input("Enter The Value"))
    k.append(x)
print(k)
'''
from numpy import *

'''k=array([1,2,3,4,5])
print(k)
print(k.dtype)
k1=array([1,2,3,4,5,6.0])
print(k1)
print(k1.dtype)
'''

'''
k=array([5,4,3,2,1])
print(k)
print(min(k))
print(max(k))
print(sort(k))
print(sqrt(k))
print(log(k))
k=k+5
print(k)
print(log(k))
'''

'''
arr1=array([1,2,3,4,5])
arr2=array([6,1,9,3,2])
print(arr1+arr2)
print(concatenate([arr1,arr2]))
print(sort(concatenate([arr1,arr2])))
print(log(sort(concatenate([arr1,arr2]))))
'''
'''
k=array([[1,2,3],
        [4,5,6]])
print(k)
print(k.dtype)
print(k.ndim)
print(k.size)
k1=k.flatten()
print(k1)
k2=k1.reshape()
print(k2) 
'''
''' 
m=matrix('1 2 3;6 4 5;1 6 7')
print(m)

m1=matrix('1 2 3;6 4 5;1 6 7')
m2=matrix('1 2 3;6 8 5;2 6 7')
print(m1*m2)
'''

'''
def greet():
    print("Hello")
    print("Good Morning")

greet()

def sum(num1,num2):
    sum=num1+num2
    print(sum)
sum(6,4)

result=sum(8,9)
print(result)

def add(num1,num2):
    add=num1+num2
    return add

result1=add(9,10)
print(result1) 
'''

'''
def add_sub(x,y):
    add=x+y
    sub=x-y
    print(add)
    print(sub)
add_sub(7,5)
'''
'''
def add_sub(x,y):
    add=x+y
    sub=x-y
    return add,sub
a,b=add_sub(5,4)
print(a)
print(b)
print(a,b)
'''
'''
a=10
def something():
    a=15
    print('inner a',a)
print('outer a',a)

something()
'''

'''
a=10
def something():
    global a
    a=15
    print('inner a',a)
something()
print('outer a',a)
'''

'''
def fib(n):
    a=0
    b=1
    print(a)
    print(b)

    for i in range(2,n):
        c=a+b
        a=b
        b=c
        print(c)
fib(5)        
'''

# class Computer:
#
#     def k(self):
#         print("i5,16gb,1TB")
# comp1=Computer()
# comp2=Computer()
#
#
# Computer.k(comp1)
# Computer.k(comp2)
#
# comp1.k()
# comp2.k()

# f=open('MyData','r')
# print(f.readline())
# print(f.read())
# f1=open('abc','w')
# f1.write("Something")
# print(f1)

