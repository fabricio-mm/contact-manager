import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        int i =0;
        Scanner scan = new Scanner(System.in);
        HashSet<Contato> lista = new HashSet<Contato>();
        ArrayList<Contato> contatoslista = new ArrayList<Contato>();
        TreeMap<String, Integer> arvore = new TreeMap<String, Integer>();
        lista.add(new Contato("Fabricio", "therealdrilla@outlook.com"));
        lista.add(new Contato("Raquel", "stalinerafoda@outlook.com"));
        lista.add(new Contato("Douglas", "missthegay987@gmail.com"));
        lista.add(new Contato("Armando", "misstictransformer@gmail.com"));


        // Armazenando no arraylist
        for (Contato contato: lista){
            contatoslista.add(contato);
        }

        while (true)
        {
            System.out.println("Menu\n" +
                    "[1]: Lista de Contatos. \n" +
                    "[2]: Lista Ordenada. \n" +
                    "[0]: Sair.");

            int menu = scan.nextInt();
            switch (menu)
            {
                case 1:
                    // Mostrando o index para acesso
                    for (Contato name : contatoslista) {
                        System.out.printf("%d: %s", i, name);
                        System.out.println();
                        i++;
                    }
                    System.out.println("Para quem você deseja enviar um email? ");
                    int answer = scan.nextInt();
                    System.out.println("Contato escolhido: " + contatoslista.get(answer));
                    System.out.println("Escreva sua mensagem: ");
                    System.out.println("        Destinatário: " + contatoslista.get(answer).email + "    Mensagem enviada!");
                    break;

                case 2:
                    int q = 0;
                    for (Contato ordem : contatoslista)
                    {
                        arvore.put(ordem.nome, q);
                        q++;
                    }

                    System.out.println("\nChaves do TreeMap:");
                    arvore.keySet().forEach(chave ->
                    {
                        System.out.println(chave);
                    });

                    System.out.println();
                    System.out.println("Deseja pesquisar algum contato? [S|N]");
                    String resposta = scan.next();

                    if (resposta.equals("s"))
                    {
                        System.out.println("Digite o nome do contato: ");
                        String n = scan.next();
                        imprimirValor(arvore, n);
                        break;
                    }
                    else
                    {
                        System.out.println("Saindo...");
                    }

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Digite uma opção válida. ");
                    break;
            }
        }


    }
    private static void imprimirValor(TreeMap<String, Integer> mapa, String chave)
    {
        Integer valor = mapa.get(chave);
        if (valor != null)
        {
            System.out.println("Valor associado à chave '" + chave + "': " + valor);
        }
        else
        {
            System.out.println("Chave '" + chave + "' não encontrada!");
        }
    }
}
