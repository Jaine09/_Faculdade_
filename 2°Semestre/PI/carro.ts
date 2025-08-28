class Carro{
    marca:string = "Ford";
    modelo:string = "T"
    cor:string;
    ano:number = 1998;
    velocidade:number = 0;

    constructor(novaCor:string, novaMarca:string, novoModelo:string){
        this.cor = novaCor;
        this.marca = novaMarca;
        this.modelo = novoModelo;
    }

    acelerar(novaVelocidade:number){
        if(novaVelocidade === undefined){
            this.velocidade += 10;
        } else {
            this.velocidade += novaVelocidade;
        }
    }

    frear(novoFrear:number){
        if(novoFrear === undefined){
            this.velocidade 
        } else {
            this.velocidade -= novoFrear
        }
    }

}

const meuCarro = new Carro("Branco", "Jeep", "Renegade");
meuCarro.acelerar;
meuCarro.acelerar(20);

console.log(`Velocidade: ${meuCarro.velocidade}`);

meuCarro.frear(10);
console.log(`Velocidade: ${meuCarro.velocidade}`);