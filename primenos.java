class primenos
{
 public static void main(String args[])
 {
  int num,div,rem,flag;
  for (num=3;num<10;num++)
  {
   flag=1;
   for (div=2;div<=(num/2);div++)
   {
    rem=num%div;
    if (rem==0)
    flag=0;
   }
  if (flag==1)
   System.out.println (num +" is a Prime Number");
  else
   System.out.println (num +" is not a Prime Number");
  }
 }
}
