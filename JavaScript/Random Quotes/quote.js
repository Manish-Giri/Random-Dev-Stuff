
$(document).ready(function(){

   // $("#Quote").prop("hidden", true);
   $("#Quote").hide();
   $("#twt").hide();
   var quote ="";

	 $("#quoteBtn").click(function() {

		$.ajax({
		    url: 'https://andruxnet-random-famous-quotes.p.mashape.com/cat=famous', // The URL to the API. You can get this in the API page of the API you intend to consume
		    type: 'GET', // The HTTP Method, can be GET POST PUT DELETE etc
		    data: {}, // Additional parameters here
		    dataType: 'json',
		    success: function(data) { 
		    	console.log(data); 
		    	quote = "";
		          if($("#Quote").is(":hidden")) {
		            $("#Quote").show();
		            $("#twt").show();
		          }
		    	$("#quoteText").empty().append(data.quote);
		    	$("#quoteAuthor").empty().append(data.author)
          		quote += "\"" + data.quote + "\"" + " by " + data.author;

		    },
		    error: function(err) { alert(err); },
		    beforeSend: function(xhr) {
		    xhr.setRequestHeader("X-Mashape-Authorization", "32ROUuaq9wmshfk8uIxfd5dMc6H7p1lqdZSjsnXkB5bQtBteLK"); // Enter here your Mashape key
		    }
		});

	});
  
  
   $("#tweeter").click(function() {
     $(this).attr("href", "https://twitter.com/intent/tweet?text="+quote);
   });
   


});