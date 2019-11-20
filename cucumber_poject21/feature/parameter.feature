Feature: Login Action
Scenario Outline: Successfull Login with valid credentials
Given User opns the application
When user click on to login link
And user enters "<username>" and "<password>"
Then Message displayed login successfully


Examples:
|username| password|
|aravind.guggila57@gmail.com| aravind|
|aishwaryamusale123@gmail.com| Aish12|