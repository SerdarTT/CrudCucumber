
@CRUD @regression
Feature: Login feature
  @validLogin @smoke
  Scenario: User is able to login using valid credentials
    When I click to signIn button
    When I enter steterbasgit@gmail.com in email
    And I enter Ilyas532? in passowrd
    And I click on Sign in button
    Then I verify I am on Homepage
  @invalidLogin @sanity @smoke
  Scenario: User is not able to login
    When I click to signIn button
    When I enter invalid in email
    And I enter Ilyas532? in passowrd
    And I click on Sign in button
    Then I verify I get error message

    @create
    Scenario: User can create an article
      When I click to signIn button
      When I enter steterbasgit@gmail.com in email
      And I enter Ilyas532? in passowrd
      And I click on Sign in button
      And I click on new post
      And I enter Breaking News in title box
      And I enter Trump in about article
      And I enter Trump is national threat in article box
      And I enter Politic in tag box
      Then I click to publish article
      @Read
      Scenario: User can read an article
        When I click to signIn button
        When I enter steterbasgit@gmail.com in email
        And I enter Ilyas532? in passowrd
        And I click on Sign in button
        And I click on profile
        And I click on title
        And I click on edit button
        And I clean about box
        And I enter descent article in about article
        Then I click to publish article

        @Update
        Scenario: USer can update article
          When I click to signIn button
          When I enter steterbasgit@gmail.com in email
          And I enter Ilyas532? in passowrd
          And I click on Sign in button
          And I click on profile
          And I click on title
          And I click on edit button
          And I clean title box
          And I enter Democrats in new Title box
          And I clean about box
          And I enter Dr Jill in about article
          And I clean article box
          And I enter Joe Biden loves first Lady Jill in article box
          And I clean tag box
          And I enter Dr in tag box
          Then I click to publish article

          @Delete
          Scenario: User can delete article
            When I click to signIn button
            When I enter steterbasgit@gmail.com in email
            And I enter Ilyas532? in passowrd
            And I click on Sign in button
            And I click on profile
            And I click on title
            Then I click to delete article