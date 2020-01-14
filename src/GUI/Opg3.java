package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyCustomComponent extends JPanel implements Runnable{
    private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW};
    private int[] intArray = new int[] {1,10,20,30,40,50,60,70,80,90,100};

    public MyCustomComponent(){
        MyRunnable runnable = new MyRunnable(this);
        Thread t = new Thread(runnable);
        t.start();

    }
    public Dimension getPreferredSize(){
        int rnd = new Random().nextInt(intArray.length);
        return(new Dimension(intArray[rnd], intArray[rnd]));
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int rnd = new Random().nextInt(intArray.length);
        g.drawLine(intArray[rnd], intArray[rnd], intArray[rnd], intArray[rnd]);
        g.fillRect(intArray[rnd], intArray[rnd], intArray[rnd], intArray[rnd]);

        int rnd2 = new Random().nextInt(colors.length);
        g.setColor(colors[rnd2]);
        //g.drawImage(,3,4,this);
    }

    @Override
    public void run() {

    }
}

class MyRunnable<MainClass> implements Runnable{
    public MainClass parent;

    public MyRunnable(MainClass p){
        parent = p;
    }

    public MyRunnable() {

    }

    @Override
    public void run() {

    }
}

class NextPrime {

    public static void main(String[] args) {
        int n = 1;
        while (true){
            System.out.println(nextPrime(n));
            n= nextPrime(n);
        }
    }

    public static int nextPrime(int n){
        int m;
        int k;
        int temp = 2;
        //Her tjekkes om n er mindre end 2, da to er det mindste primtal.
        if (n < 2){
            // 2 returneres.
            return 2;
        }else
            //k er lig n+1 da det er det naeste primtal der ledes efter.
            k = n+1;

        do {
            // k mod temp udregnes.
            m = k % temp;
            // Der tjekkes om m er 0 og om temp, ikke lig k.
            if (m == 0 && temp != k){
                //1 laegges til k og temp bliver resetet.
                k = k + 1;
                temp = 2;

            }else if (m != 0){
                //Hvis m ikke er lig 0 ligges en til temp.
                temp = temp+1;
            }
            //loopet stopper når k er lig temp.
        }while (k != temp);
        // Det naeste primtal k returneres.
        return k;
    }
}

public class Opg3 extends JFrame implements ActionListener, Runnable {
    private static final long serialVersionUID = 1L;
    public static JButton quit;
    JFrame f;

    Opg3(){
        f = new JFrame();
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        //QUIT
        JPanel p1 = new JPanel();
        quit = new JButton("Quit");
        quit.addActionListener(this);
        p1.add(quit);
        content.add(p1, BorderLayout.SOUTH);

        //
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(100,100));

        content.add(p2, BorderLayout.NORTH);

        JTextArea Tekst = new JTextArea();
        Tekst.setText("Fisk");
        Tekst.setLineWrap(true);
        JScrollPane scrollpane = new JScrollPane(Tekst);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(scrollpane,BorderLayout.CENTER);
        content.add(scrollpane, BorderLayout.CENTER);
        f.setContentPane(content);

        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();

        new Opg3();
    }

    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == quit) {
            System.exit(0);
            }
        }

    @Override
    public void run() {

    }
}

