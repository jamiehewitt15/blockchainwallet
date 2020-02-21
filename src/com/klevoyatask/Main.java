package com.klevoyatask;

public class Main {

    public static void main(String[] args) {

        Token bitcoin = new Token( "Bitcoin", 15, 4);
        Token ethereum = new Token( "Ethereum",10, 3);
        Token zCash = new Token("ZCash",5,3);
        Token ripple = new Token("Ripple",3,1);

        Wallet mainWallet = new Wallet(8);

        int menuSelect;
        Token[] menuOptions = new Token[4];
        menuOptions[0] = bitcoin;
        menuOptions[1] = ethereum;
        menuOptions[2] = zCash;
        menuOptions[3] = ripple;

        do {
            System.out.println("\n\nChoose which coin you would like to add to your wallet:\n(Enter 0 to exit)");
            int optionCount = 1;
            for (Token i : menuOptions) { // Looping through menuOptions array to show the menu
                System.out.println(optionCount +" : "+i.getName()); // Print menu options.
                optionCount++;
            }

            menuSelect = DataValidator.dataInputValidation(0, menuOptions.length); // Test for valid user input and save input
            if(menuSelect == 0){break;}
            if(menuSelect == 1000){continue;}
            mainWallet.addToken(menuOptions[menuSelect - 1]);
            menuSelect+=1;
        } while( menuSelect > 0 );
    }
}
