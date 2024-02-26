x<-c(3,8,9,13,3,6,11,21,1,16)
#response variable 

y<-c(30,57,64,72,36,43,59,90,20,83)
plot(x,y)

plot(x,y, col='red',main="scatter plot")

#Linear Regression Model
model=lm(y~x)
model

attributes(model)
coef(model)
residuals(model)

summary(model)

abline(model)

#Predicting values manually y=a+bx
X<-model$coefficients[[1]]+model$coefficients[[2]]*10
X


#Using Predict ()
a<-data.frame(x=10) a
pred<-predict(model,a)
pred

plot(model)

