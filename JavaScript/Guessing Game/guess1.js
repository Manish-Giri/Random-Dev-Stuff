var guesses = 5;
//random number
var secret = Math.floor(Math.random() * 10 + 1);

var elGuess = document.getElementById("remaining");

//start off the game with 5 guesses displayed
elGuess.textContent = guesses;



function guess() {
	//var elGuess = document.getElementById("remaining");
	var elResult = document.getElementById("result");
	var elUserGuess = document.getElementById("number");
	var userGuess = parseInt(elUserGuess.value);

    //validation for numbers only input - has to be enhanced, isNaN is not a reliable test
	if(isNaN(userGuess)) {
		elResult.textContent = "Please enter numbers only.";
	}

	else if(!(isNaN(userGuess)) && (guesses > 0)) {

		//check if user guess is out of range
		if(userGuess <= 0 || userGuess > 10) {
			elResult.textContent = "Please enter a valid number.";
		}

		else {
			--guesses;
			elGuess.textContent = guesses;

			if(guesses == 0) {
				elResult.textContent = "Sorry, you are out of guesses.";
			}
			else {
				if(userGuess == secret) {
					elResult.textContent = "Congrats! You did it!";
				}
				else {
					elResult.textContent = "Sorry, please try again.";
				}

			}

		}
	}

	elUserGuess.focus();
	elUserGuess.value = "";

}

var elSubmit = document.getElementById("submit");
elSubmit.addEventListener("click", guess, false);