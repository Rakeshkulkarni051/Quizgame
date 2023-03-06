import java.util.*;

class QuizGame
{
static int score=0,count=0; //score+=10
void guide()
{
int con;
Scanner s=new Scanner(System.in);
System.out.println("*********************************************");
System.out.println("          Wellcome to quiz game     ");
System.out.println("   Hear are some Quick Guide about game ");
System.out.println("-----------------------------------------"); 
System.out.println("1. This Quiz Questions are about General Tech to determine Tech knowledge");
System.out.println("2. The Quiz contain total 15 Questions ");	
System.out.println("3. To answer the question Press options A B C or D ");	  	 
System.out.println("4. Every Question correct Answer conatin +10 Marks");	 
System.out.println("5. Every wrong Answer have negative mark of -5 ");
System.out.println("6. Total Score Of this Game is 150");
System.out.println("----------------------------------------------");
System.out.println("Press 1 to continue 0 to exit");
con=s.nextInt();
if(con==1)
Quiz();
else
System.exit(0);
}

void Quiz()
{
char o;
Scanner op=new Scanner(System.in);
System.out.println("___________________________________________");
System.out.println(" 1.Which Companie owns The brand GOOGLE ");
System.out.print("\n A.Google pvt.ltd \n B.Android \n C.Alphabet \n D.Meta \n");
o=op.next().charAt(0);
if(o=='c' || o=='C')
{
System.out.println("Right Answer ");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option C ");
score-=5;
}
System.out.println("___________________________________________");
System.out.println(" 2.Which of the following is not a Part of Processor ");
System.out.print("\n A.Cores \n B.Threads \n C.Motherboard \n D.Clock speed\n");
o=op.next().charAt(0);
if(o=='c' || o=='C')
{
System.out.println("Right Answer ");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option C ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 3. OIS in Digital camera stands for");
System.out.print("\n A.Optical Image Stablization \n B.Optics in Sensor \n C.Ordinary Image Sensor \n D.None of the Above\n");
o=op.next().charAt(0);
if(o=='a' || o=='A')
{
System.out.println("Right Answer ");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option A ");
score-=5;
}
System.out.println("___________________________________________");
System.out.println(" 4.Whats the primary motive of Ethical Hacker ");
System.out.print("\n A.To Hack the Data \n B.To protect Data From getting Hacked \n C.To restore Hacked Data \n D.To sell the Data\n");
o=op.next().charAt(0);
if(o=='b' || o=='B')
{
System.out.println("Right Answer ");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option B");
score-=5;
}
System.out.println("___________________________________________");
System.out.println(" 5.Microsoft iconic Windows XP was launched in the year");
System.out.print("\n A.2002 \n B.2001 \n C.2000 \n D.2004\n");
o=op.next().charAt(0);
if(o=='b' || o=='B')
{
System.out.println("Right Answer ");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option B ");
score-=5;
}
System.out.println("___________________________________________");
System.out.println(" 6.Which of the following is title of First ever Youtube video uploded");
System.out.print("\n A.my first time Riding a car \n B.Me and my friends at Club \n C.Me at zoo \n D.My first youtube video\n");
o=op.next().charAt(0);
if(o=='c' || o=='C')
{
System.out.println("Right Answer ");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option C ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 7.User data stored in Browsers are called ");
System.out.print("\n A.Browsing history \n B.cache \n C.Temp files \n D.Cookies\n");
o=op.next().charAt(0);
if(o=='d' || o=='D')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option D ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 8.Which of the following is not Programing language");
System.out.print("\n A.C++ \n B.css \n C.ruby \n D.R \n");
o=op.next().charAt(0);
if(o=='b' || o=='B')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option B ");
score-=5;
}
System.out.println("___________________________________________");
System.out.println(" 9.Which version of Android is named as 'OREO'");
System.out.print("\n A.Android 8 \n B.Android 6 \n C.Android 12 \n D.Android 10\n");
o=op.next().charAt(0);
if(o=='a' || o=='A')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option A ");
score-=5;
}
System.out.println("___________________________________________");
System.out.println(" 10.Prosscesor used in Apple smartphones are called");
System.out.print("\n A.Qualcomm chipset \n B.Bionic chipsets \n C.Hexagon chipsets\n D.intel chipsets\n");
o=op.next().charAt(0);
if(o=='b' || o=='B')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option B ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 11.what was the reason behind creating Amazon.com ");
System.out.print("\n A.To sell mechanicanical parts \n B.To sell home Grocery \n C.To sell computers\n D.To sell Books\n");
o=op.next().charAt(0);
if(o=='d' || o=='D')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option D ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 12.which of the following app can be used to store Government documents legally & use it as live proof");
System.out.print("\n A.Google drive \n B.DigiLocker \n C.DropBox \n D.Both A and B\n");
o=op.next().charAt(0);
if(o=='b' || o=='B')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option B");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 13.which of the following app introduced first ever Sticker feature in chat");
System.out.print("\n A.Whats app\n B.Snapchat \n C.Hike \n D.Telegram \n");
o=op.next().charAt(0);
if(o=='c' || o=='C')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option C ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println(" 14.The Emerging Chatbot ChatGPT is owned by");
System.out.print("\n A.Tesla \n B.Google \n C.Meta \n D.OpenAi\n");
o=op.next().charAt(0);
if(o=='d' || o=='D')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option D ");
score-=5;
}

System.out.println("___________________________________________");
System.out.println("15.Which Sensor is used to Control remote Devices ");
System.out.print("\n A.Proximity sensor\n B.Controler Sensor\n C.IR balster\n D.None of the Above\n");
o=op.next().charAt(0);
if(o=='c' || o=='C')
{
System.out.println("Right Answer");
score+=10;
count++;
}
else
{
System.out.println("Wrong Answer ! its option C");
score-=5;
}
}


void result()
{
System.out.println(" ----------------------------------------------------");
System.out.println("|                                                    |");
System.out.printf ("|    Your Score is :   %d                            |\n",score);
System.out.println("|                                                    |");
System.out.printf ("|    Out of 15 you answered %d Questions Correctly   |\n",count);
System.out.println("|                                                    |");
System.out.println(" ----------------------------------------------------");
}

public static void main(String args[])
{
QuizGame baa=new QuizGame();
baa.guide();
baa.result();
}	
}