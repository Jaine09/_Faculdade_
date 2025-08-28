import { Component, input } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './shared/header/header.component';
import { FooterComponent } from './shared/footer/footer.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HeaderComponent, FooterComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  titulo = 'Olá Mundo';
  nome = 'Meu nome é Jaíne';
  textoBotao: string = 'Clique aqui!';
  botaoDesabilitado: boolean = false;
  mensagem: string = '';
  onBotaoClicado() {
    this.mensagem = 'Você clicou no botão!';
  }

  digitando(){
    this.mensagem = "Você está digitando";
  }

}