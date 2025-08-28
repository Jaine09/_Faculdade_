function verificarLogin(){
    let usuario = document.getElementById("txtUsuario").value.trim();
    let senha = document.getElementById("txtSenha").value.trim();
    let mensagemErro = document.getElementById("mensagemErro");

    if(usuario == "senac" && senha == "2025"){
        alert("Login realizado com sucesso");
        window.location.href = "index.html";
    }else{
        alert("Usuário ou senha inválidos");
        mensagemErro.textContent = "Usuário ou senha incorretos";
        mensagemErro.style.color = "red";
    }
}

function cadastrar(){
    let usuario = document.getElementById("txtUsuario").value.trim();
    let senha = document.getElementById("txtSenha").value.trim();
    let dataNascimento = document.getElementById("txtdtNascimento").value;
    let tipoConta = document.getElementById("selTipoConta").value;

    if(usuario == "" || senha == "" || dataNascimento == "" || tipoConta == ""){
        alert("Todos os campos devem ser preenchidos");
        return;
    }else{
    validarIdade(dataNascimento);
    alert("Cadastro realizado com sucesso!!");
    }
}

function validarIdade(dataNascimento){
    let dataAtual = new Date();
    let dataNasc = new Date(dataNascimento);
    let idade = dataAtual.getFullYear() - dataNasc.getFullYear();

    if(idade < 18){
        alert("Você não pode estar aqui!! Saia");
        return;
    }else{
    alert("Seja bem-vindo");
    }
}