package application;

public class QuestionD {

	public static int visualButtonClicked;
	public static int numberOnDice;
	public static int standard;
	public static String selectedOption;
	public static String correctOption;
	public static int counter=0;
	public static int mixedBagCounter[]=new int[] {-1,-1,-1,-1,-1,-1};
	public static int audioButtonClicked;
	
	public static String[][] que_First=new String[][] {
		{"Who is called the Iron Man of India ?","Sardar Vallabhbhai Patel","text"},
		{"Name the flower :","Poppy","/images/poppy.jpg"},
		{"Who is called the 'Missile Man' of India ?","A.P.J. Abdul Kalam","text"},
		{"Identify the tree :","Gulmohar","/images/gulmohar.jpg"}
	};
	
	public static String[][] opt_First=new String[][] {
		{"Subhash Chandra Bose","Sardar Vallabhbhai Patel","Bhimrao Ambedkar","A.P.J. Abdul Kalam"},
		{"Rose","Daisy","Poppy","Tulip"},
		{"Sardar Vallabhbhai Patel","Mahatma Gandhi","Jawaharlal Nehru","A.P.J. Abdul Kalam"},
		{"Rose","Gulmohar","Cashew","Neem"}
	};
	
	public static String[][] que_Second=new String[][] {
		{"The Ashoka Chakra in our National Flag stands for ?","Progress","/images/flag.jpg"},
		{"The famous monument Qutub Minar is located at ?","New Delhi","text"},
		{"Name the insect :","Wasp","/images/wasp.jpg"},
		{"The bird which is known as symbol of peace is ?","Dove","text"}
	};
	
	public static String[][] opt_Second=new String[][] {
		{"Prosperity","Sacrifice","Peace","Progress"},
		{"New Delhi","Amritsar","Agra","Mumbai"},
		{"Mosquito","Dragon Fly","Ant","Wasp"},
		{"Parrot","Peacock","Koyal","Dove"}
	};
	
	public static String[][] que_Third=new String[][] {
		{"Which is the smallest continent in the world ?","Australia","text"},
		{"The Nobel Prize for medicine was awarded to ?","Dr. Har Gobind Khorana","/images/khurana.jpg"},
		{"The planet closest to the Sun is ?","Mercury","text"},
		{"One of the seven wonders 'Petra' belongs to which country ?","Jordan","/images/petra.jpg"}
	};
	
	public static String[][] opt_Third=new String[][] {
		{"Australia","Africa","North America","Europe"},
		{"Dr. Har Gobind Khorana","Sir C.V. Raman","Dr. Amartya Sen","Dr. Subramaniam C."},
		{"Venus","Mercury","Mars","Neptune"},
		{"China","Peru","Mexico","Jordan"}
	};
	
	public static String[][] que_Fourth=new String[][] {
		{"Who invented the mobile phone ?","Martin Cooper","/images/mobile.jpg"},
		{"Which of the following is a part of The Martial Arts ?","Wrestling","text"},
		{"This Flag belongs to which country ?","United Kingdom","/images/england.jpg"},
		{"The famous hill station Shimla is located in ?","Himachal Pradesh","text"}
	};

	public static String[][] opt_Fourth=new String[][] {
		{"J.L. Baird","Thomas Edison","Martin Cooper","Marconi"},
		{"Swimming","Relay","Kabaddi","Wrestling"},
		{"United Kingdom","Australia","Germany","Malaysia"},
		{"Himachal Pradesh","Jammu & Kashmir","Uttarakhand","Rajasthan"}
	};
	
	public static String[][] diceNumberOne=new String[][] {
		{"ENGLISH","Rearrange the words to make a well known proverb : \nbed/early/to/rise/makes/early/to\n/healthy/man/and/wise/wealthy","Early to bed early to rise makes a man \nhealthy, wealthy and wise.","Early to ......."},
		{"MATHS","I am a number, when you add me with yourself, answer is you, and when you multiply me with yourself, answer is me. Who am I?","0","The first digit of the whole number series."},
		{"G.K. AND CURRENT AFFAIRS","North Maharashtra University is renamed as ?","Kavayitri Bahinabai Chaudhari N.M.U.","She is famous Marathi Poetess."},
		{"SCIENCE AND TECH","I am found in some thermometers,\nI move up when I get hot, I move down when I get cool. Who am I?","Mercury.","It is the smallest planet in\n our solar system."},
		{"GEOGRAPHY","Which is the highest mountain peak in Maharashtra?","Mount Kalsubai","It falls in Sahayadri Ranges."},
		{"HISTORY","Which fort was selected as the capital of Maharaja Shivaji's Kingdom ?","Raigad Fort","It is a strong hill fort near Pune."},
		{"SCHOOL RELATED","Who is the founder of C.M.C. Congregation?","St. Kuriakose Elias Chavara.","We see his statue in school premises."},
		{"SPORTS","Crawl, Backstroke and Butterfly are different methods in which sport ?","Swimming","It is water sport."},
	};
	
