import javax.swing.JOptionPane;
public class ListaAlunos {
    private Aluno[] lista;
    private int qtdAtualDeAlunos;

    public ListaAlunos(int qtdDeAlunos){
        this.lista = new Aluno[qtdDeAlunos];
        this.qtdAtualDeAlunos = 0;
    }

    public void adicionarAluno(){
        if(qtdAtualDeAlunos < lista.length){
                String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                String ra = JOptionPane.showInputDialog("Digite o RA do aluno:");
                String curso = JOptionPane.showInputDialog("Digite o curso do aluno:");

                lista[qtdAtualDeAlunos] = new Aluno(nome, ra, curso);
                qtdAtualDeAlunos++;
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o aluno, lista cheia!");
        }
    }

    public void inserirNotas(){
        String listaAlunos = "";
        JOptionPane.showMessageDialog(null, "Índices dos alunos:");
        for (int i = 0; i < qtdAtualDeAlunos; i++) {
            listaAlunos += i + " - " + lista[i].getNome() + "\n";
        }

        JOptionPane.showMessageDialog(null, listaAlunos);

        String strIndice = JOptionPane.showInputDialog("Informe o índice do aluno:");
        int indice = Integer.parseInt(strIndice);

        String strNota1 = JOptionPane.showInputDialog("Digite a nota da primeira prova do aluno:");
        String strNota2 = JOptionPane.showInputDialog("Digite a nota da segunda prova do aluno:");

        float nota1 = Float.parseFloat(strNota1);
        float nota2 = Float.parseFloat(strNota2);

        if((nota1 > 0 && nota1 <= 10) && (nota2 > 0 && nota2 <= 10)){
            lista[indice].setNota1(nota1);
            lista[indice].setNota2(nota2);
            JOptionPane.showMessageDialog(null, "Notas inseridas com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Notas inválidas!");
        }

    }

    public void menu(){
        while(true){
            String opcao = JOptionPane.showInputDialog("Insira a opção desejada:\n" + "1 - Adicionar Aluno\n" + "2 - Listar dados dos alunos\n" + "3 - Inserir notas\n" + "4 - Sair");

            int intOpcao;

            try{
                intOpcao = Integer.parseInt(opcao);
            }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Digite um número válido!!!");
                  continue;
            }
            switch(intOpcao){
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    for(int i = 0; i < qtdAtualDeAlunos; i++){
                        lista[i].exibirDados();
                    }
                    break;
                case 3:
                    inserirNotas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
