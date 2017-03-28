# _Office Admin_

#### _Hackathon 2.0, 03-24-2017_

#### By Ryan Jones && Keith Stedman

## Description
_Office Admin is an application for organizing doctors and patient information._


## Specifications

| Behavior                   | Input Example     | Output Example    |
| -------------------------- | -----------------:| -----------------:|
| Routing takes user from page to page | 'Create Team' button is clicked | User redirected to the team-form page, url changes accordingly |
| When the team form is submitted, a team instance is created | Team form submitted | New team created with matching fields |
| When the member form is submitted, a member instance is created | Member form submitted | New member created with matching fields |
| Member instances are added to correct team | Member is created from the member form | New member belongs to a specific team |
| Teams are able to be listed out | Viewing all teams | Each team shows with the corresponding team name |
| Members are able to be listed out under specific team | Viewing specific team | All members are shown belonging to that team |

## Setup/Installation Requirements
(Assuming you have gradle and Java installed on your machine)
* _Clone the repository_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_


### License

Copyright (c) 2017 **_Ryan Jones && Keith Stedman_**

This software is licensed under the MIT license.
