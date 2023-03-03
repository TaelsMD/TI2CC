package pacote; 

class NovaClasse {
	
    public static void main(String[] args) {
    	
    	int num1, num2, resultado;
    	
        MyIO.println("Digite o primeiro numero: ");
        num1 = MyIO.readInt();
        
        MyIO.println("Digite o segundo numero: ");
        num2 = MyIO.readInt();
        
        resultado = num1 + num2;
        MyIO.println("Resultado da soma: " + resultado);
    }
}
