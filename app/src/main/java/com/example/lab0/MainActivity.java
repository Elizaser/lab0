package com.example.lab0;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * A method that returns the minimum of two numbers
     *
     * @param a - first number
     * @param b - last number
     * @return - the smallest of the two numbersл (a or b)
     */
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    /**
     * A method that returns a maximum of two numbers
     *
     * @param a - first number
     * @param b - last number
     * @return - the largest of the two numbers (a or b)
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}