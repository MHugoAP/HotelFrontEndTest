Feature: Hotel Search
  As AQ Automation
  I want to find a hotel
  To stay in that hotel

  Scenario Outline: Hotel Search in home
    Given Go to the official website of the hotel
    When we fill in the data required to search for the hotel
      | location   | checkIn   | checkOut   |
      | <location> | <checkIn> | <checkOut> |
    Then we click on the search button to return the result

    Examples:
      | location | checkIn    | checkOut  |
      | Nassau   | 10/28/2022 | 11/4/2022 |
      | London   | 9/30/2022  | 10/2/2022 |