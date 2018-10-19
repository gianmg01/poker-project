package finalproject;

import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

/*
 better author, Giancarlo
  author Alexie
 */
public class FinalProject extends JFrame implements ActionListener {
    //creating all the gui componants
    public static JFrame window = new JFrame();     
    public static JFrame results = new JFrame();
    public static JPanel pan = new JPanel();
    public static JPanel pan2 = new JPanel();
    public static JPanel pan3 = new JPanel();
    public static JPanel pan4 = new JPanel();
    public static JPanel pan5 = new JPanel();
    public static JPanel pan6 = new JPanel();
    public static JPanel abc = new JPanel();
    public static JPanel pan7 = new JPanel();
    public static JButton ok = new JButton();
    public static JButton bet = new JButton();
    public static JButton up = new JButton();
    public static JButton down = new JButton();
    public static JButton card1 = new JButton();
    public static JButton card2 = new JButton();
    public static JButton card3 = new JButton();
    public static JButton card4 = new JButton();
    public static JButton card5 = new JButton();
    public static JButton quit = new JButton();
    public static JLabel dealerCard1 = new JLabel();
    public static JLabel dealerCard2 = new JLabel();
    public static JLabel dealerCard3 = new JLabel();
    public static JLabel dealerCard4 = new JLabel();
    public static JLabel dealerCard5 = new JLabel();
    public static JLabel moneyBet = new JLabel();
    public static JLabel money = new JLabel();
    public static JLabel resultsC = new JLabel();
    public static JLabel score = new JLabel();
    //setting all the image icons
    public static ImageIcon cardBack = new ImageIcon("src/finalproject/CardBack.jpg");
    public static ImageIcon c14 = new ImageIcon("src/finalproject/AceClubs.jpg");
    public static ImageIcon c2 = new ImageIcon("src/finalproject/TwoClubs.jpg");
    public static ImageIcon c3 = new ImageIcon("src/finalproject/ThreeClubs.jpg");
    public static ImageIcon c4 = new ImageIcon("src/finalproject/FourClubs.jpg");
    public static ImageIcon c5 = new ImageIcon("src/finalproject/FiveClubs.jpg");
    public static ImageIcon c6 = new ImageIcon("src/finalproject/SixClubs.jpg");
    public static ImageIcon c7 = new ImageIcon("src/finalproject/SevenClubs.jpg");
    public static ImageIcon c8 = new ImageIcon("src/finalproject/EightClubs.jpg");
    public static ImageIcon c9 = new ImageIcon("src/finalproject/NineClubs.jpg");
    public static ImageIcon c10 = new ImageIcon("src/finalproject/TenClubs.jpg");
    public static ImageIcon c11 = new ImageIcon("src/finalproject/JackClubs.jpg");
    public static ImageIcon c12 = new ImageIcon("src/finalproject/QueenClubs.jpg");
    public static ImageIcon c13 = new ImageIcon("src/finalproject/KingClubs.jpg");
    public static ImageIcon d14 = new ImageIcon("src/finalproject/AceDiamonds.jpg");
    public static ImageIcon d2 = new ImageIcon("src/finalproject/TwoDiamonds.jpg");
    public static ImageIcon d3 = new ImageIcon("src/finalproject/ThreeDiamonds.jpg");
    public static ImageIcon d4 = new ImageIcon("src/finalproject/FourDiamonds.jpg");
    public static ImageIcon d5 = new ImageIcon("src/finalproject/FiveDiamonds.jpg");
    public static ImageIcon d6 = new ImageIcon("src/finalproject/SixDiamonds.jpg");
    public static ImageIcon d7 = new ImageIcon("src/finalproject/SevenDiamonds.jpg");
    public static ImageIcon d8 = new ImageIcon("src/finalproject/EightDiamonds.jpg");
    public static ImageIcon d9 = new ImageIcon("src/finalproject/NineDiamonds.jpg");
    public static ImageIcon d10 = new ImageIcon("src/finalproject/TenDiamonds.jpg");
    public static ImageIcon d11 = new ImageIcon("src/finalproject/JackDiamonds.jpg");
    public static ImageIcon d12 = new ImageIcon("src/finalproject/QueenDiamonds.jpg");
    public static ImageIcon d13 = new ImageIcon("src/finalproject/KingDiamonds.jpg");
    public static ImageIcon h14 = new ImageIcon("src/finalproject/AceHearts.jpg");
    public static ImageIcon h2 = new ImageIcon("src/finalproject/TwoHearts.jpg");
    public static ImageIcon h3 = new ImageIcon("src/finalproject/ThreeHearts.jpg");
    public static ImageIcon h4 = new ImageIcon("src/finalproject/FourHearts.jpg");
    public static ImageIcon h5 = new ImageIcon("src/finalproject/FiveHearts.jpg");
    public static ImageIcon h6 = new ImageIcon("src/finalproject/SixHearts.jpg");
    public static ImageIcon h7 = new ImageIcon("src/finalproject/SevenHearts.jpg");
    public static ImageIcon h8 = new ImageIcon("src/finalproject/EightHearts.jpg");
    public static ImageIcon h9 = new ImageIcon("src/finalproject/NineHearts.jpg");
    public static ImageIcon h10 = new ImageIcon("src/finalproject/TenHearts.jpg");
    public static ImageIcon h11 = new ImageIcon("src/finalproject/JackHearts.jpg");
    public static ImageIcon h12 = new ImageIcon("src/finalproject/QueenHearts.jpg");
    public static ImageIcon h13 = new ImageIcon("src/finalproject/KingHearts.jpg");
    public static ImageIcon s14 = new ImageIcon("src/finalproject/AceSpades.jpg");
    public static ImageIcon s2 = new ImageIcon("src/finalproject/TwoSpades.jpg");
    public static ImageIcon s3 = new ImageIcon("src/finalproject/ThreeSpades.jpg");
    public static ImageIcon s4 = new ImageIcon("src/finalproject/FourSpades.jpg");
    public static ImageIcon s5 = new ImageIcon("src/finalproject/FiveSpades.jpg");
    public static ImageIcon s6 = new ImageIcon("src/finalproject/SixSpades.jpg");
    public static ImageIcon s7 = new ImageIcon("src/finalproject/SevenSpades.jpg");
    public static ImageIcon s8 = new ImageIcon("src/finalproject/EightSpades.jpg");
    public static ImageIcon s9 = new ImageIcon("src/finalproject/NineSpades.jpg");
    public static ImageIcon s10 = new ImageIcon("src/finalproject/TenSpades.jpg");
    public static ImageIcon s11 = new ImageIcon("src/finalproject/JackSpades.jpg");
    public static ImageIcon s12 = new ImageIcon("src/finalproject/QueenSpades.jpg");
    public static ImageIcon s13 = new ImageIcon("src/finalproject/KingSpades.jpg");
    //public static ImageIcon background = new ImageIcon("Desktop/abc.png");

