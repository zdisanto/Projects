/* CHALLANGE: Make a calculator from memory of other calculators in other programming languages. Don't look up anything! */
#include <stdio.h>

int main() {
  int a, b, c;
  char op;

  printf("Input first number: ");
  scanf("%d", &a);
  printf("Input second number: ");
  scanf("%d", &b);
  printf("Select an operator (+, -, *, /): ");
  scanf("%s", &op);

  if(op == '+'){
    c = a + b;
    printf("%d + %d = %d\n", a, b, c);
  } else if(op == '-'){
    c = a - b;
    printf("%d - %d = %d\n", a, b, c);
  } else if(op == '*'){
    c = a * b;
    printf("%d * %d = %d\n", a, b, c);
  } else if(op == '/'){
    c = a / b;
    printf("%d / %d = %d\n", a, b, c);
  } else {
    printf("Invalid Operator! Try Again...\n");
  }
  return 0;
}
