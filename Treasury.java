import java.io.*;
import java.util.*;
class Treasury
{ 
  String ID, CR, name, Designation; 
  int m ,i, c1, c2; long bacno; String password;
  double BS,GP,HRA,DA,GPF,HDA,IT,netpay,Grosspay,DR;
short age; 

 Treasury ()
 {
bacno=0; 
  BS=0.0; 
  GP = 0.0; 
  HRA = 0.0; 
   DA = 0.0;
   GPF = 0.0;
    DR=0.0; 
    HDA=0.0; 
    IT = 0.0;
age= 0;     
     m=0;

netpay=0.0;
Grosspay=0.0;
   c1=0;
     c2=0;
name= null; 
  Designation= null; 
  ID = null; 
password = "SaveMoney";
 }
void PayDF() 
 { 
try
 {
InputStreamReader IR = new InputStreamReader (System.in);
BufferedReader BR = new BufferedReader (IR);
FileWriter FW = new FileWriter ("RECTREAS.txt");
BufferedWriter BW = new BufferedWriter (FW);
PrintWriter PW = new PrintWriter (BW);

for (i=0; i<1; i++)
  {
     m=i+1;
System.out.print(" Enter details for " + m);
if(m%10 == 1)
    {
if(m!=11)
System.out.print("st");
    }
else if(m%10==2)
    {
if(m!=12)
System.out.print("nd");
    }
else if(m%10==3)
   {
if(m!=13)
System.out.print("rd");
   }
else
    {
System.out.print("th");
    }
System.out.print(" person \n"); 
if (i>=1)
   {
System.out.println(" ");
     String b =BR.readLine();
   } 
   ID = null;
System.out.print (" Enter id: ");
   ID = BR.readLine();
  PW.print(ID + " ");

System.out.print("\n Enter name of Employee: ");
name = BR.readLine();PW.print(name + " ");
System.out.print ("\n Enter designation: ");
   Designation = BR.readLine ();PW.print(Designation + " ");
System.out.print("\n Enter age: ");
age = Short.parseShort (BR.readLine());PW.print(age + " ");
System.out.print("\n enter bank account number: ");
bacno = Long.parseLong (BR.readLine());PW.print(bacno + " ");
System.out.print("\n enter basic pay:");
   BS = Double.parseDouble(BR.readLine()); PW.print(BS + " ");
System.out.print("\n Enter Grade pay:");
   GP = Double.parseDouble(BR.readLine());PW.print(GP + " ");
System.out.print("\n Enter house rent allowance:");
   HRA = Double.parseDouble(BR.readLine()); PW.print(HRA + " ");
System.out.print("\n Enter Gross Provident Fund:");
   GPF = Double.parseDouble(BR.readLine());PW.print(GPF + " ");
System.out.print("\n Enter Hill Development Allowance:");
   HDA = Double.parseDouble(BR.readLine());PW.print(HDA + " ");
System.out.print("\n Enter Income tax:");
   IT = Double.parseDouble(BR.readLine());PW.println(IT + " ");
System.out.print("\n Enter Dareness allowance:");
   DA = Double.parseDouble(BR.readLine());
PW.print(DA + " ");   





  }PW.close();
 }
catch (IOException e)
 {  
System.out.print (e.getMessage());
 }
}
void readPayDF (String r) 
 { 
   String rec = r;
  Scanner Sc = new Scanner (rec);
for (int j = 1; j<=7; j++)
   {
if(Sc.hasNextDouble())
     {   
if(j == 1)
        BS = Sc.nextDouble() + ((GP + BS)*0.3*c1);
else if (j == 2)
        GP = Sc.nextDouble();
else if (j == 3) 
        HRA = Sc.nextDouble();
else if (j == 4) 
        DA= Sc.nextDouble() + c2*10;
else if (j == 5) 
        GPF = Sc.nextDouble();
else if (j == 6) 
        HDA = Sc.nextDouble();
else if (j == 7) 
        IT = Sc.nextDouble(); 
     }
}
Sc.close();

 }
void updatePay()
 {
  String day, month, year;
int mon = 0;
day = " ";
month = " ";
year = " ";
 Date d = new Date();
 String s = d.toString();
System.out.println(s);
 Scanner sc = new Scanner (s);
for (int k =1; k<=6; k++)
  {
   String a = sc.next();
if(i==1)
day = a;
else if (i==2)
month = a;
else if (i==6)
year = a;
  }
System.out.println(day + " " + month + " " + year);
if(month.equalsIgnoreCase("Jan"))
   mon = 1;
else if (month.equalsIgnoreCase("Feb"))
mon=2;
else if (month.equalsIgnoreCase("Mar"))
mon=3;
else if (month.equalsIgnoreCase("Apr"))
mon=4;
else if (month.equalsIgnoreCase("May"))
mon=5;
else if (month.equalsIgnoreCase("Jun"))
mon=6;
else if (month.equalsIgnoreCase("Jul"))
mon=7;
else if (month.equalsIgnoreCase("Aug"))
mon=8;
else if (month.equalsIgnoreCase("Sep"))
mon=9;
else if (month.equalsIgnoreCase("Oct"))
mon=10;
else if (month.equalsIgnoreCase("Nov"))
mon=11;
else if (month.equalsIgnoreCase("Dec"))
mon=12;
System.out.print(mon);

if(mon==1)
 {   
      BS = BS+(GP+BS)*0.3;
c1++;
}
if(mon==1|| mon==  7)
{   
     DA=DA+10;
c2++;
   }   
 }
void Pay()
 {
System.out.print ("\n Welcome to the pay deduction wizard");
Grosspay = BS + GP + ((BS + GP)*DA*0.01)+ (GP*HRA*0.01)+(GP*HDA*0.01)-(BS*GPF*0.01);
netpay=Grosspay-(IT*0.01);
System.out.print("\n \t\t UTTARAKHAND TREASURY DEPARTMENT");
System.out.print("\n \t\t" + "      APKI SEVA ME HAMESHA HAAZIR");
System.out.print("\n Current date and time:  " + new Date());
System.out.print("\n Your current Basic pay: " + BS);
System.out.print("\n Your current Grade Pay: " + GP);
System.out.print("\n Your current Dareness Allowance: "+ DA);
System.out.print("\n Your current House Rent Allowance: "+ HRA);
System.out.print("\n Your current Hill Development Allowance: " + HDA);
System.out.print("\n Your current Gross Provident Fund: " +GPF);
System.out.print("\n Your Gross pay: "+Grosspay);
System.out.print("\n Your current income tax: "+ IT);
System.out.print("\n Your Net Salary: " + netpay);
System.out.print("\n Thanks for using the pay deduction wizard");
}
void Affidavit()
{
try
{
InputStreamReader IR = new InputStreamReader (System.in);   
BufferedReader BR = new BufferedReader (IR);
int x,y;
System.out.println("Welcome to stamp advisory Wizard");
System.out.println( "Choose Type of Stamp");
System.out.println(" Press 1 : Non Judicial stamp"); 
System.out.println(" Press 2 : Judicial stamp");
     y = Integer.parseInt(BR.readLine());
if(y==1)
      {

System.out.println("Thanks for choosing Non Judicial type");

System.out.println("Now choose your preffered option");
System.out.println(" 1: Notary stamps \n 2: Revenue stamps \n 3:Marriage stamps\n 4:Insurance stamps \n 5: Share transfer stamps \n 6: Foreign bill stamps \n 7: Brokers note stamps \n 8: Hundi papers");
    x=Integer.parseInt(BR.readLine());
switch(x)
 {
case 1:
System.out.println(" Eligible stamps valueisRs 5");
break;
case 2:
System.out.println("Eligible stamp are from Rs 5000 onwards");
break; 
case 3:                     
System.out.println(" Eligible stamps are Rs 10 and 100");  
break;
case 4: 
System.out.println(" Eligible stamps are Rs 10,20,50,100,500,1000");
break;
case 5: 
System.out.println("Eligible stamps are Rs 5,10,50,100,200");
break;
case 6: 
System.out.println(" Eligible stamps are Rs 5,10,50,100");
break;
case 7: 
System.out.println(" Eligible stamps are Rs 5,10,50,100,200");
break;
case 8:
System.out.println(" Eligible stamps are Rs 5,10");
break;
default:
System.out.println(" Invalid Entry");
break;
                }

       }
else if(y==2)
              {
System.out.println(" Thanks for choosing Judicary Type");
System.out.println(" Eligible stamps are 50,100,200,300,500,1000,3000,5000,25000");
               }
else
        {          System.out.println(" Invalid Entry");     
 }


    }
catch (IOException e)
    {
System.out.print( e.getMessage ());
    }
  }

void PensionDF ()
{
 try
  {
   InputStreamReader IR = new InputStreamReader (System.in);
   BufferedReader BR = new BufferedReader (IR);
FileWriter FW = new FileWriter ("Pentreas.txt");
BufferedWriter BW = new BufferedWriter (FW);
PrintWriter PW = new PrintWriter (BW);
  int m;
for (i=0; i<1; i++)
  {
   m=i+1;
System.out.print("enter details for " + (m));
if(m%10 == 1)
    { 
if(m!=11)
System.out.print("st");
    }
else if(m%10==2)
    {
if(m!=12)
System.out.print("nd");
    }
else if(m%10==3)
   {
if(m!=13)
System.out.print("rd");
   }
else
    {
System.out.print("th");
    }
System.out.print(" person \n"); 
if (i>=1)
  {
System.out.println(" ");
     String b =BR.readLine();
   } 
   ID = null;
System.out.print(" Enter id: ");
   ID = BR.readLine(); PW.print(ID + " ");
System.out.print("\n Enter name of Employee: ");
name = BR.readLine();PW.print(name + " ");
System.out.print ("\n Enter designation: ");
   Designation = BR.readLine ();PW.print(Designation + " ");
System.out.print("\n Enter age: ");
age = Short.parseShort (BR.readLine());PW.print(age + " ");
System.out.print("\n enter bank account number: ");
bacno = Long.parseLong(BR.readLine());PW.print(bacno + " ");
System.out.print("\n enter basic pay:");
   BS = Double.parseDouble(BR.readLine());PW.print(BS + " ");
System.out.print("\n Enter Dareness reilef:");
   DR = Double.parseDouble(BR.readLine()); PW.print(DR + " ");   





} PW.close();
}
 catch (IOException e)
 {  
System.out.print (e.getMessage());
 }

 
}

void readPensionDF (String r)
 { 
   String rec = r;
  Scanner Sc = new Scanner (rec);
for (int j = 1; j<=7; j++)
   {
if(Sc.hasNextDouble())
     {   
if(j == 1)
       {
        BS = Sc.nextDouble();
for (int q = 1; q <= c1;q++)
        {   BS = BS + BS * 0.3;}}


else if (j == 4) 
     {
        DA= Sc.nextDouble()+c2*10;
for (int q = 1; q<=c2; q++)
        {
            DA = DA + 10;}
}
     }
}
Sc.close();

 }

