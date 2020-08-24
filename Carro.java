/* 
2  Até agora, nossos programas resumiam-se a 1 único arquivo contendo uma Classe que contém método MAIN 
3  (esse é o cara que executa) 
4  A partir de agora, nossos programas serão feitos, primeiro 
5     - definindo uma classe para criar um novo tipo de dado (que é este caso) 
6     - criando outra classe que tem método MAIN para manipular variáveis deste novo tipo 
7 */ 
8 
 
9 // aqui estamos definindo a estrutura (Classe) do Carro 
10 public class Carro{ 
11     // definir as variáveis que descrevem a estrutura de um carro 
12     // através do uso do "private", eu "blindo" o acesso aos atributos a partir de outras classes 
13     // ou seja, outra classe que não seja a classe "Carro", não consegue mais acessar diretamente 
14     // estes atributos. Isso aqui também é conhecido como "encapsulamento" 
15     private String  marca; 
16     private String  modelo; 
17     private int     ano; 
18     private String  cor; 
19     private double  preco; 
20     private boolean licenciado; 
21     private boolean ipvaPago; 
22 
 
23     // já que nossos atributos estão "blindados", como podemos trabalhar para ter mecanismos 
24     // que acessem / modifiquem estes atributos? 
25     // RESPOSTA: para cada atributo, criamos um método de acesso e outro de modificação 
26 
 
27     // o mercado JAVA "definiu" nomes padronizados para métodos de modificação e consulta 
28     // modificacao = SET 
29     // consulta    = GET 
30 
 
31     // exemplos: ATributo marca: getMarca e setMarcar 
32 
 
33     // chamamos popularmente isso de "Getters & Setters" 
34 
 
35 
 
36 
 
37     String getMarca(){  // crio um método chamado consultarMarca 
38         return marca;         // vou retornar o que estiver armazenado no atributo marca 
39     } 
40     // crio um método chamado modificarMarca que recebe uma informação no parâmetro NOVAMARCA 
41     // de mesmo tipo que o referido atributo. No seu corpo, eu simplesmente faço uma atribuição 
42     void setMarca(String novaMarca){ 
43         marca = novaMarca; 
44     } 
45 
 
46     String getModelo(){ 
47         return modelo; 
48     } 
49     void setModelo(String novoModelo){ 
50         modelo = novoModelo; 
51     } 
52 
 
53     int getAno(){ 
54         return ano; 
55     } 
56     void setAno(int novoAno){ 
57         ano = novoAno; 
58     } 
59 
 
60     String getCor(){ 
61         return cor; 
62     } 
63     void setCor(String novaCor){ 
64         cor = novaCor; 
65     } 
66 
 
67     double getPreco(){ 
68         return preco; 
69     } 
70     void setPreco(double novoPreco){ 
71         preco = novoPreco; 
72     } 
73 
 
74     boolean isLicenciado(){ 
75         return licenciado; 
76     } 
77     void setLicenciado(boolean novoLicenciado){ 
78         licenciado = novoLicenciado; 
79     } 
80 
 
81     boolean isIpvaPago(){ 
82         return ipvaPago; 
83     } 
84     void setIpvaPago(boolean novoIpvaPago){ 
85         ipvaPago = novoIpvaPago; 
86     } 
87 
 
88     // vou criar as funcionalidades para poder manipular o carro 
89     void exibirInfo(){ 
90         System.out.println("Carro: "+marca+"/"+modelo+" ("+ano+") Cor:" +cor+" R$ "+preco); 
91         if (licenciado){ 
92             System.out.print("     Licenciado"); 
93         } 
94         else{ 
95             System.out.print("     Documentos Pendentes"); 
96         } 
97         if (ipvaPago){ 
98             System.out.println("  IPVA Pago"); 
99         } 
100         else{ 
101             System.out.println("  IPVA a pagar"); 
102         } 
103         System.out.println("  VALOR DO IPVA R$ "+calcularIPVA()); 
104     } 
105 
 
106     private double calcularIPVA(){ 
107         double ipva; 
108         if (ano <= 2000){ 
109             ipva = 0.0; 
110         } 
111         else{ 
112             ipva = preco * 0.045; 
113         } 
114         return ipva; 
115     } 
116 } 