    //ints for the players money
    public static int coinsOwned = 50;
    public static int coinsBet = 0;
    //variables to hold scores to compare to deside who wins
    public static int playerScore = 0;
    public static int dealerScore = 0;
    public static int playerHighCard = 0;
    public static int dealerHighCard = 0;
    public static char playerHighCardSuit = 'a';
    public static char dealerHighCardSuit = 'a';
    public static int winHand = 0;
    public static int count = 0;

    //holds the values of the cards
    public static int[] cardNumbers = new int[15];
    public static char[] cardSuits = new char[15];
    public static String[] cards = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    //boolens for knowing is a card back is sowing of if buttons are enabled
    public static boolean isCardBack1 = false;
    public static boolean isCardBack2 = false;
    public static boolean isCardBack3 = false;
    public static boolean isCardBack4 = false;
    public static boolean isCardBack5 = false;
    public static boolean buttonEnabled5 = true;
    public static boolean buttonEnabled4 = true;
    public static boolean buttonEnabled3 = true;
    public static boolean buttonEnabled2 = true;
    public static boolean buttonEnabled1 = true;
    public static boolean cardCheck = true;
    //char for holding the the letters of suits
    public static char suit[] = {'c', 'd', 'h', 's'};
    //creating dimensions and df for formatting
    public static Dimension cardSize = new Dimension(127, 177);
    public static Dimension e = new Dimension(50, 50);
    public static Dimension f = new Dimension(70, 185);
    public static Dimension g = new Dimension(137, 364);
    public static Dimension n = new Dimension(50, 30);
    public static DecimalFormat df = new DecimalFormat("###,###");

