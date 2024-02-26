#10th Practical , K-means clustering
my_data <- read.csv(file = 'A:/Iris2.csv')
print(my_data)
head(my_data)

model<-kmeans(my_data,3)
model

install.packages("dplyr")
library(dplyr)

mydata<-select(iris,c(1,2,3,4))
model<-kmeans(mydata,3)
model

model$size 
table(model$cluster,iris$Species)

model$cluster<-as.factor(model$cluster) 
install.packages("tidyverse")
install.packages("ggplot2")
library(ggplot2)
library(tidyverse) 
ggplot(iris,aes(Petal.Length,Petal.Width,color=model$cluster))+geom_point() 


#agglomerative
df<-USArrests
view(df)

#preprocessing (Remove NA Values.)
df<-na.omit(df)
df

#normalizing or Standadizing
d<-scale(df)
head(d)

d<-dist(d,method = "euclidean") 
hc<-hclust(d,method = "complete") 
plot(hc) 

plot(hc,cex=0.1,hang=-1)

hc<-hclust(dist(d)) 
plot(hc) 

hcd=as.dendrogram(hc)
plot(hcd,type="triangle")

plot(cut(hcd,h=75)$upper)
plot(cut(hcd,h=75)$lower[[2]]) 

