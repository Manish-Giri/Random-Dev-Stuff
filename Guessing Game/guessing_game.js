var guesses = 5;
//random number
var secret = Math.floor(Math.random() * 10 + 1);

function guess() {
	var elGuess = document.getElementById("remaining");
	var elResult = document.getElementById("result");
	var elUserGuess = document.getElementById("number");

    //not working?
	if((typeof(elUserGuess.value) != "number") || (typeof(elUserGuess.value != "string"))) {
		elResult.textContent = "Please enter numbers only.";
	}

	var userGuess = parseInt(elUserGuess.value);



	//account for current guess
	//guesses--;

	if(guesses === 0) {
		elGuess.textContent = guesses;
		elResult.textContent = "Sorry, you ran out of guesses.";
	}	

	else if(guesses > 0) {

		if(userGuess < 0 || userGuess > 10) {
			elResult.textContent = "Please enter a valid number";
		}

		else {
			guesses--;
			elGuess.textContent = guesses;

			if(guesses === 0) {
				elResult.textContent = "Sorry, you ran out of guesses.";
			}
			
			if(userGuess == secret) {
				elResult.textContent = "Congrats! You did it";
			}

			else {
				elResult.textContent = "Sorry, please try again.";
			}
		}	


		//elGuess.textContent = guesses;

		//random number
		//var secret = Math.floor(Math.random() * 10 + 1);

		//var elUserGuess = document.getElementById("number");
		//var userGuess = parseInt(elUserGuess.value);

		

		/*if(userGuess == secret) {
			elResult.textContent = "Congrats! You did it";
		}

		else {
			elResult.textContent = "Sorry, please try again.";}
		*/
	}
}

var elSubmit = document.getElementById("submit");
elSubmit.addEventListener("click", guess, false);