    public FinalProject() {
        //creating a label and setting the componants
        money.setPreferredSize(e);
        money.setMinimumSize(e);
        money.setMaximumSize(e);
        money.setAlignmentX(CENTER_ALIGNMENT);
        money.setBackground(Color.WHITE);
        money.setText(df.format(coinsOwned));
        money.setOpaque(true);
        money.setVisible(true);
        money.setToolTipText("Your Money");
        //creating a label and setting the componants
        moneyBet.setPreferredSize(e);
        moneyBet.setMinimumSize(e);
        moneyBet.setMaximumSize(e);
        moneyBet.setAlignmentX(CENTER_ALIGNMENT);
        moneyBet.setBackground(Color.WHITE);
        moneyBet.setText(df.format(coinsBet));
        moneyBet.setOpaque(true);
        moneyBet.setVisible(true);
        moneyBet.setToolTipText("Money You're Betting");
        //creating a label and setting the componants
        quit.setBackground(Color.WHITE);
        quit.setOpaque(true);
        quit.setVisible(true);
        quit.addActionListener(this);
        quit.setEnabled(true);
        quit.setToolTipText("QUIT");
        quit.setText("quit");
        //creating a button and setting the componants
        card1.setPreferredSize(cardSize);
        card1.setMinimumSize(cardSize);
        card1.setMaximumSize(cardSize);
        card1.setAlignmentY(CENTER_ALIGNMENT);
        card1.setBackground(Color.WHITE);
        card1.setOpaque(true);
        card1.setVisible(true);
        card1.addActionListener(this);
        card1.setEnabled(false);
        card1.setToolTipText("Your cards");
        //creating a button and setting the componants
        card2.setPreferredSize(cardSize);
        card2.setMinimumSize(cardSize);
        card2.setMaximumSize(cardSize);
        card2.setAlignmentY(CENTER_ALIGNMENT);
        card2.setBackground(Color.WHITE);
        card2.setOpaque(true);
        card2.setVisible(true);
        card2.addActionListener(this);
        card2.setEnabled(false);
        card2.setToolTipText("Your cards");
        //creating a button and setting the componants
        card3.setPreferredSize(cardSize);
        card3.setMinimumSize(cardSize);
        card3.setMaximumSize(cardSize);
        card3.setAlignmentY(CENTER_ALIGNMENT);
        card3.setBackground(Color.WHITE);
        card3.setOpaque(true);
        card3.setVisible(true);
        card3.addActionListener(this);
        card3.setEnabled(false);
        card3.setToolTipText("Your cards");
        //creating a button and setting the componants
        card4.setPreferredSize(cardSize);
        card4.setMinimumSize(cardSize);
        card4.setMaximumSize(cardSize);
        card4.setAlignmentY(CENTER_ALIGNMENT);
        card4.setBackground(Color.WHITE);
        card4.setOpaque(true);
        card4.setVisible(true);
        card4.addActionListener(this);
        card4.setEnabled(false);
        card4.setToolTipText("Your cards");
        //creating a button and setting the componants
        card5.setPreferredSize(cardSize);
        card5.setMinimumSize(cardSize);
        card5.setMaximumSize(cardSize);
        card5.setAlignmentY(CENTER_ALIGNMENT);
        card5.setBackground(Color.WHITE);
        card5.setOpaque(true);
        card5.setVisible(true);
        card5.addActionListener(this);
        card5.setEnabled(false);
        card5.setToolTipText("Your cards");
        //creating a label and setting the componants
        dealerCard1.setPreferredSize(cardSize);
        dealerCard1.setMinimumSize(cardSize);
        dealerCard1.setMaximumSize(cardSize);
        dealerCard1.setAlignmentY(CENTER_ALIGNMENT);
        dealerCard1.setBackground(Color.WHITE);
        dealerCard1.setOpaque(true);
        dealerCard1.setVisible(true);
        dealerCard1.setToolTipText("Dealer's cards");
        //creating a label and setting the componants
        dealerCard2.setPreferredSize(cardSize);
        dealerCard2.setMinimumSize(cardSize);
        dealerCard2.setMaximumSize(cardSize);
        dealerCard2.setAlignmentY(CENTER_ALIGNMENT);
        dealerCard2.setBackground(Color.WHITE);
        dealerCard2.setOpaque(true);
        dealerCard2.setVisible(true);
        dealerCard2.setToolTipText("Dealer's cards");
        //creating a label and setting the componants
        dealerCard3.setPreferredSize(cardSize);
        dealerCard3.setMinimumSize(cardSize);
        dealerCard3.setMaximumSize(cardSize);
        dealerCard3.setAlignmentY(CENTER_ALIGNMENT);
        dealerCard3.setBackground(Color.WHITE);
        dealerCard3.setOpaque(true);
        dealerCard3.setVisible(true);
        dealerCard3.setToolTipText("Dealer's cards");
        //creating a label and setting the componants
        dealerCard4.setPreferredSize(cardSize);
        dealerCard4.setMinimumSize(cardSize);
        dealerCard4.setMaximumSize(cardSize);
        dealerCard4.setAlignmentY(CENTER_ALIGNMENT);
        dealerCard4.setBackground(Color.WHITE);
        dealerCard4.setOpaque(true);
        dealerCard4.setVisible(true);
        dealerCard4.setToolTipText("Dealer's cards");
        //creating a label and setting the componants
        dealerCard5.setPreferredSize(cardSize);
        dealerCard5.setMinimumSize(cardSize);
        dealerCard5.setMaximumSize(cardSize);
        dealerCard5.setAlignmentY(CENTER_ALIGNMENT);
        dealerCard5.setBackground(Color.WHITE);
        dealerCard5.setOpaque(true);
        dealerCard5.setVisible(true);
        dealerCard5.setToolTipText("Dealer's cards");
        //creating a button and setting the componants
        down.setBounds(400, 400, 600, 600);
        down.setLocation(100, 500);
        down.addActionListener(this);
        down.setAlignmentX(CENTER_ALIGNMENT);
        down.setText("-");
        down.setBackground(Color.WHITE);
        down.setOpaque(true);
        down.setVisible(true);
        //creating a button and setting the componants
        up.setBounds(400, 400, 600, 600);
        up.setLocation(100, 500);
        up.addActionListener(this);
        up.setAlignmentX(CENTER_ALIGNMENT);
        up.setText("+");
        up.setBackground(Color.WHITE);
        up.setOpaque(true);
        up.setVisible(true);
        //creating a button and setting the componants
        bet.setBounds(400, 400, 600, 600);
        bet.setLocation(100, 500);
        bet.addActionListener(this);
        bet.setText("Bet");
        bet.setBackground(Color.WHITE);
        bet.setOpaque(true);
        bet.setVisible(true);
        //creating a button and setting the componants
        ok.addActionListener(this);
        ok.setText("OK");
        ok.setBackground(Color.WHITE);
        ok.setAlignmentY(CENTER_ALIGNMENT);
        ok.setOpaque(true);
        ok.setVisible(true);
        ok.setEnabled(false);
        //creating a label and setting the componants
        resultsC.setSize(100, 100);
        resultsC.setAlignmentX(CENTER_ALIGNMENT);
        resultsC.setAlignmentY(CENTER_ALIGNMENT);
        resultsC.setBackground(Color.WHITE);
        resultsC.setOpaque(true);
        resultsC.setVisible(true);
        //creating a pannel and setting the componants
        pan2.setMaximumSize(f);
        pan2.setMinimumSize(f);
        pan2.setPreferredSize(f);
        pan2.setLayout(new BoxLayout(pan2, BoxLayout.Y_AXIS));
        pan2.add(Box.createVerticalStrut(5));
        pan2.add(moneyBet);
        pan2.add(Box.createVerticalStrut(10));
        pan2.add(up);
        pan2.add(Box.createVerticalStrut(5));
        pan2.add(down);
        pan2.add(Box.createVerticalStrut(10));
        pan2.add(money);
        pan2.setBackground(new Color(0, 225, 0));
        //creating a pannel and setting the componants
        pan3.setBackground(new Color(0, 100, 0));
        pan3.setLayout(new BoxLayout(pan3, BoxLayout.Y_AXIS));
        pan3.add(dealerCard1);
        pan3.add(Box.createVerticalStrut(10));
        pan3.add(card1);
        pan3.add(Box.createVerticalStrut(37));
        //creating a pannel and setting the componants
        pan4.setBackground(new Color(0, 100, 0));
        pan4.setLayout(new BoxLayout(pan4, BoxLayout.Y_AXIS));
        pan4.add(dealerCard2);
        pan4.add(Box.createVerticalStrut(10));
        pan4.add(card2);
        pan4.add(Box.createVerticalStrut(37));
        //creating a pannel and setting the componants
        pan5.setBackground(new Color(0, 100, 0));
        pan5.setLayout(new BoxLayout(pan5, BoxLayout.Y_AXIS));
        pan5.add(dealerCard3);
        pan5.add(Box.createVerticalStrut(10));
        pan5.add(card3);
        pan5.add(Box.createVerticalStrut(10));
        pan5.add(ok);
        //creating a pannel and setting the componants
        pan6.setBackground(new Color(0, 100, 0));
        pan6.setLayout(new BoxLayout(pan6, BoxLayout.Y_AXIS));
        pan6.add(dealerCard4);
        pan6.add(Box.createVerticalStrut(10));
        pan6.add(card4);
        pan6.add(Box.createVerticalStrut(37));
        //creating a pannel and setting the componants
        pan7.setBackground(new Color(0, 100, 0));
        pan7.setLayout(new BoxLayout(pan7, BoxLayout.Y_AXIS));
        pan7.add(dealerCard5);
        pan7.add(Box.createVerticalStrut(10));
        pan7.add(card5);
        pan7.add(Box.createVerticalStrut(11));
        pan7.add(quit);
        //pan.add(new JLabel(new ImageIcon("src/finalproject/KingSpades.jpg")));
        //creating a pannel and setting the componants
        pan.setBackground(new Color(0, 100, 0));
        pan.setLayout(new BoxLayout(pan, BoxLayout.X_AXIS));
        pan.add(Box.createHorizontalStrut(10));
        pan.add(pan2);
        pan.add(Box.createHorizontalStrut(10));
        pan.add(bet);
        pan.add(Box.createHorizontalStrut(10));
        pan.add(pan3);
        pan.add(pan4);
        pan.add(pan5);
        pan.add(pan6);
        pan.add(pan7);
        //creating a pannel and setting the componants
        abc.setBackground(Color.WHITE);
        abc.add(resultsC);
        abc.setAlignmentX(CENTER_ALIGNMENT);
        abc.setAlignmentY(CENTER_ALIGNMENT);
        //creating a jframe and setting the componants
        window.add(pan);
        window.setTitle("Poker");
        window.setSize(850, 500);
        window.getContentPane().setBackground(Color.DARK_GRAY);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        //creating a jframe and setting the componants
        results.add(abc);
        results.setTitle("Poker");
        results.setSize(200, 150);
        results.getContentPane().setBackground(Color.WHITE);
        results.setVisible(false);
        results.setLocationRelativeTo(null);
        results.setResizable(false);

    }

