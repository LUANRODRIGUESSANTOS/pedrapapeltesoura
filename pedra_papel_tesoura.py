import random

def play(player_choice):
    choices = ['pedra', 'papel', 'tesoura']
    ai_choice = random.choice(choices)
    
    if player_choice == ai_choice:
        return f"Empate! Você escolheu: {player_choice}. IA escolheu: {ai_choice}."
    elif (player_choice == 'pedra' and ai_choice == 'tesoura') or \
         (player_choice == 'papel' and ai_choice == 'pedra') or \
         (player_choice == 'tesoura' and ai_choice == 'papel'):
        return f"Você ganhou! Você escolheu: {player_choice}. IA escolheu: {ai_choice}."
    else:
        return f"IA ganhou! Você escolheu: {player_choice}. IA escolheu: {ai_choice}."

def main():
    player_choice = input("Escolha pedra, papel ou tesoura: ")
    print(play(player_choice))

if __name__ == "__main__":
    main()
