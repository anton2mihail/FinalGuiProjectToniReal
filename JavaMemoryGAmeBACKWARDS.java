// The "JavaMemoryGAmeBACKWARDS" class.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;
import java.util.Arrays;
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;
import java.util.*;

public class JavaMemoryGAmeBACKWARDS
{
    static JButton btnStart, btnStart1, buttonArray11[] = new JButton [12], btnRemember;
    static JFrame start1, questions1, survey1, explain1;
    static JTextField nameEnter;
    static JLabel scoreOutput, scoreOutput1, lblTitle, lblExplain, lblPrompt1, lblPrompt2, lblInstruct, lblCheck, lblPressed, lblOutput;
    static JRadioButton reallyBad, bad, good, reallyGood, checkRadio;
    static AudioClip music, yess, noo;
    static ButtonGroup finalSurvey;
    static DefaultListModel listModel;
    static JList difficulty;
    static int randNumGenerator;
    static int score = 0, arrayImage[] = new int [12];
    static int check = 0;
    // static String lblPressed[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    static int n = 12, played = 0;



















    public static JButton[] randNum1 ()
    {

	arrayImage [0] = (int) (Math.random () * 12) + 1;
	arrayImage [1] = (int) (Math.random () * 12) + 1;
	while (arrayImage [1] == arrayImage [0])
	{
	    arrayImage [1] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [2] = (int) (Math.random () * 12) + 1;
	while (arrayImage [2] == arrayImage [1] || arrayImage [2] == arrayImage [0])
	{
	    arrayImage [2] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [3] = (int) (Math.random () * 12) + 1;
	while (arrayImage [3] == arrayImage [2] || arrayImage [3] == arrayImage [1] || arrayImage [3] == arrayImage [0])
	{
	    arrayImage [3] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [4] = (int) (Math.random () * 12) + 1;
	while (arrayImage [4] == arrayImage [3] || arrayImage [4] == arrayImage [2] || arrayImage [4] == arrayImage [1] || arrayImage [4] == arrayImage [0])
	{
	    arrayImage [4] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [5] = (int) (Math.random () * 12) + 1;
	while (arrayImage [5] == arrayImage [4] || arrayImage [5] == arrayImage [3] || arrayImage [5] == arrayImage [2] || arrayImage [5] == arrayImage [1] || arrayImage [5] == arrayImage [0])
	{
	    arrayImage [5] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [6] = (int) (Math.random () * 12) + 1;
	while (arrayImage [6] == arrayImage [5] || arrayImage [6] == arrayImage [4] || arrayImage [6] == arrayImage [3] || arrayImage [6] == arrayImage [2] || arrayImage [6] == arrayImage [1] || arrayImage [6] == arrayImage [0])
	{
	    arrayImage [6] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [7] = (int) (Math.random () * 12) + 1;
	while (arrayImage [7] == arrayImage [6] || arrayImage [7] == arrayImage [5] || arrayImage [7] == arrayImage [4] || arrayImage [7] == arrayImage [3] || arrayImage [7] == arrayImage [2] || arrayImage [7] == arrayImage [1] || arrayImage [7] == arrayImage [0])
	{
	    arrayImage [7] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [8] = (int) (Math.random () * 12) + 1;
	while (arrayImage [8] == arrayImage [7] || arrayImage [8] == arrayImage [6] || arrayImage [8] == arrayImage [5] || arrayImage [8] == arrayImage [4] || arrayImage [8] == arrayImage [3] || arrayImage [8] == arrayImage [2] || arrayImage [8] == arrayImage [1] || arrayImage [8] == arrayImage [0])
	{
	    arrayImage [8] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [9] = (int) (Math.random () * 12) + 1;
	while (arrayImage [9] == arrayImage [8] || arrayImage [9] == arrayImage [7] || arrayImage [9] == arrayImage [6] || arrayImage [9] == arrayImage [5] || arrayImage [9] == arrayImage [4] || arrayImage [9] == arrayImage [3] || arrayImage [9] == arrayImage [2] || arrayImage [9] == arrayImage [1] || arrayImage [9] == arrayImage [0])
	{
	    arrayImage [9] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [10] = (int) (Math.random () * 12) + 1;
	while (arrayImage [10] == arrayImage [9] || arrayImage [10] == arrayImage [8] || arrayImage [10] == arrayImage [7] || arrayImage [10] == arrayImage [6] || arrayImage [10] == arrayImage [5] || arrayImage [10] == arrayImage [4] || arrayImage [10] == arrayImage [3] || arrayImage [10] == arrayImage [2] || arrayImage [10] == arrayImage [1] || arrayImage [10] == arrayImage [0])
	{
	    arrayImage [10] = (int) (Math.random () * 12) + 1;
	}
	arrayImage [11] = (int) (Math.random () * 12) + 1;
	while (arrayImage [11] == arrayImage [10] || arrayImage [11] == arrayImage [9] || arrayImage [11] == arrayImage [8] || arrayImage [11] == arrayImage [7] || arrayImage [11] == arrayImage [6] || arrayImage [11] == arrayImage [5] || arrayImage [11] == arrayImage [4] || arrayImage [11] == arrayImage [3] || arrayImage [11] == arrayImage [2] || arrayImage [11] == arrayImage [1] || arrayImage [11] == arrayImage [0])
	{
	    arrayImage [11] = (int) (Math.random () * 12) + 1;
	}

	for (int i = 0 ; i <= 11 ; i++)
	{
	    buttonArray11 [i].setActionCommand ("" + arrayImage [i]);
	    buttonArray11 [i].setText ("" + arrayImage [i]);

	}

	return buttonArray11;
    }


    public static JButton[] clearButtons ()
    {

	randNum1 ();
	for (int i = 0 ; i <= 11 ; i++)
	{
	    buttonArray11 [i].setText ("");
	}

	return buttonArray11;
    }



    public static void guiApp () throws InterruptedException
    {
	explain1 = new JFrame ("Instructions");
	explain1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	start1 = new JFrame ("Welcome");
	start1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	questions1 = new JFrame ("Memory_Game");
	questions1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	survey1 = new JFrame ("How Was It?");
	survey1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	btnStart = new JButton ("Start");
	btnStart1 = new JButton ("Enter");
	btnStart1.setBackground (new Color (50, 150, 100));
	btnStart1.setForeground (Color.cyan);
	btnRemember = new JButton ("Process");
	lblPressed = new JLabel ("" + played);
	lblCheck = new JLabel ("" + n);
	lblCheck.setVisible (true);
	lblOutput = new JLabel ("Hi!!");
	lblOutput.setForeground (Color.cyan);
	lblTitle = new JLabel ("Memory Match Game!");
	lblTitle.setForeground (Color.cyan);
	lblInstruct = new JLabel ("Welcome to the Memory Match Game!");
	lblInstruct.setForeground (Color.cyan);
	lblPrompt1 = new JLabel ("Please enter your first name:");
	lblPrompt1.setForeground (Color.cyan);
	lblPrompt2 = new JLabel ("Choose the Game Type: ");
	lblExplain = new JLabel ("This is the memory game! Please enter Name," +
		" and double click to choose game type. Forewards is the game where you have to click buttons in ascending order, Backwards " +
		"is when you have to click them in descending order. " + "Click Start button when you're ready.");
	nameEnter = new JTextField ("");

	scoreOutput = new JLabel ("Score: " + score + "/15");
	scoreOutput1 = new JLabel ("Score: " + score + "/15");
	scoreOutput1.setForeground (Color.cyan);
	reallyBad = new JRadioButton ("Really Bad");
	reallyBad.setBackground (new Color (50, 10, 200));
	reallyBad.setForeground (Color.cyan);
	bad = new JRadioButton ("Bad");
	bad.setBackground (new Color (50, 10, 200));
	bad.setForeground (Color.cyan);
	good = new JRadioButton ("Good");
	good.setBackground (new Color (50, 10, 200));
	good.setForeground (Color.cyan);
	reallyGood = new JRadioButton ("Really Good");
	reallyGood.setBackground (new Color (50, 10, 200));
	reallyGood.setForeground (Color.cyan);
	checkRadio = new JRadioButton ("");
	//list
	listModel = new DefaultListModel ();
	difficulty = new JList (listModel);
	JScrollPane pane = new JScrollPane (difficulty);
	listModel.addElement ("FOREWARDS");
	listModel.addElement ("BACKWARDS");



	

















	//Declare Audio
	URL ebob = JavaMemoryGAmeBACKWARDS.class.getResource ("T-Mass_-_Last_One_Standing_feat.wav");
	music = Applet.newAudioClip (ebob);
	URL bob = JavaMemoryGAmeBACKWARDS.class.getResource ("yes-1.wav");
	yess = Applet.newAudioClip (bob);
	URL tom = JavaMemoryGAmeBACKWARDS.class.getResource ("no-6.wav");
	noo = Applet.newAudioClip (tom);

	//set up radio buttons
	finalSurvey = new ButtonGroup ();
	finalSurvey.add (reallyBad);
	finalSurvey.add (bad);
	finalSurvey.add (good);
	finalSurvey.add (reallyGood);
	finalSurvey.add (checkRadio);
	reallyBad.setActionCommand ("1");
	bad.setActionCommand ("2");
	good.setActionCommand ("3");
	reallyGood.setActionCommand ("4");


	for (int x = 0 ; x <= 11 ; x++)
	{
	    buttonArray11 [x] = new JButton ("");
	    buttonArray11 [x].setBackground (Color.orange);
	}
	randNum1 ();

	//Button Handlers!!
	ButtonHandler onClick = new ButtonHandler ();
	nameEnter.addActionListener (onClick);
	btnStart1.addActionListener (onClick);

	btnStart1.setActionCommand ("Enter");


	btnRemember.addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent evt)
	    {
		String c = evt.getActionCommand ();

		if (c.equals ("Process") && reallyBad.isSelected ())
		{
		    //lblOutput.setText ("Im sorry you feel that way");
		    checkRadio.setSelected (true);


		}
		if (c.equals ("Process") && bad.isSelected ())
		{
		    lblOutput.setText ("Well what happened??");
		    checkRadio.setSelected (true);


		}
		if (c.equals ("Process") && good.isSelected ())
		{
		    lblOutput.setText ("Thanks very much!");
		    checkRadio.setSelected (true);


		}
		if (c.equals ("Process") && reallyGood.isSelected ())
		{
		    lblOutput.setText ("Well we are perfect!");
		    checkRadio.setSelected (true);

		}
		
	    }
	}
	);

	btnStart.addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		String command = e.getActionCommand ();
		if (command.equals ("Start") && played == 15)
		{
		    questions1.dispose ();
		}

		if (command.equals ("Start"))
		{
		    played++;
		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11 [i].setForeground (Color.orange);
		    }
		    btnStart.setText ("Stop");
		    n = 13;
		    lblPressed.setText ("" + played);
		    btnStart.setActionCommand ("Stop");
		}


		if (command.equals ("Stop"))
		{
		    if (n == 0)
		    {
			scoreOutput.setText ("Score: " + score + "/15");
			n = 13;
		    }
		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11 [i].setForeground (Color.black);
		    }
		    btnStart.setActionCommand ("Start");
		    btnStart.setText ("Start");
		    randNum1 ();
		    n = 13;
		    lblCheck.setText ("");
		}


	    }
	}
	);

	buttonArray11 [0].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z0 = 13;
		String command0 = e.getActionCommand ();
		buttonArray11 [0].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);

		z0 = Integer.parseInt (command0);
		if (z0 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11 [i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11 [1].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z1 = 13;
		String command1 = e.getActionCommand ();

		buttonArray11 [1].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z1 = Integer.parseInt (command1);
		if (z1 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11 [i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[2].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z2 = 13;
		String command2 = e.getActionCommand ();

		buttonArray11[2].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z2 = Integer.parseInt (command2);
		if (z2 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);


	    }
	}
	);

	buttonArray11[3].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z3 = 13;
		String command3 = e.getActionCommand ();

		buttonArray11[3].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z3 = Integer.parseInt (command3);
		if (z3 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    // n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[4].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z4 = 13;
		String command4 = e.getActionCommand ();

		buttonArray11[4].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z4 = Integer.parseInt (command4);
		if (z4 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    // n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[5].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z5 = 13;
		String command5 = e.getActionCommand ();

		buttonArray11[5].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z5 = Integer.parseInt (command5);
		if (z5 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    ///n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}

		lblPressed.setText ("" + played);
	    }
	}
	);

	buttonArray11[6].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z6 = 13;
		String command6 = e.getActionCommand ();

		buttonArray11[6].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z6 = Integer.parseInt (command6);
		if (z6 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    ///n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[7].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z7 = 13;
		String command7 = e.getActionCommand ();

		buttonArray11[7].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z7 = Integer.parseInt (command7);
		if (z7 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    ///n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[8].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z8 = 13;
		String command8 = e.getActionCommand ();

		buttonArray11[8].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z8 = Integer.parseInt (command8);
		if (z8 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    // n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[9].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z9 = 13;
		String command9 = e.getActionCommand ();

		buttonArray11[9].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z9 = Integer.parseInt (command9);
		if (z9 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);
	    }
	}
	);


	buttonArray11[10].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z10 = 13;
		String command10 = e.getActionCommand ();

		buttonArray11[10].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z10 = Integer.parseInt (command10);
		if (z10 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray11[11].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z11 = 13;
		String command11 = e.getActionCommand ();

		buttonArray11[11].setForeground (Color.black);
		n--;
		lblCheck.setText ("" + n);
		z11 = Integer.parseInt (command11);
		if (z11 != n)
		{
		    n = 13;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray11[i].setForeground (Color.black);
		    }
		}
		if (n == 0)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions1.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);



	JPanel mainStart1 = new JPanel (new BorderLayout ());
	mainStart1.setBackground (new Color (50, 150, 100));

	JPanel scoreStuffs1 = new JPanel (new GridLayout (1, 2));
	scoreStuffs1.setBackground (new Color (50, 150, 100));
	JPanel mainContent1 = new JPanel (new GridLayout (2, 2));
	mainContent1.setBackground (new Color (50, 150, 100));

	JPanel gameBoard1 = new JPanel (new GridLayout (2, 6));
	gameBoard1.setBackground (Color.orange);
	JPanel gameContent1 = new JPanel (new GridLayout (1, 4));
	JPanel mainGame1 = new JPanel (new BorderLayout ());
	mainGame1.setBackground (Color.orange);
	JPanel buttonScore1 = new JPanel (new GridLayout (3, 1));
	buttonScore1.setBackground (Color.orange);
	JPanel feedbackPanel0 = new JPanel (new BorderLayout ());
	feedbackPanel0.setBackground (new Color (50, 10, 200));
	JPanel feedbackPanel11 = new JPanel (new GridLayout (2, 2));
	feedbackPanel11.setBackground (new Color (50, 10, 200));

	JPanel output1 = new JPanel (new GridLayout (1, 1));
	output1.setBackground (new Color (50, 10, 200));

	JPanel instructions1 = new JPanel (new GridLayout (1, 1));
	instructions1.setBackground (new Color (255, 136, 0));



	//Seperate Panels
	mainContent1.add (lblPrompt1);
	mainContent1.add (lblPrompt2);
	mainContent1.add (nameEnter);
	mainContent1.add (difficulty);

	//Score Stuff for main Panel
	scoreStuffs1.add (btnStart1);
	scoreStuffs1.add (scoreOutput1);


	//Main Welcome PAnel
	mainStart1.add (lblInstruct, BorderLayout.NORTH);
	mainStart1.add (mainContent1, BorderLayout.CENTER);
	mainStart1.add (scoreStuffs1, BorderLayout.SOUTH);


	//GAme Board
	gameContent1.add (btnStart);
	gameContent1.add (scoreOutput);
	gameContent1.add (lblCheck);
	gameContent1.add (lblPressed);
	gameBoard1.add (buttonArray11[0]);
	gameBoard1.add (buttonArray11[1]);
	gameBoard1.add (buttonArray11[2]);
	gameBoard1.add (buttonArray11[3]);
	gameBoard1.add (buttonArray11[4]);
	gameBoard1.add (buttonArray11[5]);
	gameBoard1.add (buttonArray11[6]);
	gameBoard1.add (buttonArray11[7]);
	gameBoard1.add (buttonArray11[8]);
	gameBoard1.add (buttonArray11[9]);
	gameBoard1.add (buttonArray11[10]);
	gameBoard1.add (buttonArray11[11]);


	mainGame1.add (gameBoard1, BorderLayout.CENTER);
	mainGame1.add (gameContent1, BorderLayout.PAGE_END);

	feedbackPanel11.add (reallyBad);
	feedbackPanel11.add (bad);
	feedbackPanel11.add (good);
	feedbackPanel11.add (reallyGood);

	output1.add (lblOutput);
	feedbackPanel0.add (output1, BorderLayout.CENTER);
	feedbackPanel0.add (feedbackPanel11, BorderLayout.LINE_END);
	feedbackPanel0.add (btnRemember, BorderLayout.SOUTH);

	instructions1.add (lblExplain);



	Container contentPane0 = start1.getContentPane ();
	contentPane0.add (mainStart1);
	Container contentPane11 = questions1.getContentPane ();
	contentPane11.add (mainGame1);
	Container contentPane21 = survey1.getContentPane ();
	contentPane21.add (feedbackPanel11);

	Container contentPane33 = explain1.getContentPane ();
	contentPane33.add (instructions1);


	survey1.setSize (600, 450);
	survey1.setVisible (false);
	questions1.setSize (500, 250);
	questions1.setVisible (true);
	start1.setSize (600, 450);
	start1.setVisible (false);
	instructions1.setSize (400, 400);
	instructions1.setVisible (false);












    }




    public static class ButtonHandler implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    String textFieldValue = nameEnter.getText ();
	    int no = 0;
	    String lblPressed[] = new String [12];

	    String command = e.getActionCommand ();

	    if (command.equals ("Enter"))
	    {
		if (textFieldValue.length () > 0)
		{
		    randNum1 ();
		    music.play ();
		    lblPrompt1.setText ("Thank You!");
		    start1.dispose ();


		}
		else
		{
		    lblPrompt1.setText ("Enter first name before continuing!");

		}

	    }




	}





    }











    public static void main (String[] args)
    {
	javax.swing.SwingUtilities.invokeLater (new Runnable ()
	{
	    public void run ()
	    {
		try
		{
		    guiApp ();
		}
		catch (InterruptedException ex)
		{
		    Thread.currentThread ().interrupt (); // Here!
		    throw new RuntimeException (ex);
		}
	    }
	}


	);


    } // main method
} // JavaMemoryGAmeBACKWARDS class
