I was attempting this machine coding question 
https://workat.tech/machine-coding/practice/trello-problem-t0nwwqt61buz -> its like making JIRA 


Question : 

1. We should be able to create/delete boards, add/remove people from the members list and modify attributes. Deleting a board should delete all lists inside it.
2. We should be able to create/delete lists and modify attributes. Deleting a list should delete all cards inside it.
3. We should be able to create/delete cards, assign/unassign a member to the card and modify attributes
5. We should also be able to move cards across lists in the same board
6. Ability to show all boards, a single board, a single list and a single card

The requirments if you see in the question. Its like 
while we are making a boardManagerService , a boardListManagerService , a UserManagerService and a CardManagerService . 

While designing all these things , 
i realised that the requirements are such that its not interacting with a single manager itself . 
its actually interacting with a lot of managers together .

So better to have a 

TrelloService class which will have 
1. boardManagerService 
2. boardListManagerService 
3. UserManagerService 
4. CardManagerService 

this should make the code cleaner and help interact accordingly 


Will be attempting this question again soon . 


Few questions which i have to ask my seniors or mayank . 

