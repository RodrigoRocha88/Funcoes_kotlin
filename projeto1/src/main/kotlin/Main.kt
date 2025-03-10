fun main() {
    exibirNome()
    exibirNomeComComentario()
    operacoesMatematicas(10.0, 22.0)
    calcularAreaRetangulo(4.0, 6.0)
    exibirString("Vai Gigante da Colina!!!")

    val itens = arrayOf("Maçã", "Banana", "Uva")
    exibirArray(itens)

    val lista = mutableListOf("Chuteira", "Meião")
    adicionarItemArray(lista, "Bola de futsal")
    println(lista)

    validarSenha("1234", "1235")
    compararValores(110, 220)
    repetirMensagem("Turn down for what!!!", 3)
}

// Exercício 1: Função que exibe o nome
fun exibirNome() {
    println("Meu nome é Rodrigo")
}

// Exercício 2: Função que exibe o nome com comentário
fun exibirNomeComComentario() {
    // Esta função exibe o nome
    println("Meu nome é Rodrigo e eu gosto de jogar")
}

// Exercício 3: Função para calcular soma, subtração, divisão e multiplicação
fun operacoesMatematicas(a: Double, b: Double) {
    println("Soma: ${a + b}")
    println("Subtração: ${a - b}")
    println("Multiplicação: ${a * b}")
    println("Divisão: ${a / b}")
}

// Exercício 4: Função que calcula a área de um retângulo
fun calcularAreaRetangulo(largura: Double, altura: Double) {
    val area = largura * altura
    println("A área do retângulo é: $area")
}

// Exercício 5: Função que exibe uma string
fun exibirString(mensagem: String) {
    println("A mensagem é: $mensagem")
}

// Exercício 6: Função que exibe os valores de um array
fun exibirArray(itens: Array<String>) {
    for (item in itens) {
        println(item)
    }
}

// Exercício 7: Função que adiciona itens a um array
fun adicionarItemArray(array: MutableList<String>, novoItem: String) {
    array.add(novoItem)
    println("Item adicionado: $novoItem")
}

// Exercício 8: Função para comparar uma senha de acesso
fun validarSenha(senhaCorreta: String, tentativa: String) {
    if (senhaCorreta == tentativa) {
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}

// Exercício 9: Função que compara dois valores e exibe o maior e o menor
fun compararValores(a: Int, b: Int) {
    if (a > b) {
        println("Maior: $a, Menor: $b")
    } else if (b > a) {
        println("Maior: $b, Menor: $a")
    } else {
        println("Os valores são iguais: $a")
    }
}

// Exercício 10: Função que cria uma estrutura de repetição
fun repetirMensagem(mensagem: String, vezes: Int) {
    for (i in 1..vezes) {
        println("$i: $mensagem")
    }
}