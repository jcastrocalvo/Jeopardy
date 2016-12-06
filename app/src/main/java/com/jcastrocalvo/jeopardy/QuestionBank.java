package com.jcastrocalvo.jeopardy;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Joaquin on 12/5/2016.
 */

public class QuestionBank {

	//History
	public String[] GetHistoryQuestion(int difficulty){
		switch (difficulty) {
			case 2:
				return new String[] {"This was established to discourage European interference in Central and South America", "Monroe Doctrine"};
			case 4:
				return new String[] {"This was established to promote domestic manufacturing and limit foreign trade", " Protective Tariff"};
			case 6:
				return new String[] {"The idea that Americans had a right to the land in North America", " Manifest Destiny"};
			case 8:
				return new String[] {"The idea advocated by Herbert Spencer that people and companies should be subject to \"natural selection\" of sorts", "Social Darwinism"};
			case 10:
				return new String[] {"The river that became the border for Texas", "Rio Grande"};
			default:
				return new String[] {"Empty", "Empty"};
		}
	}
	//Math
	public String[] GetMathQuestion(int difficulty){
		switch (difficulty) {
			case 2:
				return new String[] {"What's the top number of a fraction called?", "The numerator"};
			case 4:
				return new String[] {"What number does \"giga\" stand for?", "One Billion"};
			case 6:
				return new String[] {"What's short for \"binary digit\"", "Bit"};
			case 8:
				return new String[] {"What handy mathematical instrument's days were numbered when the pocket calculator made the scene in the 1970s?", "The Slide rules"};
			case 10:
				return new String[] {"What century did mathematicians first use plus and minus signs?", "16th Century"};
			default:
				return new String[] {"Empty", "Empty"};
		}
	}
	//Chemistry
	public String[] GetChemQuestion(int difficulty){
		switch (difficulty) {
			case 2:
				return new String[] {"What is the first element on the periodic table?", "Hydrogen"};
			case 4:
				return new String[] {" What is the centre of an atom called?", "Nucleus"};
			case 6:
				return new String[] {"What is the chemical symbol for gold?", "Au"};
			case 8:
				return new String[] {" Is sodium hydroxide (NaOH) an acid or base?", "Base"};
			case 10:
				return new String[] {"What is the fourth most abundant element in the universe in terms of mass?", "Carbon"};
			default:
				return new String[] {"Empty", "Empty"};
		}
	}
	//Literature
	public String[] GetLitQuestion(int difficulty){
		switch (difficulty) {
			case 2:
				return new String[] {"What word, extended from a more popular term, refers to a fictional book of between 20,000 and 50,000 words?", "Novella"};
			case 4:
				return new String[] {"Who wrote the seminal 1936 self-help book How to Win Friends and Influence People? ", "Dale Carnegie"};
			case 6:
				return new String[] {"What is the Old English heroic poem, surviving in a single copy dated around the year 1000, featuring its eponymous 6th century warrior from Geatland in Sweden? ", "Beowulf"};
			case 8:
				return new String[] {"The ISBN (International Standard Book Number) code was increased to how many digits from 1 January 2007? ", "13"};
			case 10:
				return new String[] {"What was Christopher Latham Scholes' significant invention of 1868? ", "Typewriter"};
			default:
				return new String[] {"Empty", "Empty"};
		}
	}
	//English
	public String[] GetEnglishQuestion(int difficulty){
		switch (difficulty) {
			case 2:
				return new String[] {"What was the title of Tolkien's sequel to The Hobbit?", "The Lord of the Rings"};
			case 4:
				return new String[] {"What is a three-line, 17-syllable Japanese verse-form?", "Haiku"};
			case 6:
				return new String[] {"Which Dickens novel was left unfinished at the time of his death?", "Edwin Drood"};
			case 8:
				return new String[] {"Which English poet was the Latin secretary to Oliver Cromwell's Council of state during the Commonwealth period?", "John Milton"};
			case 10:
				return new String[] {"Which title is held by the character Edmund Dantes in a novel by Alexander Dumas?", "The Count of Monte Cristo"};
			default:
				return new String[] {"Empty", "Empty"};
		}
	}
	//Science
	public String[] GetScienceQuestion(int difficulty){
		switch (difficulty) {
			case 2:
				return new String[] {"What is opposite to matter?", "Antimatter"};
			case 4:
				return new String[] {"What is the hardest substance in the human body?", "Tooth Enamel"};
			case 6:
				return new String[] {"How much salt does the average human body contain?", "250 grams"};
			case 8:
				return new String[] {"What's the lifespan of a human red blood cell?", "120 Days"};
			case 10:
				return new String[] {"What does TCP/IP stand for?", "Transmission Control Protocol / Internet Protocol. "};
			default:
				return new String[] {"Empty", "Empty"};
		}
	}
}
