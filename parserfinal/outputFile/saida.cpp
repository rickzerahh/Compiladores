#include <iostream>
int main() {
int x  = 5;
int y  = 10;
int resultado  = 0;
float pi  = 3.14;
std::string nome  = "Maria";bool condicao  = true;
while(x<=y){
resultado = resultado+x;
x = x+1;
}
if(condicao){
std::cout<<"O resultado da soma é: ";
std::cout<<resultado;
}
else{
std::cout<<"A condição não foi satisfeita.";
}
std::cout<<"\nFim do programa.";
return 0;
}