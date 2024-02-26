ir <- read.csv(file = 'A:/Iris2.csv')
print(ir)
head(ir)

train=ir[1:100,]
train

test=ir[101:150,]
test

install.packages("naivebayes")
install.packages("e1071")

library(naivebayes)
library(e1071)


model=naiveBayes(Species ~.,data=train)
model


test$Species

pred=predict(model,test)
table(pred)
table(test$Species)

train$Species
table(train$Species)


ir1=ir[sample(nrow(ir)),]
View(ir1)

train=ir1[1:100,]
test=ir1[101:150,]
model=model=naiveBayes(Species ~.,data=train)
pred=predict(model,test)
table(pred)

#KN
table(iris$Species)
str(iris$Species)
head(iris)

#shuffle data.
irl=ir[sample(nrow(ir)),]
#Check Shuf
head(irl)

normalize<-function(x){
  return((x-min(x)/(max(x)-min(x))))
}
#normalize data
iris_n<-as.data.frame(lapply(ir1[,c(1,2,3,4)],normalize))
str(iris_n)


iris_train<-iris_n[1:129,]
iris_test<-iris_n[130:150,] 
iris_train_target<-iris[1:129,5] 
iris_test_target<-iris[130:150,5]
iris_train_target
    
dim(iris_train)
dim(iris_test)
install.packages("Knn")
model<-knn(iris_train,iris_test,cl=iris_train_target,k=13)
model
table(iris_test_target,model)








