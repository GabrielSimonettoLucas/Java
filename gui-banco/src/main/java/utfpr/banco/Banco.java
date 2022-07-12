package utfpr.banco;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<ContaBancaria> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionar(ContaBancaria novaConta) {
        if (novaConta.getNumero() == 0) {
            System.out.println("Erro: conta tem que ter um número!");
        } else {
            this.contas.add(novaConta);
        }
    }

    public ContaBancaria getConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    // IMPLEMENTAR...
    // remover
    // saldo de contas poupança
    // saldo de contas corrente
    // saldo de todas contas
    
    public String mediaSaldoCC() {
        double valor = 0;
        int contagem = 0;
        for (int a = 0; a < contas.size(); a++) {
            ContaBancaria teste = contas.get(a);
            if (teste instanceof ContaCorrente) {
                valor = valor + teste.getSaldo();
                contagem++;
            }
        }
        valor = valor / contagem;
        return "Média do saldo das contas correntes: R$" + valor;
    }

    public String mediaSaldoCP() {
        double valor = 0;
        int contagem = 0;
        for (int a = 0; a < contas.size(); a++) {
            ContaBancaria teste = contas.get(a);
            if (teste instanceof ContaPoupanca) {
                valor = valor + teste.getSaldo();
                contagem++;
            }
        }
        valor = valor / contagem;
        return "Média do saldo das contas poupança: R$" + valor;
    }

    public String mediaSaldoCB() {
        double valor = 0;
        int contagem = 0;
        for (int a = 0; a < contas.size(); a++) {
            ContaBancaria teste = contas.get(a);
            valor = valor + teste.getSaldo();
            contagem++;

        }
        valor = valor / contagem;
        return "Média do saldo das contas bancárias: R$" + valor;
    }

    public String menorSaldo() {
        ContaBancaria menor = contas.get(0);

        for (int a = 0; a < 20; a++) {
            ContaBancaria teste = contas.get(a);

            if (teste.getSaldo() < menor.getSaldo()) {
                menor = teste;
            }

        }

        return menor.getInformacoes();
    }

    public String maiorSaldo() {
        ContaBancaria maior = contas.get(0);

        for (int a = 0; a < 20; a++) {
            ContaBancaria teste = contas.get(a);

            if (teste.getSaldo() > maior.getSaldo()) {
                maior = teste;
            }

        }

        return maior.getInformacoes();
    }

    public void listarContas() {
        System.out.println("Banco: " + this.nome);
        System.out.println("Lista de contas...");
        for (ContaBancaria conta : contas) {
            System.out.println(conta.getInformacoes());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
