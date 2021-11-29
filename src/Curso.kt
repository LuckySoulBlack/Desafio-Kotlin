class Curso (nomeDocurso: String, codCurso: Int, private val quantidadeMaximaDeAlunos: Int) {
    
    val nomeDocurso: Nothing = TODO()
    val codCurso = TODO()
    


    private val alunosMatriculados: MutableList<Aluno> = mutableListOf()


        init {
            if (quantidadeMaximaDeAlunos <= 0) {
                quantidadeMaximaDeAlunos = 2
            }
        }


   
override fun equals(other: Any?): Boolean = (other 
        is Curso && this.codCurso == other.codCurso)}