	public static String[][] diceNumberTwo=new String[][] {
		{"SPORTS","‘Ping – Pong’ is the alternative name for which sport?","Table – Tennis."," It is a form of Tennis game."},
		{"SCIENCE AND TECH","I am a very useful tree, my leaves are woven to make baskets and I am used for cooking. My fruit  has water inside it. Who am I?","Coconut","Hindus use me for worshipping."},
		{"HISTORY","Who is said as the ‘Father of Indian Navy’?","Chh. Shivaji Maharaj","He is son of Shahajiraje Bhosale"},
		{"SCHOOL RELATED","‘ Let nothing disturb you, \r\n" + 
				"Let nothing frighten you\r\n" + 
				"All things pass away,\r\n" + 
				"God alone suffices.’\r\n" + 
				"Who has written this poem?","St. Teresa of Avila","She is the Patroness of our school."},
		{"MATHS","Mrs. Meena gave drinks to the people coming to the fair. She gave 75 drinks. There were 12 people who did not get the drinks. How many people were there in the fair?","87","The answer is either 87 or 63."},
		{"G.K AND CURRENT AFFAIRS","Which city is also called as ‘Golden city of India’?","Jaisalmer","It is covered with golden sand and located in Rajasthan."},
		{"ENGLISH","Love, joy, freedom, courage, childhood are examples of which kind of noun?","Abstract Nouns","We cannot see it but we can only feel it."},
		{"GEOGRAPHY","Which is the second Capital of Maharashtra?","Nagpur","It is also known as ‘The Orange City’"},
	};
	
	public static String[][] diceNumberThree=new String[][] {
		{"SCHOOL RELATED","Which symbol in the School Emblem indicates:\r\n" + 
				"Excellence in Life, that enlightens and inspires students to strive and shine forth with gleams of values.\r\n" + 
				"","Star","It is also visible in the sky."},
		{"GEOGRAPHY","How many Talukas or Tehsils are present in the Jalgaon District ?","15","F _ _ _ _ _ N."},
		{"G.K. AND CURRENT AFFAIRS","A place where money is coined by authority of the Government.","Mint.","It is the name of a medicinal herb."},
		{"HISTORY","Name the Fort that was built on the Bank of river Yamuna.","Red Fort","This fort was built by Shah Jahan."},
		{"ENGLISH","What word will you get if you drop a letter from ‘PLANET’ to get something that grows in the soil?","PLANT","They are the only living things that cannot move."},
		{"MATHS","Mrs. Khurana’s biggest tomato was 20 pounds. Mrs. Malik’s biggest tomato was 14 pounds. Mrs. Sharma’s biggest tomato’s weight was 3 pounds lighter than Mrs. Khurana’s. Whose tomato was lightest.","Mrs. Malik’s tomato was the lightest.","Mrs. Sharma’s tomato weight was 20 – 3 = 17 Pounds."},
		{"SPORTS","In Karate, the highest degree is Black belt. What is the beginning level?","White Belt","It is colour of peace."},
		{"SCIENCE AND TECHNOLOGY","Shweta was asked to bring a fruit that is juicy, sweet and sour in taste and is rich in Vitamin C. Which of the following fruits should she bring","Orange.","Answer is one of the given alternatives: Apple, Orange and Lime."},
	};
	
	public static String[][] diceNumberFour=new String[][] {
		{"HISTORY","Who is the author of the book ‘Discovery of India’?","Pt. Jawaharlal Nehru.","He is the First Prime Minister of India."},
		{"G.K AND CURRENT AFFAIRS","Which is the highest waterfall in the world?","Angel Falls","It is another name for ‘Messenger of God'."},
		{"ENGLISH","What word can you get if you drop a letter from ‘MEDAL’ to get Breakfast, Lunch or Dinner?","MEAL","It is related to your food."},
		{"SCIENCE AND TECHNOLOGY","This animal gives milk and meat. The skin of this animal is used to make leather products. Which animal are we talking about?","Goat","It rhymes with ‘Coat’"},
		{"MATHS","Tanni blew half as many balloons as Ritika. Altogether they blew 18 balloons. Ritika blew 12 balloons. How many balloons did Tanni blow?","6","Half of the number of balloons blown by Ritika."},
		{"SCHOOL RELATED QUESTIONS","St. Teresa’s pursues a noble cause, service of guiding a child to bloom intellectually, spiritually into a versatile personality in this ever dynamic world to reach the zenith of success.\r\n" + 
				"What does this statement indicate?\r\n" + 
				"","Mission Statement of our school","It resembles Goal."},
		{"SPORTS","How many players are there in a volleyball team?","6","The number is hidden in ‘Hexagon’."},
		{"GEOGRAPHY","Which is the longest river in Maharashtra?","Godavari","It is the second longest river in India."},
	};
	
