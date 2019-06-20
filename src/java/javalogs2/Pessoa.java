package javalogs2;

/**
 *
 * @author jotajota
 */
public class Pessoa
{

    private String nome;
    private String apelido;
    private String idade;

    public Pessoa()
    {
        nome = "miguel";
        apelido = "Francisco";
        idade = "30";
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getApelido()
    {
        return apelido;
    }

    public void setApelido(String apelido)
    {
        this.apelido = apelido;
    }

    public String getIdade()
    {
        return idade;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
    }

}
