9) Write a dart script to check whether the number is Palindrome Number Or not.
void main(){
 int reminder, sum =0, temp;
 int number = 54545;
 temp = number;
 while(number>0)
 {
 reminder = number % 10; //get remainder
 sum = (sum*10)+reminder;
 number = number~/10;
 }
 
 if(sum == temp)
 {
 print('Its A Palindrome number');
 }else{
 print('Its A Not Palindrome number');
 }
}