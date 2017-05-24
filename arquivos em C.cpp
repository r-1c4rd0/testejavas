    #include <stdio.h>
    #include <stdlib.h>
    #include <strings.h>
    struct CadProduto {
           int codigo;
           char descricao[50];
           char unidade[5];
           float preco;
    };
    CadProduto produtos[20];
    CadProduto prodTemp;
    int opt=0;
    int qtdProd=0;
    void mostrarMenu(void);
    void produtoCadastrar(void);
    void produtoBuscar(void);
    void produtoOrdenar(int tipo);
    void troca (int i, int j);
    void produtoMostrar(int pos);
    int main(void){
        while(opt !=6){
              switch(opt){
                // cadastrar 
                case 1:
                     produtoCadastrar();
                break;
                // pesquisar 
                case 2:
                     produtoBuscar();
                break;
                case 3:
                     produtoOrdenar(2);
                 break;
                 // Classificar Código
                 case 4:
                      produtoOrdenar(1);
                 break;
                 //mostrar registro
                 case 5:
                      produtoMostrar(-1);
                 break;
                 }
                 system("cls");
                 
                 mostrarMenu();
                 
                 scanf("%d",&opt);
                 }
                 return(0);
                 }
                 void mostrarMenu(void){
                      printf("1 - cadastrar registro;\n");
                      printf("2 - Pesquisar um produto pelo codigo;\n");
                      printf("3 - Classificar por ordem de descrição;\n");
                      printf("4 - Classificar pro ordem de código;\n");
                      printf("5 - Apresentar todos os registros;\n");
                      printf("6 - Sair do programa de cadastro;\n");      
                }
                void produtoCadastrar(void){
                     if (qtdProd<20){
                       printf("Digite o codigo: ");
                       scanf("%d",&produtos[qtdProd].codigo);
                       printf("Digite a descrição: ");
                       scanf("%s",produtos[qtdProd].descricao);
                       printf("Digite a unidade: ");
                       scanf("%s",produtos[qtdProd].unidade);
                       printf("Digite o preço");
                       scanf("%f",&produtos[qtdProd].preco);
                       qtdProd++;
                       printf("Produto cadastrado com sucesso !!!\n\n");
                       }else{
                       printf("Limite de 20 produtos cadastrados !!!\n\n");
                       
                       }
                       opt=0;
                       system("pause");
                       }
                       void produtoBuscar(void){
                            int i = 0, acho = 0, codigo = 0;
                            printf("Digite o codigo: ");
                            scanf("%d",&codigo);
                            while (i < qtdProd ){
                                  if (produtos[i].codigo == codigo){
                                       produtoMostrar(i);
                                       return;
                                       }
                                       i++;
                                       }
                                       printf("Produto nao encontrado...\n\n");
                                       system("Pause");
                                       }           
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                                                            
