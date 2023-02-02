/**
 * @Class name: Speed light
 * @Author: Ashley Seerattan
 * @Version: 1.0
 * @Date 01 February 2023
 * Description: this program will write SpeedLight that calculate the
 * distance to a lightening strick based on the time elapsed between the flash
 * and the sound of thunder.
 * In this program, I will declare variables: speedOfSound, timeElapsed,
 * distance
 */
public class SpeedLight {
    public static void main(String[]args){
       int SPEED_OF_SOUND = 340;
       int timeElapsed = 5;
       int distance = SPEED_OF_SOUND * timeElapsed;
       System.out.print("Speed of sound:" + SPEED_OF_SOUND);
       System.out.println("Time Elapsed: " + timeElapsed);
       System.out.println("Distance:" + distance);

    }
}
