#include <stdio.h>
//#include <ctype.h>
//#include <math.h>

int main() {
  int num1, num2, ans; // num1 = first input, num2 = second input, ans = answer, op = operator.
  char op;

  printf("Input first number: ");
  scanf("%d", &num1);
  printf("Input second number: ");
  scanf("%d", &num2);
  printf("Select an operator (+, -, *, /): ");
  scanf("%s", &op);

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
  } else {
    printf("Invalid Operator! Try Again...\n");
  }
  return 0;
}
