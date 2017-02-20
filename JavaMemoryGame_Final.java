// The "TryTryTryAgain" class.
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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;




public class JavaMemoryGame_Final
{
    static JButton btnStart, btnStart1, buttonArray[] = new JButton [12], btnRemember, btnInstructions;
    static JFrame start, questions, survey, explain;
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
    static int n = 0, played = 0;



















    public static JButton[] randNum ()
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
	    buttonArray [i].setActionCommand ("" + arrayImage [i]);
	    buttonArray [i].setText ("" + arrayImage [i]);

	}

	return buttonArray;
    }


    public static JButton[] clearButtons ()
    {

	randNum ();
	for (int i = 0 ; i <= 11 ; i++)
	{
	    buttonArray [i].setText ("");
	}

	return buttonArray;
    }



    private static void guiApp () throws InterruptedException
    {
	explain = new JFrame ("Instructions");
	explain.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	start = new JFrame ("Welcome");
	start.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	questions = new JFrame ("Memory_Game");
	questions.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	survey = new JFrame ("How Was It?");
	survey.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	btnStart = new JButton ("Start");
	btnStart1 = new JButton ("Enter");
	btnStart1.setBackground (new Color (50, 150, 100));
	btnStart1.setForeground (Color.cyan);
	btnRemember = new JButton ("Process");
	btnRemember.setActionCommand ("Exit");
	btnInstructions = new JButton ("Got it!");

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
	lblPrompt2.setForeground (Color.cyan);
	lblExplain = new JLabel ("This is the memory game! Please enter Name," +
		" and double click to choose game type. Forewards is the game where you have to click buttons in ascending order, Backwards " +
		"is when you have to click them in descending order. " + "Click Start button when you're ready.");
	lblExplain.setForeground (Color.cyan);
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


//Ms Ward, For my program to work, id like you to input your filepath for the backwards exec... only if you want the full experince
	MouseListener mouseListener = new MouseAdapter ()
	{
	    public void mouseClicked (MouseEvent e)
	    {
		if (e.getClickCount () == 2)
		{
		    String selectedItem = (String) difficulty.getSelectedValue ();
		    if (selectedItem.equals ("BACKWARDS"))
		    {
			try
			{
			    Process process = Runtime.getRuntime ().exec ("C:\\Users\\Toni\\Documents\\Computers ISP JAva grade 11\\FinalGuiProjectToniReal\\JAVArunToniBAck.exe");
			    process.waitFor ();
			}
			catch (Exception ev)
			{
			    if (ev instanceof InterruptedException)
			    {



			    }
			    else if (ev instanceof IOException)
			    {


			    }



			}
		    }


		}
	    }
	}
	;
	difficulty.addMouseListener (mouseListener);


















	//Declare Audio
	URL ebob = JavaMemoryGame_Final.class.getResource ("T-Mass_-_Last_One_Standing_feat.wav");
	music = Applet.newAudioClip (ebob);
	URL bob = JavaMemoryGame_Final.class.getResource ("yes-1.wav");
	yess = Applet.newAudioClip (bob);
	URL tom = JavaMemoryGame_Final.class.getResource ("no-6.wav");
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
	    buttonArray [x] = new JButton ("");
	    buttonArray [x].setBackground (Color.orange);
	}
	randNum ();

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

		if (reallyBad.isSelected ())
		{
		    lblOutput.setText ("Im sorry you feel that way");


		}
		if (bad.isSelected ())
		{
		    lblOutput.setText ("Well what happened??");



		}
		if (good.isSelected ())
		{
		    lblOutput.setText ("Thanks very much!");



		}
		if (reallyGood.isSelected ())
		{
		    lblOutput.setText ("Well we are perfect!");

		}
		btnRemember.setText ("Click Twice To Exit");

	    }
	}
	);

	btnInstructions.addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent evt)
	    {
		explain.dispose ();
	    }
	}
	);

	MouseListener mouseListener2 = new MouseAdapter ()
	{
	    public void mouseClicked (MouseEvent e)
	    {
		e.getButton ();
		if (e.getClickCount () == 2)
		{
		    survey.dispose ();
		}

	    }

	}
	;
	btnRemember.addMouseListener (mouseListener2);
	btnStart.addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		String command = e.getActionCommand ();
		if (command.equals ("Start") && played == 15)
		{
		    questions.dispose ();
		    explain.dispose ();
		}

		if (command.equals ("Start"))
		{
		    played++;
		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.orange);
		    }
		    btnStart.setText ("Stop");
		    n = 0;
		    lblPressed.setText ("" + played);
		    btnStart.setActionCommand ("Stop");
		}


		if (command.equals ("Stop"))
		{
		    if (n == 12)
		    {
			scoreOutput.setText ("Score: " + score + "/15");
			n = 0;
		    }
		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		    btnStart.setActionCommand ("Start");
		    btnStart.setText ("Start");
		    randNum ();
		    n = 0;
		    lblCheck.setText ("");
		}


	    }
	}
	);

	buttonArray [0].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z0 = 0;
		String command0 = e.getActionCommand ();
		buttonArray [0].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);

		z0 = Integer.parseInt (command0);
		if (z0 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [1].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z1 = 0;
		String command1 = e.getActionCommand ();

		buttonArray [1].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z1 = Integer.parseInt (command1);
		if (z1 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [2].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z2 = 0;
		String command2 = e.getActionCommand ();

		buttonArray [2].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z2 = Integer.parseInt (command2);
		if (z2 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);


	    }
	}
	);

	buttonArray [3].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z3 = 0;
		String command3 = e.getActionCommand ();

		buttonArray [3].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z3 = Integer.parseInt (command3);
		if (z3 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    // n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [4].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z4 = 0;
		String command4 = e.getActionCommand ();

		buttonArray [4].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z4 = Integer.parseInt (command4);
		if (z4 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    // n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [5].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z5 = 0;
		String command5 = e.getActionCommand ();

		buttonArray [5].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z5 = Integer.parseInt (command5);
		if (z5 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    ///n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}

		lblPressed.setText ("" + played);
	    }
	}
	);

	buttonArray [6].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z6 = 0;
		String command6 = e.getActionCommand ();

		buttonArray [6].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z6 = Integer.parseInt (command6);
		if (z6 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    ///n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [7].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z7 = 0;
		String command7 = e.getActionCommand ();

		buttonArray [7].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z7 = Integer.parseInt (command7);
		if (z7 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    ///n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [8].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z8 = 0;
		String command8 = e.getActionCommand ();

		buttonArray [8].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z8 = Integer.parseInt (command8);
		if (z8 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    // n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [9].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z9 = 0;
		String command9 = e.getActionCommand ();

		buttonArray [9].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z9 = Integer.parseInt (command9);
		if (z9 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);
	    }
	}
	);


	buttonArray [10].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z10 = 0;
		String command10 = e.getActionCommand ();

		buttonArray [10].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z10 = Integer.parseInt (command10);
		if (z10 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);

	buttonArray [11].addActionListener (new ActionListener ()
	{
	    public void actionPerformed (ActionEvent e)
	    {
		int z11 = 0;
		String command11 = e.getActionCommand ();

		buttonArray [11].setForeground (Color.black);
		n++;
		lblCheck.setText ("" + n);
		z11 = Integer.parseInt (command11);
		if (z11 != n)
		{
		    n = 0;

		    for (int i = 0 ; i <= 11 ; i++)
		    {
			buttonArray [i].setForeground (Color.black);
		    }
		}
		if (n == 12)
		{
		    //n = 0;
		    score++;
		    played++;
		}
		if (played == 15)
		{
		    questions.setVisible (false);
		}
		lblPressed.setText ("" + played);

	    }
	}
	);



	JPanel mainStart = new JPanel (new BorderLayout ());
	mainStart.setBackground (new Color (50, 150, 100));

	JPanel scoreStuffs = new JPanel (new GridLayout (1, 2));
	scoreStuffs.setBackground (new Color (50, 150, 100));
	JPanel mainContent = new JPanel (new GridLayout (2, 2));
	mainContent.setBackground (new Color (50, 150, 100));

	JPanel gameBoard = new JPanel (new GridLayout (2, 6));
	gameBoard.setBackground (Color.orange);
	JPanel gameContent = new JPanel (new GridLayout (1, 4));
	JPanel mainGame = new JPanel (new BorderLayout ());
	mainGame.setBackground (Color.orange);
	JPanel buttonScore = new JPanel (new GridLayout (3, 1));
	buttonScore.setBackground (Color.orange);
	JPanel feedbackPanel = new JPanel (new BorderLayout ());
	feedbackPanel.setBackground (new Color (50, 10, 200));
	JPanel feedbackPanel1 = new JPanel (new GridLayout (2, 2));
	feedbackPanel1.setBackground (new Color (50, 10, 200));

	JPanel output = new JPanel (new GridLayout (1, 1));
	output.setBackground (new Color (50, 10, 200));

	JPanel instructions = new JPanel (new GridLayout (2, 1));
	instructions.setBackground (new Color (255, 136, 0));



	//Seperate Panels
	mainContent.add (lblPrompt1);
	mainContent.add (lblPrompt2);
	mainContent.add (nameEnter);
	mainContent.add (difficulty);

	//Score Stuff for main Panel
	scoreStuffs.add (btnStart1);
	scoreStuffs.add (scoreOutput1);


	//Main Welcome PAnel
	mainStart.add (lblInstruct, BorderLayout.NORTH);
	mainStart.add (mainContent, BorderLayout.CENTER);
	mainStart.add (scoreStuffs, BorderLayout.SOUTH);


	//GAme Board
	gameContent.add (btnStart);
	gameContent.add (scoreOutput);
	gameContent.add (lblCheck);
	gameContent.add (lblPressed);
	gameBoard.add (buttonArray [0]);
	gameBoard.add (buttonArray [1]);
	gameBoard.add (buttonArray [2]);
	gameBoard.add (buttonArray [3]);
	gameBoard.add (buttonArray [4]);
	gameBoard.add (buttonArray [5]);
	gameBoard.add (buttonArray [6]);
	gameBoard.add (buttonArray [7]);
	gameBoard.add (buttonArray [8]);
	gameBoard.add (buttonArray [9]);
	gameBoard.add (buttonArray [10]);
	gameBoard.add (buttonArray [11]);


	mainGame.add (gameBoard, BorderLayout.CENTER);
	mainGame.add (gameContent, BorderLayout.PAGE_END);

	feedbackPanel1.add (reallyBad);
	feedbackPanel1.add (bad);
	feedbackPanel1.add (good);
	feedbackPanel1.add (reallyGood);

	output.add (lblOutput);
	feedbackPanel.add (output, BorderLayout.CENTER);
	feedbackPanel.add (feedbackPanel1, BorderLayout.LINE_END);
	feedbackPanel.add (btnRemember, BorderLayout.SOUTH);

	instructions.add (lblExplain);
	instructions.add (btnInstructions);



	Container contentPane = start.getContentPane ();
	contentPane.add (mainStart);
	Container contentPane1 = questions.getContentPane ();
	contentPane1.add (mainGame);
	Container contentPane2 = survey.getContentPane ();
	contentPane2.add (feedbackPanel);

	Container contentPane3 = explain.getContentPane ();
	contentPane3.add (instructions);


	survey.setSize (600, 450);
	survey.setVisible (true);
	questions.setSize (500, 250);
	questions.setVisible (true);
	start.setSize (600, 450);
	start.setVisible (true);
	explain.setSize (1500, 200);
	explain.setVisible (true);












    }




    private static class ButtonHandler implements ActionListener
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
		    randNum ();
		    music.play ();
		    lblPrompt1.setText ("Thank You!");
		    start.dispose ();


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
} // TryTryTryAgain class


