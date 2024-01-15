#include<stdio.h>

int main(void)
{

    printf("*******************************************\n");
    printf("* Bem vindo ao nosso jogo de adivinhação *!\n");
    printf("*******************************************\n");

    int numeroSecreto = 42, chute;

    for(int i = 1; i <=3; i++)
    {
        printf("tentativa %d de 3\n", i);
        printf("Qual é o seu chute?\n");
        scanf("%d",&chute);
        if(chute == numeroSecreto)
        {
            printf("Parabens!Você acertou!\n");
            printf("Jogue de novo!\n");
            break;
        }
        else
        {
            if(chute > numeroSecreto)
            {
                printf("Seu número é maior que o número secreto!\n");
            }
            if(chute < numeroSecreto)
            {
                printf("Seu número é menor que o numero secreto\n");
            }
        }
    }

    printf("Fim de jogo!\n");

    return(0);
}
