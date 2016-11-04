# Random Quote Machine

I built this project for one of the *ziplines* over at *FreeCodeCamp*. The original *requirements* were just to show a random quote every time a user pressed on the button to generate a random quote. 

Although this could have been done by storing predetermined quotes in an **array** and then cycling through the quotes using JavaScript while displaying each one to the user, I did one better by making an API call to a web service which, in turn, generates the random quote. This avoids the need of hard-coding quotes in JavaScript.

I used AJAX to make the API call, using an API key, which is unique for every user who signs up for this [web service](mashape.com). I styled the page content with Bootstrap and some CSS. Initially, when the page loads, the user will not see any quotes displayed on screen. Instead there will be just a **New Quote** button, pressing which will then bring up the quote and show it in a box (styled separately for displaying quotes) below the button.

As a *bonus user story*, I also implemented a **Tweet** button which, although hidden on startup, will pop up as soon as a quote is loaded on screen. A click on this **tweet** button will take the user to their Twitter page where they can tweet the quote - the contents being the quote itself along with the author of the quote.

To run this, load up the HTML file in your browser, or optionally as a shortcut, you can view this on [Codepen](http://codepen.io/Nyxx/pen/MaRvRy).

Have a nice time browsing the quotes! 
