#include <iostream>

using namespace std;

int curr_elem_pos = -1;

void insert(int stack[], int size_of_stack, int num);
void delete_stack_elements(int stack[], int size_of_stack);
void check_size(int stack[], int size_of_stack);
void display(int stack[]);

void insert(int stack[], int size_of_stack, int num) {

  if (curr_elem_pos > -1 && num > size_of_stack - curr_elem_pos) {
    cout << "out of range" << endl;
    return;
  }
  if (curr_elem_pos == size_of_stack - 1) {
    cout << "stack overflow";
    return;
  }
  cout << num << endl;
  cout << "Enter all the elements you want to insert: \n";
  while (num != 0) {
    curr_elem_pos++;
    cin >> stack[curr_elem_pos];
    num--;
  }
}

void delete_stack_elements(int stack[], int size_of_stack) {
  if (curr_elem_pos == -1)
    cout << "stack underflow  \n";
  else {
    stack[curr_elem_pos] = -1;
    curr_elem_pos--;
  }
}

void check_size(int stack[], int size_of_stack) {
  if (curr_elem_pos == -1) {
    cout << "stack is empty \n";
  } else {
    cout << "elements inserted: " << curr_elem_pos + 1 << endl;
    cout << "size of stack: " << size_of_stack << endl;
    cout << "Remaining size in stack: " << size_of_stack - curr_elem_pos
         << endl;
  }
}

void display(int stack[]) {
  if (curr_elem_pos == -1) {
    cout << "stack underflow Enter element first....";
  } else {
    for (int i = curr_elem_pos; i >= 0; i--) {
      cout << stack[i] << "\n";
    }
  }
}

int main() {
  int *stack = NULL, size_of_stack;

  cin >> size_of_stack;
  stack = new int[size_of_stack];

  int your_choice, num;
  string y_or_n;

  do {
    cout << "choose one of the following operations you want to perform: ";
    cout << "\n1) insert ";
    cout << "\n2) delete ";
    cout << "\n3) check size ";
    cout << "\n4) show all the numbers in stack ";

    cout << "\n\nEnter your choice as in numbers: \n";
    cin >> your_choice;

    switch (your_choice) {
    case 1:
      cout << "Enter how many element you want to insert: ";
      cin >> num;
      insert(stack, size_of_stack, num);
      break;

    case 2:
      delete_stack_elements(stack, size_of_stack);
      break;

    case 3:
      check_size(stack, size_of_stack);
      break;

    case 4:
      display(stack);
      break;

    default:
      cout << "you didn't chose anything......";
      break;
    }

    cout << "\nWould you like to continue: y/n" << endl;
    cin >> y_or_n;
  } while (y_or_n == "y" || y_or_n == "yes");

  return 0;
}