	public static String[][] diceNumberFive=new String[][] {
		{"SCIENCE AND TECHNOLOGY","Rahul was feeling very thirsty after playing out in the sun. He took out the bottle of cold water from the refrigerator. After some time, he saw tiny drops of water on the outer surface of the bottle. Name the process involved here.","Condensation.","It is a process of conversion of water vapour into liquid."},
		
		{"ENGLISH","Rearrange the words to make a meaningful proverb:\r\n" + 
				"Jack / a / all / play / boy / dull / makes / work / and / no\r\n" + 
				"","All work and no play\n makes Jack a dull boy.","__________________________ boy."},
		
		{"G.K. AND CURRENT AFFAIRS","Which is the cartoon character created by Walt Disney ?","Mickey Mouse.","He is a close friend of Donald Duck."},
		{"MATHS","There are three separate large boxes and inside each large box there are two separate small red boxes, inside each of these small boxes, there is one smaller blue box. How many boxes are there altogether?","15","Answer is a multiple of 3."},
		{"SPORTS","Who is the first Indian to win the Grandmaster title in chess?","Vishwanathan Anand.","His nick name is ‘Vishy’."},
		{"HISTORY","Who is the founder of Indian National Army (INA)?","Subhash Chandra Bose","He is also called as ‘Netaji’."},
		{"GEOGRAPHY","Which state is recently added in India?","Telangana.","It is separated from Andhra Pradesh."},
		{"SCHOOL RELATED","In which city is our congregation of Mother of Carmel (CMC) located in India?","Ernakulam.","It lies in the state of Kerala."},
	};
	
	public static String[][] diceNumberSix=new String[][] {
		{"SCIENCE AND TECHNOLOGY","I am a fan, but not inside the house,\r\n" + 
				"I rotate my blades but I don’t give you breeze,\r\n" + 
				"I eat wind and give you a form of energy. \r\n" + 
				"Who am I?\r\n" + 
				"","Windmill.","I am one of the best sources to generate electricity."},
		{"SPORTS","Which is India’s highest honour given for achievement in sports?","Rajiv Gandhi Khel Ratna Award.","It is named after one of our former Prime Ministers."},
		{"GEOGRAPHY","How many Union territories are present in India?","7.","The number hides in ‘Saptarishi’ , ‘Saptaswar’ etc."},
		{"HISTORY","What words are inscribed below our National Emblem, in Devanagari script?","Satyameva Jayate","Its English meaning is\n 'Truth Alone Triumphs'"},
		{"SCHOOL RELATED","What is the slogan for the month of March?","‘Good to forget, Best to forgive.’ ","Theme of the month is ‘Forgiveness’."},
		{"G.K AND CURRENT AFFAIRS","Name the place where ships can shelter from the open sea.","Harbour.","It is another name for Port."},
		{"MATHS","An odd number is greater than 3 but less than 8. Also, this number is greater than 6 but less than 10. What is the number?","7.","It is either 5 or 7."},
		{"ENGLISH","Complete this simile:\r\n" + 
				"As fast as _______.\r\n" + 
				"","Deer.","It is an animal with horns and spots on the body."},
	};
	
	
	

	public static String[][] visualQuestions=new String[][] {
		{"Identify the Festival","src/videos/boat.mp4","Onam","Festival of Kerala.","video"},
		{"Identify the Dance Form","src/videos/dance.mp4","Odissi","Indian Classical Dance of Odisha.","video"},
		{"Identify the Sport","src/videos/sportS.mp4","Surfing","Wave riding using surfboard.","video"},
		{"Identify the Monument","src/videos/temple.mp4","Konark Sun Temple","Temple dedicated to Sun God.","video"},
	};
	
