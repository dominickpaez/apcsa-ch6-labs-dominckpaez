package CardGame;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // put Card objects in random order

        Card[] player = new Card[7];
        Card[] dealer = new Card[7];
        int dealerCards = 1;

        int playerTotal = 0;
        int dealerTotal = 0;

        player[0] = myDeckOfCards.dealCard();
        playerTotal += player[0].getValue();



        player[1] = myDeckOfCards.dealCard();
        playerTotal += player[1].getValue();

        System.out.println("Your: " + player[0] + " " + player[1] + " Total: " + playerTotal);

        if(player[0].getFace().equals("Ace")){
            System.out.println("Would you like your ace to be a 11 or a 1? ");
            playerTotal += scan.nextInt();
            scan.nextLine();
        }
        if(player[1].getFace().equals("Ace")){
            System.out.println("Would you like your ace to be a 11 or a 1? ");
            playerTotal += scan.nextInt();
            scan.nextLine();
        }

        dealer[0] = myDeckOfCards.dealCard();
        dealerTotal += dealer[0].getValue();
        if(dealer[0].getFace().equals("Ace")){
            dealerTotal += 11;
        }
        dealer[1] = myDeckOfCards.dealCard();
        dealerTotal += dealer[1].getValue();
        if(dealer[1].getFace().equals("Ace")){
            dealerTotal += 11;
        }
        System.out.println("Deal: " + dealer[0] + " |?|" + " Total: " + dealer[0].getValue());

        for (int i = 2; i < 7; i++) {
            System.out.println("Hit or Stand");
            if (scan.nextLine().equalsIgnoreCase("Hit")) {
                player[i] = myDeckOfCards.dealCard();
                playerTotal += player[i].getValue();
                if(player[i].getFace().equals("Ace")){
                    System.out.println("Would you like your ace to be a 11 or a 1? ");
                    playerTotal += scan.nextInt();
                    scan.nextLine();
                }
                System.out.println("Your: " + myDeckOfCards.Hand(player,i) + "Total: " + playerTotal);
                System.out.println("Deal: " + dealer[0] + " |?|"  + "Total: " + dealer[0].getValue());
                if (playerTotal > 21) {
                    System.out.println("Bust");
                    break;
                }
            } else {
                i--;
                if (dealerTotal < 17) {
                    while (dealerTotal < 17) {
                        dealerCards++;
                        dealer[dealerCards] = myDeckOfCards.dealCard();
                        dealerTotal += dealer[dealerCards].getValue();
                        if (dealer[dealerCards].getFace().equals("Ace")) {
                            if (dealerTotal > 11) {
                                dealerTotal += 1;
                            } else {
                                dealerTotal += 11;
                            }
                        }
                        System.out.println("Your: " + myDeckOfCards.Hand(player, i) + "Total: " + playerTotal);
                        System.out.println("Deal: " + myDeckOfCards.Hand(dealer, dealerCards) + "Total: " + dealerTotal);
                        System.out.println();
                        if (dealerTotal > playerTotal && dealerTotal < 21) {
                            System.out.println("You lost play again.");
                            break;
                        } else if (dealerTotal > 21) {
                            System.out.println("You won!");
                            break;
                        }
                    }
                } else {
                    System.out.println("Your: " + myDeckOfCards.Hand(player, i) + "Total: " + playerTotal);
                    System.out.println("Deal: " + myDeckOfCards.Hand(dealer, dealerCards) + "Total: " + dealerTotal);
                    if (dealerTotal < playerTotal && playerTotal <= 21) {
                        System.out.println("You won!");
                        break;
                    } else {
                        System.out.println("You lost play again.");
                        break;
                    }
                }


            }
            if(dealerTotal == 21){
            System.out.println("Dealer Blackjack!");
            break;
            }
            if(playerTotal == 21){
                System.out.println("You got Blackjack!");
                break;
            }
            if(playerTotal == dealerTotal){
                System.out.println("PUSH!");
                break;
            }

        }
    }
}
