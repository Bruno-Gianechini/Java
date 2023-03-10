class Carro 
{
    //  ATRIBUTOS.
        private String modeloCarro;
        private String corCarro;
        private int capacidadeTanque;

    /*  CONSTRUTOR SEM PARÂMETROS.
        Carro()
        {

        }
    */
    
    //  CONSTRUTOR COM PARÂMETROS.
        Carro(String modelo, String cor, int Tanque)
        {
            setModeloCarro(modelo);
            setCorCarro(cor);
            setCapacidadeTanque(Tanque);
        }


    //  MÉTODOS (GETTERS E SETTERS).
        
        public void setModeloCarro (String modelo){
            this.modeloCarro = modelo;
        }
        public String getModeloCarro (){
            return modeloCarro;
        }
        
        public void setCorCarro (String cor){
            this.corCarro = cor;
        }
        public String getCorCarro (){
            return corCarro;
        }

        public void setCapacidadeTanque (int tanque){
            this.capacidadeTanque = tanque;
        }
        public int getCapacidadeTanque(){
            return capacidadeTanque;
        }

    //  MÉTODOS.
        public void info(){
            System.out.println("\nINFORMAÇÕES DO VEÍCULO: ");
            System.out.println("MODELO: " + getModeloCarro());
            System.out.println("COR: " + getCorCarro());
            System.out.println("CAPACIDADE DO TANQUE: " + getCapacidadeTanque() + "Litros.\n");
        }
        
}
