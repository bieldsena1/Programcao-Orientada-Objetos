public final class CartaPulo {
    public CartaPulo(){
        super("Pulo");
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s

            Ação: Pula a vez do jogador!
            """
            ,
            super.nome
            super.revelada;
        ))

        public void exibirInformacoes(String nome){
            if(nome == nome){
                System.out.println("Pula o jogador")
            }
            
        }
    }
}
