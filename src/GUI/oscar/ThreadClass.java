package GUI.oscar;

import javax.swing.*;

public class ThreadClass implements Runnable {
    public JTextArea txtarea;
    public ThreadClass(JTextArea txt) {
        txtarea = txt;
    }

    public void run() {
        boolean thread_active = true;
        while (thread_active) {
            nextPrime(0);
        }
    }

    public int nextPrime(int n) {
        int newnum = n + 1;
        while (true) {
            if (isPrime(newnum)) {
                txtarea.append(newnum + ",   ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                nextPrime(newnum);
            } else {
				newnum = newnum + 1;
            }
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
	



