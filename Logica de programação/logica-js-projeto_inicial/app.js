alert('Jogo do número secreto');
let numeroSecreto = 6;
console.log(numeroSecreto);
let chute;
let tentativas = 1;

//enquanto o chute não for igual ao numero secreto
while (chute != numeroSecreto) {
    chute = prompt('Escolha um número entre 1 e 10');
    //se chute for igual ao numero secreto
    if (chute == numeroSecreto) {
        alert(`Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas`);
    } else {
        if (chute > numeroSecreto) {
            alert(`O numero secreto é menor que ${chute}`);
        } else {
            alert(`O número secreto é maior que ${chute}`);
        }
        //tentativas = tentativas +1;
        tentativas++;
    }
}