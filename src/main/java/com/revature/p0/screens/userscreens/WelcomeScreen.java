package com.revature.p0.screens.userscreens;

import com.revature.p0.screens.Screen;
import com.revature.p0.util.ScreenRouter;
import java.io.BufferedReader;
import static com.revature.p0.util.AppState.shutdown;

public class WelcomeScreen extends Screen {

    public WelcomeScreen(BufferedReader consoleReader, ScreenRouter router) { super("WelcomeScreen", "/welcome", consoleReader, router); }

    @Override
    public void render() throws Exception {

        String menu = "\nWelcome to p0 Registration Application!\n" +
                "1) Login\n" +
                "2) Register\n" +
                "3) Exit application\n" +
                "> ";

        System.out.print(menu);

        String userSelection = consoleReader.readLine();

        switch (userSelection) {

            case "1":
                router.navigate("/login");
                break;
            case "2":
                router.navigate("/register");
                break;
            case "3":
                System.out.println("Exiting application...");
                shutdown();
                break;
            default:
                System.out.println("You provided an invalid value, please try again.");

        }

    }

}
