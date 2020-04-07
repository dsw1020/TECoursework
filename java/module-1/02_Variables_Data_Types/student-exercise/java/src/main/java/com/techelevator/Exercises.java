package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		
		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println();
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoonsInWoods = 3;
		int numberOfRacoonsEatingDinner = 2;
		int numberOfRacoonsLeftInWoods = numberOfRacoonsInWoods - numberOfRacoonsEatingDinner;
		System.out.println(numberOfRacoonsLeftInWoods);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int difference = flowers - bees; 
		
		System.out.println(difference);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int otherPigeon = 1; 
		int eatingBreadcrumbs = lonelyPigeon + otherPigeon;
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int beginOwl = 3;
		int moreOwl = 2;
		int fenceOwls = beginOwl + moreOwl; 
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaverHomies = 2; 
		int beaverLeavies = 1;
		int stayAtHomeBeavers = beaverHomies - beaverLeavies;
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int twoCans = 2;
		int oneCan = 1;
		int threeCans = twoCans + oneCan;
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2; 
		int nutlessSquirrels = squirrels - nuts;
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarterValue = .25;
		double dimeValue = .10;
		double nickelValue = .05;
		
		double totalChange = quarterValue + dimeValue + nickelValue + nickelValue;
		
		System.out.println(totalChange);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffin = 18;
		int macadamMuffin = 20;
		int flanneryMuffin = 17;
		
		int totalMuffin = brierMuffin + macadamMuffin + flanneryMuffin;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = .24;
		double whistleCost = .14;
		
		double totalCost = yoyoCost + whistleCost;
		
		System.out.println(totalCost);
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int bigMallow = 8;
		int littleMallow = 10;
		int totalMallow = bigMallow + littleMallow;
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltInches = 29;
		int brecknockInches = 17;
		int differenceInInches = hiltInches - brecknockInches;
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltWallet = 10;
		int toyTruck = 3; 
		int penCil = 2;
		int moneyLeft = hiltWallet - toyTruck - penCil;
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbleCollection = 16;
		int missingMarbles = 7;
		int marblesLeft = marbleCollection - missingMarbles;
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int currentShells = 19;
		int neededTotalShells = 25;
		int shellsNeeded = neededTotalShells - currentShells;
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBallons = 17;
		int redBallons = 8;
		int greenBallons = totalBallons - redBallons;
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int addedBooks = 10;
		int newTotalBooks = booksOnShelf + addedBooks;
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int totalBees = 8;
		int totalBeeLegs = beeLegs * totalBees;
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamCone = 0.99;
		double totalCones = 2.00;
		double totalConeCost = iceCreamCone * totalCones;
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int currentRocks = 64;
		int neededRocks = 125;
		int rocksToBuy = neededRocks - currentRocks;
		
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int hiltsMarbleCollection = 38;
		int losingHerMarbles = 15;
		int leftoverMarbles = hiltsMarbleCollection - losingHerMarbles;
		
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesInTrip = 78;
		int gasStop = 32;
		int remainderOfTrip = totalMilesInTrip - gasStop;
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int saturdayMorningSnowShoveling = 90;
		int saturdayAfternoonSnowShoveling = 45;
		int totalShovelTime = saturdayMorningSnowShoveling + saturdayAfternoonSnowShoveling;
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double hotDogs = 6.00;
		double costOfHotDog = 0.50;
		double totalHotDogCost = hotDogs * costOfHotDog;
		
		System.out.println(totalHotDogCost);
		
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int moneyInWallet = 50;
		int pencilCost = 7;
		int howManyPencilsCanSheBuy = moneyInWallet / pencilCost;
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterflies - orangeButterflies;
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double katesPayment = 1.00;
		double katesCandyCost = .54;
		double katesChange = katesPayment - katesCandyCost;
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int currentTrees = 13; 
		int potentialTrees = 12;
		int possibleTotalTrees = currentTrees + potentialTrees;
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTillGrandma = 2;
		int hoursInDay = 24; 
		int hoursTillGrandma = daysTillGrandma * hoursInDay;
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int gumPerCousin = 5;
		int totalAmountOfGumNeeded = kimsCousins * gumPerCousin;
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int moneyDanHas = 3;
		int costOfCandyBar = 1;
		int moneyLeftInDansWallet = moneyDanHas - costOfCandyBar;
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnLake = 5;
		int peopleOnEachBoat = 3;
		int peopleOnLake = boatsOnLake * peopleOnEachBoat;
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegoCollection = 380;
		int ellensMissingLegos = 57;
		int currentStatusOfEllensCollection = ellensLegoCollection - ellensMissingLegos;
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int currentMuffinCount = 35;
		int totalMuffinsNeededByArthur = 83;
		int muffinsToBake = totalMuffinsNeededByArthur - currentMuffinCount;
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int differenceBetweenThem = willysCrayons - lucysCrayons;
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickersOnAllPages = stickersPerPage * pagesOfStickers;
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakes = 96;
		int totalNumberOfKids = 8;
		int cupcakesPerChild = totalCupcakes / totalNumberOfKids;
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalGingerbreadCookies = 47;
		int cookiesPerJar = 6;
		int leftoverCookies = totalGingerbreadCookies % cookiesPerJar;
		
		System.out.println(leftoverCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissants = 59;
		int numberOfNeighbors = 8;
		int croissantsLeftover = totalCroissants % numberOfNeighbors;
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int totalOatmealCookies = 276;
		int numberOfTraysNeeded = totalOatmealCookies / cookiesPerTray;
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzels = 480;
		int pretzelsPerServing = 12;
		int totalServingsOfPretzels = totalPretzels / pretzelsPerServing;
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int cupcakesUsed = 51;
		int cupcakesPerBox = 3;
		int totalBoxesOfCupcakes = cupcakesUsed / cupcakesPerBox;
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int preparedCarrotSticks = 74;
		int carrotsPerGuest = 12;
		int leftoverCarrots = preparedCarrotSticks % carrotsPerGuest;
		
		System.out.println(leftoverCarrots);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int totalShelvesNeeded = totalTeddyBears / teddyBearsPerShelf;
		
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20; 
		int totalPictures = 480;
		int albumsNeeded = totalPictures / picturesPerAlbum; 
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalTradingCards = 94;
		int maximumCardsPerBox = 8; 
		int boxesFilledWithCards = totalTradingCards / maximumCardsPerBox;
		int leftoverCards = totalTradingCards % maximumCardsPerBox;
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalBooks = 210;
		int numberOfShelves = 10;
		int booksPerShelf = totalBooks / numberOfShelves;
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int cristinasCroissants = 17;
		int cristinasFriends = 7;
		int croissantsPerFriend = cristinasCroissants / cristinasFriends;
		
				
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
	
		int linearFeetPerRoom = (12 + 14) * 2;
		double averageFeetPerHourBill = linearFeetPerRoom / 2.15;
		double averageFeetPerHourJill = linearFeetPerRoom / 1.90;
		
		double combinedFeetPerHour = averageFeetPerHourBill + averageFeetPerHourJill;
		int numberOfRooms = 5;
		int totalLinearFeet = linearFeetPerRoom * numberOfRooms;
		double timeToPaintFiveRooms = totalLinearFeet / combinedFeetPerHour;
		
		System.out.println(timeToPaintFiveRooms);
		
		// Challenge
		numberOfRooms = 623;
		totalLinearFeet = linearFeetPerRoom * numberOfRooms;
		
		double timeToPaintApartmentComplex = totalLinearFeet / combinedFeetPerHour;
		double daysToPaintApartmentComplex = timeToPaintApartmentComplex / 8;
		
		System.out.println(daysToPaintApartmentComplex);
		
		
		
		
	
		
		 
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		String nameFirst = "David ";
		String nameLast = "Weinberger, ";
		String nameMiddle = "S.";
		
		String nameFull = nameLast + nameFirst + nameMiddle;
		
		System.out.println(nameFull);
		
				
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		double totalMileageTrainTravels = 800;
		double currentDistanceTraveled = 537;
		double percentTraveledSoFar = currentDistanceTraveled / totalMileageTrainTravels;
		
		System.out.println(percentTraveledSoFar);
		
		int integerValue = (int)(percentTraveledSoFar*100);
		
		System.out.println(integerValue);
		

	}

}
