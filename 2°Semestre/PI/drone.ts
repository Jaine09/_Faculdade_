class Drone{
    qtdCamera:number;
    marca:string = "A105";
    velocidade:number = 0;

    constructor(qtdCamera:number){
        this.qtdCamera = qtdCamera;
    }

    acelerar(novaVelocidade?:number){
        if(novaVelocidade === undefined){
            this.velocidade += 10
        } else {
            this.velocidade += novaVelocidade;
        }
    }
}

// construir objeto

const drone1 = new Drone(4);
const drone2 = new Drone(3);

drone1.acelerar();
drone2.acelerar(30);

console.log(`Velocidade drone 1: ${drone1.velocidade}`);
console.log(`Velocidade drone 2: ${drone2.velocidade}`);