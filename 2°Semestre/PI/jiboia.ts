class Jiboia{
    nome:string = "";
    especie:string = "réptil";
    tamanhoMax:number = 4;

    constructor(novoNome:string){
        this.nome = novoNome
    }

    movimentando(){
        console.log(`${this.nome} rastejando....`)
    }

    comendo(){
        console.log(`${this.nome} se alimentando...`)
    }
}

const jiboia1 = new Jiboia("Luna");
console.log(`O nome da Jiboia 01 é: ${jiboia1.nome}`);
jiboia1.movimentando();

const jiboia2 = new Jiboia("Meg");
console.log(`O nome da Jiboia 02 é: ${jiboia2.nome}`);
jiboia2.comendo();