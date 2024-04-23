# Neural-Net-Mini-Project



[https://docs.google.com/document/d/1QpEyrGqyxmpaNDZtzWYkc1jY7-gxeJROQH3E2Htopn8/edit](url)


[https://www.flexcompute.com/blog/2022/03/31/aerodynamic-stall/](url)
[https://www.flexcompute.com/blog/2022/12/02/cfd-simulation-methods-for-high-lift-aircraft-configurations-part-1-of-3/](url)
[chrome-extension://efaidnbmnnnibpcajpcglclefindmkaj/https://www.faa.gov/sites/faa.gov/files/07_phak_ch5_0.pdf](url)

In the above links, I found a lot of resources surrounding lift and aerodynamics. My plan would be to begin with lift and stall points. How fast can I go before I hit the stall point, what lift will I have right before the stall point, how many angles can I reach before stalling, etc? There is already a predetermined equation that can calculate this but it is more of a trial and error so the plan would be to input the values, have the Neural net run through them, and then output the stall point. For this instance, I will be using a cessna172 to be able to find a lift coefficient without major trial and error. 

Log #2 Upload of code

Log #3:
Did some more research today involving exactly how neural networks are used to find lift coefficients in the aviation world. it does this by training with a lot of scenarios involving different wing configurations, environment conditions, and airfoil geometry. Using this it then runs through a series of tests with its training to predict the lift coefficient of each wing type per plane, as well as the drag coefficients. Planning on tomorrow being another large research day. I am realizing now that this is going to be a much larger project if I want to have a functioning Neural Network. (by larger I mean creating my library of training models because every single one I have found is behind 1000+ dollar paywalls)


Log #5
Today I found a downloadable PDF that focuses a full section on the subject of focus. It talks about how NNs are used to predict lift coefficients but unlike some of the other sources I have found, this one goes into explicit detail on the process. Specifically, the Neural Network uses over 200 layers to compute the coefficients. It then uses a database from UIUC Applied Aerodynamic Group for all of the various airfoil designs that you can find on the multitude of planes. Finally, it takes 15,678 samples for training and validation with a ratio of 8:2 just to make sure everything is correct. I have now confirmed my suspicion from yesterday that coding this properly will take ages so I think I am going to shift my focus to just beginning the creation of this project. Essentially setting everything up for the NN but then stopping and not building the actual Neural Network. 
