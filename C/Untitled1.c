#include<stdio.h>

int main(void)
{

    printf("*******************************************\n");
    printf("* Bem vindo ao nosso jogo de adivinhação *!\n");
    printf("*******************************************\n");

    int numeroSecreto = 42, chute, pontos =1000;

    for(int i = 1; i <=3; i++)
    {
        do
        {
            printf("tentativa %d de 3\n", i);
            printf("Qual é o seu chute?\n");
            scanf("%d",&chute);
            if(chute < 0)
            {
                printf("Você não pode digitar um numero menor que 0\n");
            }
        }
        while(chute<0);

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
            int pontosperdidos = (chute - numeroSecreto) /2;
            pontos = pontos - pontosperdidos;
    }


    printf("Fim de jogo!\n");
    //printf("");
    printf("Total de pontos: %d\n", pontos);

    return(0);
}
