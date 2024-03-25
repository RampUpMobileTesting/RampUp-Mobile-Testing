Feature: Echo Box

  Scenario: write something and save
    Given User wants to write a new message
    When he sends his message
    Then he should see the message on the screen