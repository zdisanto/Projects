#include <stdio.h>

int main() {
  int num1, num2, ans; // num1 = first input, num2 = second input, ans = answer, op = operator.
  char op;

  printf("Input first number: "); // Get 1st Number 
  scanf("%d", &num1); // Store 1st Number
  printf("Input second number: "); // Get 2nd Number
  scanf("%d", &num2); // Store 2nd Number
  printf("Select an operator (+, -, *, /): "); // Get Operator
  scanf("%s", &op); // Store Operator

  // Psuedo Code:
  // If the the input operator (op) is equal to '+'
  // The answer is equal to num1 + num2
  // Print num1 + num2 = ans
  // (Repeat for each ELSE IF)
  if(op == '+'){
    ans = num1 + num2;
    printf("%d + %d = %d\n", num1, num2, ans); 
  } else if(op == '-'){
    ans = num1 - num2;
    printf("%d - %d = %d\n", num1, num2, ans);
  } else if(op == '*'){
    ans = num1 * num2;
    printf("%d * %d = %d\n", num1, num2, ans);
  } else if(op == '/'){
    ans = num1 / num2;
    printf("%d / %d = %d\n", num1, num2, ans);
  } else { // If the operator is something else (e.g., &, $, @, #, ! ...), print an error message
    printf("Invalid Operator! Try Again...\n");
  }
  return 0;
}
