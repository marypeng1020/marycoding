/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] newAudio = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            newAudio[i] = a[i] * alpha;
        }
        return newAudio;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] newAudio = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            newAudio[i] = a[a.length - i - 1];
        }
        return newAudio;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        int t = a.length + b.length;
        double[] newAudio = new double[t];
        for (int i = 0; i < a.length; i++) newAudio[i] = a[i];
        for (int j = 0; j < b.length; j++)
            newAudio[a.length + j] = b[j];
        return newAudio;
    }


    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int t = Math.max(a.length, b.length);
        double[] newAudio = new double[t];

        if (a.length > b.length) {
            for (int j = 0; j < b.length; j++) newAudio[j] = b[j];
            for (int i = b.length; i < a.length; i++) newAudio[i] = 0;
            for (int f = 0; f < t; f++) newAudio[f] += a[f];
        }
        else if (a.length < b.length) {
            for (int j = 0; j < a.length; j++) newAudio[j] = a[j];
            for (int i = a.length; i < b.length; i++) newAudio[i] = 0;
            for (int f = 0; f < t; f++) newAudio[f] += b[f];
        }
        else for (int f = 0; f < t; f++) newAudio[f] = a[f] + b[f];
        return newAudio;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] newAudio = new double[(int) (a.length / alpha)];
        for (int i = 0;
             i < newAudio.length;
             i++) {
            newAudio[i] = a[(int) (Math.floor(alpha * i))];
        }
        return newAudio;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        String[] fileNames = {
                "beatbox.wav", "harp.wav", "singer.wav", "scratch.wav",
                "buzzer.wav"
        };

        double[] newAudio0 = StdAudio.read(fileNames[0]);
        double[] newAudio1 = StdAudio.read(fileNames[1]);
        double[] newAudio2 = StdAudio.read(fileNames[2]);
        double[] newAudio3 = StdAudio.read(fileNames[3]);
        double[] newAudio4 = StdAudio.read(fileNames[4]);


        StdAudio.play(amplify(newAudio0, 0.5));
        StdAudio.play(reverse(amplify(newAudio1, 0.5)));
        StdAudio.play(merge(amplify(newAudio2, 0.5), amplify(newAudio3, 0.5)));
        StdAudio.play(mix(amplify(newAudio4, 0.5), amplify(newAudio0, 0.5)));
        StdAudio.play(changeSpeed(amplify(newAudio0, 0.5), 0.5));

    }



}


