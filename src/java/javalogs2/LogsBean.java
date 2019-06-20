package javalogs2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jotajota
 */
@Named(value = "logsBean")
@SessionScoped
public class LogsBean implements Serializable
{

//    public static Logger logger = LogManager.getFormatterLogger("Teste");
    public static Logger logger = LogManager.getLogger("LogsBean,");
    private Pessoa pessoa = new Pessoa();

    private List<Pessoa> pessoas;

    public LogsBean()
    {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoas()
    {
        logger.info("Hello, servlet!");
        logger.debug("Log 1", getPessoa().getApelido());
        logger.fatal("Logs2 %s", getPessoa().getApelido());
        pessoas.add(getPessoa());
        pessoa = new Pessoa();
    }

    public List<Pessoa> getPessoas()
    {
        return pessoas;
    }

    public Pessoa getPessoa()
    {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

}