	public static String[][] audioQuestions=new String[][] {
		{"Identify the Instrument","src/sounds/instrument.mp3","Tabla","A pair of drums."},
		{"Identify and Sing this Hymn","src/sounds/hymn.mp3","Hich aamchi prarthana.....","Frequently sung hymn in our school."},
		{"Identify the Sound of the Bird","src/sounds/bird.mp3","Sparrow","A common Indian Bird."},
		{"Identify the Sound","src/sounds/vehicle.mp3","Auto-Rickshaw","A common three wheeler vehicle."},
	};
	
	public static String[][] queGrpTopaz=new String[][] {
		{"Present Chief Minister of Maharashtra  ?\n","Mr. Devendra Fadnavis"},
		{"Largest four digit number ?","9999"},
		{"Foundation year of CMC congregation ?","1866"},
		{"Strongest muscle in our body ?","Tongue"},
		{"National Science day is celebrated on ?","28th February"},
		{"Currency of China ?","Yuan"},
		{"President of U.S.A lives in ?","White House"},
		{"Head of Newspaper is called as ?","Editor"},
		{"A person who carves statues is known as ?","Sculptor"},
		{"1 m = ? mm","1000 mm"},
		{"Full form of CPU ?\n","Central Processing Unit."},
		{"Baby of deer is called ?","Fawn"},
	};
	
	public static String[][] queGrpIndicolite=new String[][] {
		{"Present President of India ?","Mr. Ramnath Kovind"},
		{"Smallest four digit number ?","1000"},
		{"The year in which Jalgaon St. Teresa’s Convent turned in to classroom ?","17th June 1991\n"},
		{"Universal Blood Donor Group ?","O"},
		{"World water day is celebrated on ?","22nd March"},
		{"Currency of Japan ?","Yen"},
		{"President of India lives in ?","Rashtrapati Bhavan"},
		{"Head of Army is called as ?","General"},
		{"A person who mends taps and pipes ?","Plumber"},
		{" 10 dozens is how many items ?","120 items"},
		{"Full form of RAM ?\n","Random Access Memory"},
		{"______ is used to store cooking gas ?","Cylinder"},
	};
	
	public static String[][] queGrpMelopearl=new String[][] {
		{"The district in which we live ?","Jalgaon"},
		{"Smallest odd Natural number ?","1"},
		{"Theme of our school for the year 2018 – 19 ?\n","Shalom – Be the peace you seek"},
		{"Normal body temperature of a human being in Celcius ?","37 degree Celcius"},
		{"International Women’s Day is celebrated on ?","March 8th"},
		{"Currency of United Kingdom ?","Pound Sterling"},
		{"Pope lives in ?","Vatican City"},
		{"Head of Navy is called as ?","Admiral"},
		{"A person who designs buildings is ?","Architect"},
		{"1 cm = ? mm","10 mm"},
		{"Full form of PTO ?","Please Turn Over"},
		{"Baby of frog ?","Tadpole"},
	};
	
	public static String[][] queGrpEmerald=new String[][] {
		{"Capital of Maharashtra ?","Mumbai"},
		{"Predecessor of number 400  ?","399"},
		{"Motto of our school ?","Life in Fullness"},
		{"Tearing teeth are also known as ?","Canines"},
		{"World Environment day is celebrated on ?","5th June"},
		{"Currency of Sri Lanka ?","Srilankan Rupee"},
		{"Monks live in a ?","Monastery"},
		{"Head of Air Force is called as ?","Air Chief Marshal"},
		{"A person who lays bricks in constructions is known as ?","Mason"},
		{" ½ kg = ? Grams","500 grams."},
		{"Full form of ROM ?","Read Only Memory"},
		{" ______ is used to keep soap ?","Soap Case"},
	};
	
	
	public static boolean checkAnswer()
	{
		if(standard==1)
		{
			if(que_First[QuestionD.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				QuestionD.correctOption=que_First[QuestionD.counter][1];
				return false;
			}
				
		}
		else if(standard==2)
		{
			if(que_Second[QuestionD.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				QuestionD.correctOption=que_Second[QuestionD.counter][1];
				return false;
			}
				
		}
		else if(standard==3)
		{
			if(que_Third[QuestionD.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				QuestionD.correctOption=que_Third[QuestionD.counter][1];
				return false;
			}
				
		}
		else if(standard==4)
		{
			if(que_Fourth[QuestionD.counter][1].equals(selectedOption))
			{
				return true;
			}
			else
			{
				QuestionD.correctOption=que_Fourth[QuestionD.counter][1];
				return false;
			}
		}
		return false;
	}
	
}
