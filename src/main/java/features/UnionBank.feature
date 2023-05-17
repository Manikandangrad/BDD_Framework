Feature: To validate EMI calculator
  @Smoke
  Scenario: To validate the EMI calculator
    Given Launch the Application
    Then Enter the Amount as "10000",Rate as "10" and Tenure as "130"
    And Click on Calculate Button
    And Verify the EMI is "333"
    Then Close the Application
  @Regression
    Scenario Outline:To validate the EMI calculator
      Given Launch the Application
      Then Enter the Amount as "<Amount>",Rate as "<Rate>" and Tenure as "<Tenure>"
      And Click on Calculate Button
      And Verify the EMI is "<Expected_EMI>"
      Then Close the Application
      Examples:
        |Amount|Rate|Tenure|Expected_EMI|
        |20000 |10  |110   |278.41      |
        |30000 |11  |120   |334         |
        |40000 |12  |130   |444         |
        |80000 |11  |180   |909.28      |