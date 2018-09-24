Feature: Train ticket booking
Scenario: user can select free seat

Given I open booking page
When select departure from Kharkiv
And select destination to Kyiv
And select day after tomorrow
And submit search
And select train by 723 train number
And select free seat
Then price ticket appear
And price equals 469,49
