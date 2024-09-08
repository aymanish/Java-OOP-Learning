import java.util.Arrays;

public class LinearInterpolation {
    
    //datapoints is an array of integers
    public static int[] resample(int[] datapoints) {
        int[] samples = new int[datapoints.length - 1];
        int[] output = new int[(datapoints.length + samples.length)];
        int value;
        for(int i = 0; i < datapoints.length -1; i++){
            value = (datapoints[i] + (datapoints[i+1]))/2;
            samples[i] = value;
        }
        for(int i = 0; i < output.length; i++){
            if(i < 4){
                output[i] = datapoints[i];
            }else{
                output[i] = samples[i - 4];
            }
        }
        Arrays.sort(output, 0, 7);
        return output;
    }
    public static int[] resample(int[] datapoints, int scale) {
        int[] samples = new int[scale*(datapoints.length - 1) + 1];
        for(int i = 0; i < datapoints.length; i++){
            samples[scale*i] = datapoints[i];
        }
        for(int i = 0; i < samples.length - 1; i += scale){
            for(int j = 1; j < scale; j++){
                samples[i + j] = Math.round(((samples[i]*((i + (float)scale) - (i + j))) + (samples[i + scale]*((i + j) - i))) / ((i + scale) - i));
            }
        }
        return samples;    
    }
    public static int[][] resample(int[][] image, int scale) {
        int[][] samples = new int[scale*(image[0].length - 1) + 1][scale*(image[0].length - 1) + 1];
        for(int r = 0; r < image[0].length; r++){
            for(int c = 0; c < image[0].length; c++){
                samples[scale*r][scale*c] = image[r][c];
            }
        }
        for(int r = 0; r < samples[0].length; r += scale){
            for(int  i = 0; i < samples[0].length -1; i += scale){
                for(int j = 1; j < scale; j++){
                    samples[r][i + j] = Math.round(((samples[r][i]*((i + (float)scale) - (i + j))) + (samples[r][i + scale]*((i + j) - i))) / ((i + scale) - i));
                }
            }
        }
        //EQUATION: y = ((y0*(x1 - x)) + (y1*(x - x0))) / (x1 - x0)
        //x = i + j
        //y = samples[i + j][column]
        //x0 = i
        //x1 = i + scale
        //y0 = (samples[i][column])
        //y1 = (samples[i + scale][column])
        for(int column = 0; column < samples[0].length; column++){
            for(int i = 0; i < samples[0].length - 1; i += scale){
                for(int j = 1; j < scale; j++){
                    samples[i + j][column] = Math.round(((samples[i][column])*((i + (float)scale) - (i + j))) + ((samples[i + scale][column])*((i + j) - i))) / ((i + scale) - i);
                }
            }
        }
        return samples;
    }

    public static void main(String[] args) {
        int[] datapoints = {1,5,13,21};
        int[][] image = {{1,50,20,20},{100,255,150,30},{10,255,130,210},{10,255,130,210}};
        P2Exo4.print(LinearInterpolation.resample(datapoints));
        System.out.println("\n");
        P2Exo4.print(LinearInterpolation.resample(datapoints, 3));
        System.out.println("\n");
        P2Exo4.print(LinearInterpolation.resample(image, 2));
        System.out.println("\n");
    }
}
