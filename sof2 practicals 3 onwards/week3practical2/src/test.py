import math
'''
datapoints = [1,5,13,21]
scale = 3

#samples = [0]*(scale*(len(datapoints)- 1) + 1)
samples = [0,0,0,0,0,0,0,0,0,0]

print(samples)

for i in range(len(datapoints)):
    samples[scale*i] = datapoints[i]

print(samples)

for i in range(0, len(samples) - 1, scale):
    for j in range(1, scale):
        x = (i + j)
        y = samples[i + j] 
        x0 = i
        x1 = (i + scale)
        y0 = samples[i]
        y1 = samples[i + scale]
        z = ((y0*(x1 - x)) + (y1*(x - x0))) / (x1 - x0)
        z = round(z)
        print(x, y, y0, y1, x0, x1, z)
        '''
scale = 2

samples=[[ 1,  26,  50,  35,  20, 20,   20],
        [  0,   0,   0,   0,   0,  0,    0],
        [100, 178, 255, 203, 150, 90,   30],
        [  0,   0,   0,   0,   0,  0,    0],
        [ 10, 133, 255, 193, 130, 170, 210],
        [  0,   0,   0,   0,   0,  0,    0],
        [ 10, 133, 255, 193, 130, 170, 210]]
#for column in range(len(samples[0])):
 #   #insert main interpolation loops here for each sample
  #  for i in range(len(samples[0])):
   #     print(samples[i][column])
    #print('\n')

#As and Bs [i]
for column in range(len(samples[0])):
    for i in range(0, len(samples[0]) - 1, scale):
        for j in range(1, scale):
            x = i + j
            y = samples[i + j][column]
            x0 = i
            x1 = i + scale
            y0 = (samples[i][column])
            y1 = (samples[i + scale][column])
            y = ((y0*(x1 - x)) + (y1*(x - x0))) / (x1 - x0)
            #print(x0, x1, y0, y1)
print(samples)