 String verifyPayID (String rec)
 {
try
 { 
   String txt;
FileReader fR = new FileReader ("RECTREAS.txt");
   Scanner sC = new Scanner (fR);
for (int e = 1;e<=3;e++)
  {
while (sC.hasNext())
   {
txt = sC.next();
      Scanner sCC = new Scanner (txt);
     String VID = sCC.next();
if (rec.equalsIgnoreCase (VID))
     {
sCC.close();
return txt;
      }
   } 
System.out.print("\n The ID entered by you is invalid!! \n Please enter again. \n You have just "+(3-e)+ "  more chances to continue.");
        System.out.print("\nEnter your ID:");
        rec = new Treasury().EnterID();
  }
return null;
 }
catch (IOException e)
 {  
System.out.print (e.getMessage());
}return null;
}

 String verifyPenID (String rec)
{
try
 {
String txt;
FileReader fR = new FileReader ("Pentreas.txt");
   Scanner sC = new Scanner (fR);
for (int e = 1;e<=3;e++)
  {
while (sC.hasNext())
   {
txt = sC.next();
      Scanner sCC = new Scanner (txt);
      String BID = sCC.next();
if (rec.equalsIgnoreCase (BID))
     { 
sCC.close();
return txt;
}
   } 
System.out.print("\n The ID entered by you is invalid!! \n Please enter again. \n You have just "+(3-e)+ "  more chances to continue.");
   System.out.print("\nEnter your ID:");
        rec = new Treasury().EnterID();
  }
return null;
 }
catch (IOException e)
 {  
System.out.print (e.getMessage());
}return null;
}

void updatePension()
 {   int mon;
  String day,month,year; int monn = 0;
day = " ";
month = " ";
year = " ";
 Date d = new Date();
 String s = d.toString();
System.out.println(s);
 Scanner sc = new Scanner (s);
for (int k =1; k<=6; k++)
  {
   String a = sc.next();
if(i == 1)
day = a;
else if (i==2)
month = a;
else if (i==6)
year = a;
  }
System.out.println(day + " " + month + " " + year);
if(month.equalsIgnoreCase("Jan"))
monn=1;
else if (month.equalsIgnoreCase("Feb"))
monn=2;
else if (month.equalsIgnoreCase("Mar"))
monn=3;
else if (month.equalsIgnoreCase("Apr"))
monn=4;
else if (month.equalsIgnoreCase("May"))
monn=5;
else if (month.equalsIgnoreCase("Jun"))
monn=6;
else if (month.equalsIgnoreCase("Jul"))
monn=7;
else if (month.equalsIgnoreCase("Aug"))
monn=8;
else if (month.equalsIgnoreCase("Sep"))
monn=9;
else if (month.equalsIgnoreCase("Oct"))
monn=10;
else if (month.equalsIgnoreCase("Nov"))
monn=11;
else if (month.equalsIgnoreCase("Dec"))
monn=12;
System.out.print(monn);

if(monn==1)
 {   
      BS = BS+(GP+BS)*0.3;
c1++;
}
if(monn==1|| monn==  7)
{   
     DR=DR+10;
c2++;
   }   
 }

void Pension ()
{ 
System.out.print ("\n Welcome to the pension deduction wizard");
Grosspay = BS +(BS *DR*0.01);
netpay=Grosspay-(IT*0.01);
System.out.print("\n \t\t UTTARAKHAND TREASURY DEPARTMENT");
System.out.print("\n \t\t" + "      APKI SEVA ME HAMESHA HAAZIR");
System.out.print(" \nCurrent date and time:  " + new Date());
System.out.print("\n Your current Basic pay: " + BS);
System.out.print("\n Your current Dareness Relief: "+ DR);
System.out.print("\n Your Net Pension: " + netpay);
System.out.print("\n Thanks for using the pension deduction wizard");
}
static String EnterID() {
     Scanner I = new Scanner (System.in);
     return I.nextLine();}


public static void main (String [] args)throws Exception
 { 
InputStreamReader Ir = new InputStreamReader (System.in);
BufferedReader BR = new BufferedReader (Ir);
    Treasury T = new Treasury ();
System.out.print (" \t \t     WELCOME TO THE UTTARAKHAND TREASURY DEPARTMENT");
System.out.print ("\n \t \t                              ApkiSeva Me HameshaHaazir\n");
System.out.print("\n \t for entering data into the data file, enter Y for yes and N for no");
String pk = BR.readLine();
if (pk.equalsIgnoreCase("Y"))
         {    
for (int q = 1; q <= 3;q++)
{
System.out.print( "\n\t Enter the password"); String paa=BR.readLine();
if(T.password.equals(paa))
 {
System.out.print( "\n\t for entering pay data file , enter PA \n\t for entering pension data file, enter PE");
pk = BR.readLine();
if (pk.equalsIgnoreCase("PA"))
T.PayDF();
else if (pk.equalsIgnoreCase("PE"))
T.PensionDF();
break;
                }
else
{
System.out.print (" \n \t the password entered by you is wrong you'll get " + (3-q) + " chances more");
if(q==3)
System.out.print (" \n \t You have entered wrong password 3 times, you are not allowed to enter the data file");
else
continue;}
           }
       }


for (int q = 1;; q++)
   {
System.out.print ("\n Available Services : \n 1: Visit Your Pay Details. \n 2: Visit your Pension Details. \n 3: Create Affidavits. \n 4: Exit.");
System.out.print (" \n Enter your choice eg. 1, 2, 3 or 4");
int chk = Integer.parseInt (BR.readLine());
switch (chk)
   {
case 1:
System.out.print ("\n Please Enter your ID:");
                      String b = T.verifyPayID (EnterID());
if (b.equalsIgnoreCase(null))
                      {
System.out.print("\n You Entered Wrong ID THREE TIMES!!  SORRY , THE SERVICE HAS TO TERMINATE");
break;
                      }
else
                      {   
System.out.print ("\n The ID entered by you is correct.");
T.readPayDF(b);
T.updatePay();
T.Pay();
                       }
break;
case 2:  
System.out.print ("\n Please Enter your ID:");
  String bi = T.verifyPenID (EnterID());
if (bi.equalsIgnoreCase(null))
                      {
System.out.print("\n You Entered Wrong ID THREE TIMES!!  SORRY , THE SERVICE HAS TO TERMINATE");
break;
                      }
else
                      {  
System.out.print ("\n The ID entered by you is correct.");
T.readPensionDF(bi);
T.updatePension();
T.Pension();
                      }
break;
case 3:  
T.Affidavit();
System.out.print ("Thanks for using the Affidavit Wizard");
break;

case 4: 
System.out.print ("Thanks for using the services of the TREASURY DEPARTMENT");
break;
default:  
System.out.print (" You entered invalid choice");
break;  

   }
System.out.print("\n Do you want to continue : if yes , press Y and ENTER ,  if no,  press N and ENTER");
String cb = BR.readLine();
if (cb.equalsIgnoreCase("Y"))
continue;
else if(cb.equalsIgnoreCase("N") )
{
System.out.print ("Thanks for using the services of the TREASURY DEPARTMENT"); 
break;
}  
   }
}
}



