#include <iostream>
int main() {
std::string mensagem  = "Digite um número inteiro: ";std::string msgNumero  = "Você digitou o número: ";int numero;
std::cout<<mensagem;
std::cin>>numero;
std::cout<<msgNumero;
std::cout<<numero;
std::cout<<"\n";
return 0;
}