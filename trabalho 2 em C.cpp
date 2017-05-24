#include<stdio.h>
int checaChar(char c);
char letra;
int main(void){
	printf("Digite um caractere: ");
	scanf("%c",&letra);
	if(checaChar(letra)==0){
		printf("Voce digitou uma VOGAL: %c\n\n", letra);
	}else if(checaChar(letra)==1){
		printf("Voce digitou uma CONSOANTE: %c\n\n", letra);		
	}else {
		printf("Voce digitou um NUMERO: %c\n\n", letra);
	}
	return(0);
	}
	int checaChar(char c){
		switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return(0);
			break;
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return(2);
			default:
				return(1);			
		}
	}
