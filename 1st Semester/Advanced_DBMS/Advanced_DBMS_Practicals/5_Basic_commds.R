# basic Commands in R
setwd("A:/Rohit 044 Practicals/Advance DBMS/prtical_6_R_Program")
getwd()

list.files("A:/Rohit 044 Practicals/Advance DBMS/prtical_6_R_Program")
objects()

help(iris)
help.search("i")

install.packages("XLConnect") 
install.packages("readxl") 
install.packages("writexl") 

installed.packages() 

library(XLConnect) 
library(readxl) 
library(writexl) 


a<-10
a
b<-20
c<-a+b
c
34+56
8*3
sqrt(2)
log(3)
exp(6)
factorial(5)
i<-34
class(i)
w<-"hi Rohit"
class(w)
z<-T
class(z)
y<-F
typeof(y)
w<-3+2i
typeof(w)
is.complex(w)
#List in R

#list index number start from 1
lst<-list("Rohit","Devank","yash")
lst
lst[1]
lst[2]<-"neha"
lst
length(lst)
append(lst,"vishwas")
append(lst,"Ram",after=3)

#create a list of fruit and append after 4th element
fruit<-list("apple","orange","banana","kiwi")
fruit
append(fruit,"mosambi",after = 3)

lst[2:4]
for(x in lst){print(x)}

#combine
lst2<-c(lst,fruit)
lst2

#Dataframe

studid<-c(1,2,3,4)
studname<-c("rohit","yash","devank","Ram")
dataf<-data.frame(studid,studname)
dataf
dataf$studid
dataf$studname
nrow(dataf)
ncol(dataf)
names(dataf)
names(dataf)[1]
names(dataf)[2]

#change first column
names(dataf)[1]<-"sid"
names(dataf)[1]

#change second column
names(dataf)[2]<-"sname"
names(dataf)[2]

#add one row in dataframe

dataf<-rbind(dataf,c(5,"neha"))
dataf

dataf<-cbind(dataf,marks=c(99,85,81,95,75))
dataf

#matrices = need no.of rows and col
matx<-matrix(c(10,20,30,40,50,60),nrow = 2,ncol = 3)
matx
matx2<-matrix(c(1,2,3,4,5,6),nrow =2,ncol =3)
matx2
matx3<-matrix(c(11,22,33,44,55,66,77,88,99),nrow = 3,ncol = 3)
matx3

matx+matx2
matx-matx2
matx*matx2
matx/matx2

m1<-matrix(c("rohit","yash","devank","shubham"),nrow = 2,ncol = 2)
m1
m2<-matrix(c("jan","feb","jun","sep"),nrow = 2,ncol = 2)
m2
matrixr<-rbind(m1,m2)
matrixr

matrixc<-cbind(m1,m2)
matrixco

#array
arr<-c(1:10)
arr

#c(row,col,matrix)
multi_arr<-array(arr,dim =c(3,2,2))
multi_arr

#take number from start when it's finish
multi_arr2<-array(arr,dim =c(3,2,3))
multi_arr2

#excess element
#multi_arr[row,col,matrix]
multi_arr[3,2,2]
multi_arr2[3,2,3]

#-------------

data=matrix(c(1:16),nrow=4,ncol=4)
data
empid<-c(111,112,113,114)
empname<-c("AA","BB","CC","DD")
data<-data.frame(empid,empname)
library(writexl)
install.packages("xls")
library(writexl)
filewr<-write_xlsx(dataf,"first.xls")
plot(2:8)
