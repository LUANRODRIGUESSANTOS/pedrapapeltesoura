function play(playerChoice) {
    const choices = ['pedra', 'papel', 'tesoura'];
    const aiChoice = choices[Math.floor(Math.random() * choices.length)];
    
    let result;
    if (playerChoice === aiChoice) {
        result = "Empate!";
    } else if (
        (playerChoice === 'pedra' && aiChoice === 'tesoura') ||
        (playerChoice === 'papel' && aiChoice === 'pedra') ||
        (playerChoice === 'tesoura' && aiChoice === 'papel')
    ) {
        result = "Você ganhou!";
    } else {
        result = "IA ganhou!";
    }

    document.getElementById('result').innerText = 
        `Você escolheu: <span class="choice">${playerChoice}</span>. IA escolheu: <span class="choice">${aiChoice}</span>. ${result}`;
}
