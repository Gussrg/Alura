alert('Jogo do número secreto');
let numeroSecreto = parseInt(Math.random() * 100 + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;

//enquanto o chute não for igual ao numero secreto
while (chute != numeroSecreto) {
    chute = prompt('Escolha um número entre 1 e 100');
    //se chute for igual ao numero secreto
    if (chute == numeroSecreto) {
        break;
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
let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa'; 
alert(`Você descobriu o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}`);

/*if (tentativas > 1) {
    alert(`Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas`);
} else {
    alert(`Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativa`);
}*/