    public static void main(String[] args) {

        new FinalProject(); // creating a new method to put the gui

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getSource() == up) {          //if up is clished this will run

            if (coinsOwned > 0) {

                coinsOwned--;           //increases the player bet by 1 and sets the labels
                coinsBet++;
                money.setText(df.format(coinsOwned));
                moneyBet.setText(df.format(coinsBet));

            }

        } else if (e.getSource() == down) {          //if down is clished this will run

            if (coinsBet > 0) {

                coinsOwned++;            //decreases the player bet by 1 and sets the labels
                coinsBet--;
                money.setText(df.format(coinsOwned));
                moneyBet.setText(df.format(coinsBet));

            }

        } else if (e.getSource() == bet) {          //if bet is clished this will run

            count++;

            ok.setEnabled(true);        //enables a button

            dealerCard1.setIcon(cardBack);      //sets the dealers cards to cardback
            dealerCard2.setIcon(cardBack);
            dealerCard3.setIcon(cardBack);
            dealerCard4.setIcon(cardBack);
            dealerCard5.setIcon(cardBack);

            buttonEnabled5 = true;          //sets the boolean to till if the card buttons are enables
            buttonEnabled4 = true;
            buttonEnabled3 = true;
            buttonEnabled2 = true;
            buttonEnabled1 = true;

            card1.setEnabled(true);             //sets the player card buttons to true
            card2.setEnabled(true);
            card3.setEnabled(true);
            card4.setEnabled(true);
            card5.setEnabled(true);

            for (int a = 0; a < 15; a++) {      // for loup to generate all cards

                cardNumbers[a] = (int) (Math.random() * 13 + 2);        //generates a random number and a random suit then puts them together
                cardSuits[a] = suit[(int) (Math.random() * 3 + 0)];
                cards[a] = "" + cardSuits[a] + cardNumbers[a];
            }

            reroll();   // calls the reroll method

            card1.setIcon(setCards(cards[0]));  //calls the set cards method to set the icons of all the cards
            card2.setIcon(setCards(cards[1]));
            card3.setIcon(setCards(cards[2]));
            card4.setIcon(setCards(cards[3]));
            card5.setIcon(setCards(cards[4]));

            bet.setEnabled(false);      //dissables buttons
            down.setEnabled(false);
            up.setEnabled(false);

        } else if (e.getSource() == card1) {          //if card1 is clished this will run

            if (buttonEnabled1) {

                card1.setIcon(cardBack);    //sets the card the player wishes to switch out to cardback
                isCardBack1 = true;

            }

        } else if (e.getSource() == card2) {          //if card2 is clished this will run

            if (buttonEnabled2) {

                card2.setIcon(cardBack);    //sets the card the player wishes to switch out to cardback
                isCardBack2 = true;

            }

        } else if (e.getSource() == card3) {          //if card3 is clished this will run

            if (buttonEnabled4) {

                card3.setIcon(cardBack);    //sets the card the player wishes to switch out to cardback
                isCardBack3 = true;

            }

        } else if (e.getSource() == card4) {          //if card4 is clished this will run

            if (buttonEnabled3) {

                card4.setIcon(cardBack);    //sets the card the player wishes to switch out to cardback
                isCardBack4 = true;

            }

        } else if (e.getSource() == card5) {          //if card5 is clished this will run

            if (buttonEnabled5) {

                card5.setIcon(cardBack);    //sets the card the player wishes to switch out to cardback
                isCardBack5 = true;

            }

        } else if (e.getSource() == quit) {          //if quit is clished this will run

            String temp = null;     //creates a temporary string

        } else if (e.getSource() == ok) {          //if ok is clished this will run

            ok.setEnabled(false);           //dissables a button

            buttonEnabled5 = false;         //sets the variable to dissable the buttons 
            buttonEnabled4 = false;
            buttonEnabled3 = false;
            buttonEnabled2 = false;
            buttonEnabled1 = false;

            if (isCardBack1) {      //runs if the player wants to get rid of their first card

                cardNumbers[0] = cardNumbers[10];       //sets the card to its new value
                cardSuits[0] = cardSuits[10];
                cards[0] = cards[10];
                isCardBack1 = false;

            }
            if (isCardBack2) {      //runs if the player wants to get rid of their second card

                cardNumbers[1] = cardNumbers[11];       //sets the card to its new value
                cardSuits[1] = cardSuits[11];
                cards[1] = cards[11];
                isCardBack2 = false;

            }
            if (isCardBack3) {      //runs if the player wants to get rid of their third card

                cardNumbers[2] = cardNumbers[12];       //sets the card to its new value
                cardSuits[2] = cardSuits[12];
                cards[2] = cards[12];
                isCardBack3 = false;

            }
            if (isCardBack4) {      //runs if the player wants to get rid of their fourth card

                cardNumbers[3] = cardNumbers[13];       //sets the card to its new value
                cardSuits[3] = cardSuits[13];
                cards[3] = cards[13];
                isCardBack4 = false;

            }
            if (isCardBack5) {      //runs if the player wants to get rid of their fifth card

                cardNumbers[4] = cardNumbers[14];       //sets the card to its new value
                cardSuits[4] = cardSuits[14];
                cards[4] = cards[14];
                isCardBack5 = false;
            }

            pairs();        //calls all the methods to determine who wins
            straights();
            dealerPairs();
            dealerStraights();

            card1.setIcon(setCards(cards[0]));      //sets the icons of the new cards by calling the set cards method
            card2.setIcon(setCards(cards[1]));
            card3.setIcon(setCards(cards[2]));
            card4.setIcon(setCards(cards[3]));
            card5.setIcon(setCards(cards[4]));

            dealerCard1.setIcon(setCards(cards[5]));        //shows the dealers cards by useing the set cards method
            dealerCard2.setIcon(setCards(cards[6]));
            dealerCard3.setIcon(setCards(cards[7]));
            dealerCard4.setIcon(setCards(cards[8]));
            dealerCard5.setIcon(setCards(cards[9]));

            winner();           //calls the winner method
        }
    }

    public static ImageIcon setCards(String z) {
        
        switch (z) {        //switch statement do take the valus fo a string and return an image icon

            case "c14":
                return (c14);

            case "c2":
                return (c2);

            case "c3":
                return (c3);

            case "c4":
                return (c4);

            case "c5":
                return (c5);

            case "c6":
                return (c6);

            case "c7":
                return (c7);

            case "c8":
                return (c8);

            case "c9":
                return (c9);

            case "c10":
                return (c10);

            case "c11":
                return (c11);

            case "c12":
                return (c12);

            case "c13":
                return (c13);

            case "d14":
                return (d14);

            case "d2":
                return (d2);

            case "d3":
                return (d3);

            case "d4":
                return (d4);

            case "d5":
                return (d5);

            case "d6":
                return (d6);

            case "d7":
                return (d7);

            case "d8":
                return (d8);

            case "d9":
                return (d9);

            case "d10":
                return (d10);

            case "d11":
                return (d11);

            case "d12":
                return (d12);

            case "d13":
                return (d13);

            case "h14":
                return (h14);

            case "h2":
                return (h2);

            case "h3":
                return (h3);

            case "h4":
                return (h4);

            case "h5":
                return (h5);

            case "h6":
                return (h6);

            case "h7":
                return (h7);

            case "h8":
                return (h8);

            case "h9":
                return (h9);

            case "h10":
                return (h10);

            case "h11":
                return (h11);

            case "h12":
                return (h12);

            case "h13":
                return (h13);

            case "s14":
                return (s14);

            case "s2":
                return (s2);

            case "s3":
                return (s3);

            case "s4":
                return (s4);

            case "s5":
                return (s5);

            case "s6":
                return (s6);

            case "s7":
                return (s7);

            case "s8":
                return (s8);

            case "s9":
                return (s9);

            case "s10":
                return (s10);

            case "s11":
                return (s11);

            case "s12":
                return (s12);

            case "s13":
                return (s13);
            default:
                return cardBack;
        }
    }

    public static void pairs() {

        int tempCheck = 0;      //creates a temperary value
        playerHighCard = 0;     //resets variables
        playerHighCardSuit = ' '; 
        
        for (int a = 0; a < 5; a++) {               //nested for loups to compair all of the players cards
            for (int b = a + 1; b < 5; b++) {

                if ((cardNumbers[a] == cardNumbers[b])) {       //if there are a pair of matching cards the temp variable goes up

                    tempCheck++;

                    if (playerHighCard < cardNumbers[a]) {      //sets the new high card if there is one

                        playerHighCard = cardNumbers[a];
                        playerHighCardSuit = cardSuits[a];

                    }
                }
            }
        }

        switch (tempCheck) { //switch to determin if the player has a same card hand
            
            case 6:     //runs if the player has a four of a kind
                System.out.println("it's a four of a kind");
                playerScore = 7;
                break;
            case 1:     //runs if the player has a pair
                System.out.println("It's a pair");
                playerScore = 1;
                break;
            case 2:     //runs if the player has a 2 pair
                System.out.println("It's 2 pair");
                playerScore = 2;
                break;
            case 3:     //runs if the player has a three of a kind
                System.out.println("It's a three if a kind");
                playerScore = 3;
                break;
            case 4:     //runs if the player has a full house
                System.out.println("its a full house");
                playerScore = 6;
                break;
            default:
                break;
        }
        tempCheck = 0;
    }

    public static void straights() {

        int isStraight = 0;
        int isFlush = 0;

        for (int a = 0; a < 5; a++) {       //nested for loops that see if the cards are in order
            for (int b = 0; b < 5; b++) {

                if ((cardNumbers[a] == cardNumbers[b] + 1)) {

                    isStraight++;

                }
            }
        }
        for (int a = 0; a < 5; a++) {           //nested for loops that check if all the cards are the same suit
            for (int b = 0; b < 5; b++) {

                if (cardSuits[a] == cardSuits[b]) {

                    isFlush++;

                }
            }
        }
        if (isStraight == 4) {      //runs if the player has a streight

            if (playerScore == 0) {

                if (isFlush == 25) {    //runs if the player has cards of the same suit

                    if (cards[0].length() == 3 && cards[1].length() == 3 && cards[2].length() == 3 && cards[3].length() == 3 && cards[4].length() == 3) {           //runs if the player has a royal flush

                        System.out.println("It's a royal flush");
                        playerScore = 9;

                    } else {        //runs if the player has a streight flush

                        System.out.println("it's a straight flush");
                        playerScore = 8;

                    }

                } else {        //runs if the player has a streight

                    System.out.println("it's a straight");
                    playerScore = 4;

                }
            }
        } else if (isFlush == 25) {     //runs if the player has a flush

            System.out.println("it's a flush");
            playerScore = 5;

        }

        isStraight = 0;

    }

    public static void dealerPairs() {  //everything is same as pairs but for the dealer

        int tempCheck = 0;
        dealerHighCard = 0;
        dealerHighCardSuit = ' ';

        for (int a = 5; a < 10; a++) {
            for (int b = a + 1; b < 10; b++) {

                if ((cardNumbers[a] == cardNumbers[b])) {

                    tempCheck++;

                    if (dealerHighCard < cardNumbers[a]) {

                        dealerHighCard = cardNumbers[a];
                        dealerHighCardSuit = cardSuits[a];

                    }
                }
            }
        }
        if (tempCheck == 6) {

            System.out.println("The dealer has a four of a kind");
            dealerScore = 7;

        } else if (tempCheck == 1) {

            System.out.println("The dealer has a pair");
            dealerScore = 1;

        } else if (tempCheck == 2) {

            System.out.println("The dealer has 2 pair");
            dealerScore = 2;

        } else if (tempCheck == 3) {

            System.out.println("The dealer has a three if a kind");
            dealerScore = 3;

        } else if (tempCheck == 4) {

            System.out.println("The dealer has a full house");
            dealerScore = 6;

        }
        tempCheck = 0;
    }

    public static void dealerStraights() {  //everything same as streights but for the dealer

        int isStaight = 0;
        int isFlush = 0;

        for (int a = 5; a < 10; a++) {
            for (int b = 5; b < 10; b++) {

                if ((cardNumbers[a] == cardNumbers[b] + 1)) {

                    isStaight++;

                }
            }
        }
        for (int a = 5; a < 10; a++) {
            for (int b = 5; b < 10; b++) {

                if (cardSuits[a] == cardSuits[b]) {

                    isFlush++;

                }
            }
        }
        if (isStaight == 4) {

            if (dealerScore == 0) {

                if (isFlush == 25) {

                    if (cards[5].length() == 3 && cards[6].length() == 3 && cards[7].length() == 3 && cards[8].length() == 3 && cards[9].length() == 3) {

                        System.out.println("The dealer has a royal flush");
                        dealerScore = 9;

                    } else {

                        System.out.println("The dealer has a straight flush");
                        dealerScore = 8;

                    }

                } else {

                    System.out.println("The dealer has a straight");
                    dealerScore = 4;

                }
            }

        } else if (isFlush == 25) {

            System.out.println(" The dealer has a flush");
            dealerScore = 5;

        }

        isStaight = 0;

    }

    public static void reroll() {

        while (cardCheck) {          //runs while are cards are not confirmed to be different

            cardCheck = false;

            for (int a = 0; a < 15; a++) {      //nested for loops to compare all the cards

                for (int b = 0; b < 15; b++) {

                    if (b != a) {

                        if (cards[a].equals(cards[b])) {        //if the cards are the same this runs

                            if (!cards[a].equals("")) {

                                cardNumbers[a] = (int) (Math.random() * 13 + 2);        //generates a new card to replace the coppy
                                cardSuits[a] = suit[(int) (Math.random() * 3 + 0)];
                                cards[a] = "" + cardSuits[a] + cardNumbers[a];
                                cardCheck = true;

                            }
                        }
                    }
                }
            }
        }
        cardCheck = true;
    }

    public static void winner() {

        if (playerScore > dealerScore) {        //runs if the player wins

            coinsOwned += (coinsBet) + (int) (coinsBet / 2);    //gives the player their bet back plus 1/2 of it amd showes that they won
            coinsBet = 0;
            money.setText(df.format(coinsOwned));
            moneyBet.setText(df.format(coinsBet));
            System.out.println("player Wins");
            resultsC.setText("you win");

        } else if (playerScore < dealerScore) { // runs if the player looses

            coinsBet = 0;                               //the player looses their bet
            money.setText(df.format(coinsOwned));
            moneyBet.setText(df.format(coinsBet));
            System.out.println("dealer Wins");
            resultsC.setText("you lose");

        } else {        //if the player and dealer have the same type of hand this runs

            if (playerScore == 0 || playerScore == 4 || playerScore == 6 || playerScore == 8) {     //if the player and dealer have a streight or nothing this runs

                dealerHighCard = 0;
                playerHighCard = 0;
                dealerHighCardSuit = ' ';
                playerHighCardSuit = ' ';

                for (int s = 0; s < 10; s++) {      //this for loup finds the high card for te dealer and player and the suit of the card

                    if (s < 5) {

                        if (cardNumbers[s] > playerHighCard) {

                            playerHighCard = cardNumbers[s];
                            playerHighCardSuit = cardSuits[s];

                        }

                    } else {

                        if (cardNumbers[s] > dealerHighCard) {

                            dealerHighCard = cardNumbers[s];
                            dealerHighCardSuit = cardSuits[s];

                        }
                    }
                }
            }

            if (playerHighCard > dealerHighCard) {  // runs if the player has the highest card

                coinsOwned += (coinsBet) + (int) (coinsBet / 2);
                coinsBet = 0;
                money.setText(df.format(coinsOwned));
                moneyBet.setText(df.format(coinsBet));
                System.out.println("player Wins");
                resultsC.setText("you win");

            } else if (dealerHighCard > playerHighCard) {   //runs if the player has a lower high card then the dealer

                coinsBet = 0;
                money.setText(df.format(coinsOwned));
                moneyBet.setText(df.format(coinsBet));
                System.out.println("dealer Wins");
                resultsC.setText("you lose");

            } else {        //incase the player and dealer have the same high card this runs

                int playerSuitScore = 0;
                int dealerSuitScore = 0;

                switch (playerHighCardSuit) {   //switch to give a value to the players high card

                    case 's':
                        playerSuitScore = 4;
                        break;
                    case 'h':
                        playerSuitScore = 3;
                        break;
                    case 'd':
                        playerSuitScore = 2;
                        break;
                    case 'c':
                        playerSuitScore = 1;
                        break;

                }
                switch (dealerHighCardSuit) {       //switch to give a value to the dealers high card

                    case 's':
                        dealerSuitScore = 4;
                        break;
                    case 'h':
                        dealerSuitScore = 3;
                        break;
                    case 'd':
                        dealerSuitScore = 2;
                        break;
                    case 'c':
                        dealerSuitScore = 1;
                        break;

                }
                if (playerSuitScore > dealerSuitScore) {        //runs if the player has a better suit

                    coinsOwned += (coinsBet) + (int) (coinsBet / 2);
                    coinsBet = 0;
                    money.setText(df.format(coinsOwned));
                    moneyBet.setText(df.format(coinsBet));
                    System.out.println("player Wins");
                    resultsC.setText("you win");

                } else {            //runs if the dealer has a better suit

                    coinsBet = 0;
                    money.setText(df.format(coinsOwned));
                    moneyBet.setText(df.format(coinsBet));
                    System.out.println("dealer Wins");
                    resultsC.setText("you lose");
                }
            }
        }

        ok.setEnabled(false);           //resets all the buttons for a new round and opens the window showig if the player won
        bet.setEnabled(true);
        up.setEnabled(true);
        down.setEnabled(true);
        dealerScore = 0;
        playerScore = 0;
        results.setVisible(true);
        results.show();
    }

}
