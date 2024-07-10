#Raghul

#10/7/2024



Feature: Login page automation of saucedemo application

Scenario: Check login is successful with valid credentials



    Given User is on login page

    When User enters valid "<username>" and "<password>"

    And clicks on login button

    And yet another action

    Then user is navigated to the home page

    And Close the browser





    Examples: 

      | username  | password |

      | standard_user | secret_sauce |

      | locked_out_user | secret_sauce |

      | problem_user | secret_sauce |

      | performance_glitch_user | secret_sauce |