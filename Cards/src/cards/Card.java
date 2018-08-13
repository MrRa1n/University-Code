package cards;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.imageio.ImageIO;

public class Card {

	int value;
	String suit;
	BufferedImage image;
	static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	static String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
			"Queen", "King" };
	
	public Card (String suit, String rank){
		this.suit = suit;
		if(!Arrays.asList(suits).contains(this.suit)) {
			System.out.println("Invalid Suit " + suit);
			System.exit(-1);
		}
		int index = Arrays.asList(ranks).indexOf(rank);
		if(index >= 0 && index < 10) {
			value = index + 1;
		}else if(index < 13){
			value = 10;
		}else {
			System.out.println("Invalid rank " + rank);
			System.exit(-1);
		}
		String filename = "./Images/";
		if(value == 1) {
			filename += "ace"; 
		}else if(value == 10) {
			if(rank.equals("Ten") ) {
				filename += "10";
			}else {
				filename += rank.toLowerCase();
			}
		}else {
			filename += value;
		}
		filename += "_of_" + suit.toLowerCase() + ".png";
		
		try {
			image = ImageIO.read(new File(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void draw(Graphics2D g) {
		g.drawImage(image, 0, 0, 250, 363, null);
	}

	public static ArrayList<Card> getShuffledDeck() {
		ArrayList<Card> cards = new ArrayList<>();		
		for(String suit : suits) {
			for(String rank : ranks) {
				Card card = new Card(suit, rank);
				cards.add(card);
			}
		}
		Collections.shuffle(cards);
		
		return cards;
	}
}
