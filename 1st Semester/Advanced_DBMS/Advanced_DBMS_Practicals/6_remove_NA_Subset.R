
install.packages("Hmisc")
library(Hmisc)

a<-c(2,3,NA,4,7,6)
a
mean(a[!is.na(a)]) 
#22/5 = 4.4

mean(a)
median(a)
sd(a)


is.na()
!is.na()
a[!is.na(a)] #give only number
a[is.na(a)] #only 1 na

mean(a[is.na(a)]) #NA
median(a[!is.na(a)])
sd(a[!is.na(a)])

b<-c(4,5,NA,3,9)
b
#replace NA (missing data)
#impute= is process of replacing missing with sabsitute value for NA 
b<-impute(a,mean) 
b
data<-data.frame(marks1=c(NA,28,NA,51,70),marks2=c(45,87,NA,55,90))
data

datag<-impute(data$marks1,mean)
datag

datae<-impute(data$marks1,300)
datae
#NA replace with 300

sum(is.na(data))
#sum of NA

colSums(is.na(data))
##sum of NA column wise

install.packages("visdat")
library(visdat)
vis_miss(data)

#removing missing data
data<-na.omit(data)
data

#creating subsate from dataframe
data1<-data.frame(c1=c(1,3,5,7),c2=c(2,4,6,8),c3=c(11,13,19,23))
data1
d1<-subset(data1,select = c3)                  
d1
d2<-subset(data1,select = c(c2,c3))                  
d2
#make 2 col then put in vector

#creating subset using logical AND OR
data2<-data.frame(ID=c(1,2,NA,NA,3,4,5),Name=c("rohit","devank",NA,NA,"yash","ankit","raj"),Age=c(22,25,NA,NA,36,19,20))
data2

d3<-subset(data2,subset = ID<5 & Age>32)
d3
d4<-subset(data2,subset = ID<3 || Age<25)
d4

d5<-subset(data2,subset = !is.na(Age))
d5
