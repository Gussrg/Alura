alert('Jogo do número secreto');
let numeroSecreto = 5;
console.log(numeroSecreto)
let chute = prompt('Escolha um número entre 1 e 10');

//se chute for igual ao numero secreto
if(numeroSecreto == chute) {
    console.log('Você descobriu o número secreto (5)');
} else {
    alert('Você errou');
}
