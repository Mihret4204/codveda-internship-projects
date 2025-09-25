package Level1.Number;
// A simple number guessing game with a GUI using Java Swing.


import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;

public class NumberGUI extends JFrame {
    private JTextField guessField;
    private JLabel feedbackLabel;
    private JLabel attemptsLabel;
    private JButton submitButton;
    private JButton resetButton;

    private int targetNumber;
    private int attempts;

    public NumberGUI() {
        setTitle("Number Guessing Game");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel instructionLabel = new JLabel("Guess a number between 0 and 99:");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        add(instructionLabel, gbc);

        guessField = new JTextField(10);
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1;
        add(guessField, gbc);

        submitButton = new JButton("Submit Guess");
        gbc.gridx = 1; gbc.gridy = 1;
        add(submitButton, gbc);

        feedbackLabel = new JLabel(" ");
        feedbackLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        add(feedbackLabel, gbc);

        attemptsLabel = new JLabel("Attempts: 0");
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(attemptsLabel, gbc);

        resetButton = new JButton("Play Again");
        resetButton.setVisible(false);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        add(resetButton, gbc);

        submitButton.addActionListener(e -> checkGuess());
        resetButton.addActionListener(e -> resetGame());

        startNewGame();
        setVisible(true);
    }

    private void startNewGame() {
        SecureRandom random = new SecureRandom();
        targetNumber = random.nextInt(100); // 0–99
        attempts = 0;
        feedbackLabel.setText(" ");
        attemptsLabel.setText("Attempts: 0");
        guessField.setText("");
        resetButton.setVisible(false);
        submitButton.setEnabled(true);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            attempts++;
            attemptsLabel.setText("Attempts: " + attempts);

            if (guess < targetNumber) {
                feedbackLabel.setText("Too low! Try again.");
            } else if (guess > targetNumber) {
                feedbackLabel.setText("Too high! Try again.");
            } else {
                feedbackLabel.setText("🎉 Correct! You guessed it in " + attempts + " attempts.");
                submitButton.setEnabled(false);
                resetButton.setVisible(true);
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("❌ Invalid input. Please enter a number.");
        }
    }

    private void resetGame() {
        startNewGame();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NumberGUI::new);
    }
}

