class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("M&M Color Counts");

    int totalCandy = 55 * 10;
    double numBlue = totalCandy * .24;
    double numBrown = totalCandy * .13;
    double numGreen = totalCandy * .16;
    double numOrange = totalCandy * .20;
    double numRed = totalCandy * .13;
    double numYellow = totalCandy * .14;
    double sumColor = numBlue + numBrown + numGreen + numOrange + numRed + numYellow;

    System.out.println("Blue: " + numBlue);
    System.out.println("Brown: " + numBrown);
    System.out.println("Green: " + numGreen);
    System.out.println("Orange: " + numOrange);
    System.out.println("Red: " + numRed);
    System.out.println("Green: " + numYellow);

    System.out.println("Sum: " + sumColor);

    if (numBlue > numBrown && numGreen > numOrange)
    {
      System.out.println("Blue over Brown and Green over Orange");
    }

    if (numBrown <= numRed)
    {
      System.out.println("Brown is less than or equal to Red");
    }

    if ((int)Math.round(sumColor) == totalCandy)
    {
      System.out.println("Numbers Match");
    }
    //I actually learned C# in high school and the formatting is a bit different with squiggly brackets here but I've seen it before. So I'll be reformatting my stuff to be a bit more in line like this from here on out, just an fyi :)
  }
}