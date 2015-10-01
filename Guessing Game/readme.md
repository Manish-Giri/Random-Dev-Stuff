- - - W  E  L  C  O  M  E - - - 

This is a very simple, barebones guessing game written in HTML, CSS and Javascript.

I love coding different things whenever I get some spare time. This game was inspired by a similar such brief spell of inspiration!

Features of this game, as of now, are:

- The game has a secret number between 1 and 10 (inclusive)
- You, the user, has 5 attempts to guess the number
- Number of guesses left, at any instant, are displayed in the sidebar on the right
- If you run out of guesses, or if you successfully guess the number within 5 attempts, hit the refresh button of your browser to begin a new game.
- With every successful (more about unsuccesful cases to follow) guess, the input field automatically becomes active for the next number
- Validation - I've added quite a few checks:
	
	-- You can enter numbers only between 1 and 10(inclusive). Any number outside this range will give you an error message. Your number of guesses will not reduce.

	-- You can only enter valid "numbers". Arbitrary characters, or strings will be discarded and you will be shown an appropriate response. Again, your number of guesses will not change.

- As soon as your number of guesses hit 0, you'll be shown a response, indicating the game is over. Hit refresh to start over again. 

Things I'll be adding soon:

- UI changes using jQuery/Bootstrap
- more features
- anything you suggest!

Happy guessing!