public class ConfiguracaoSingleton {
    private static ConfiguracaoSingleton instance;

    private String urlBanco;
    private String usuario;
    private String senha;
    private int portaServidor;
    private String idiomaPadrao;

    private ConfiguracaoSingleton() {
        setIdiomaPadrao("Português");
        setSenha("Senha");
        setPortaServidor(123);
        setUrlBanco("banco.postgres");
    }

    @Override
    public String toString() {
        return "ConfiguracaoSingleton{" +
                "urlBanco='" + urlBanco + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", portaServidor=" + portaServidor +
                ", idiomaPadrao='" + idiomaPadrao + '\'' +
                '}';
    }

    public static synchronized ConfiguracaoSingleton getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoSingleton();
        }
        return instance;
    }

    public static void setInstance(ConfiguracaoSingleton instance) {
        ConfiguracaoSingleton.instance = instance;
    }

    public String getUrlBanco() {
        return urlBanco;
    }

    public void setUrlBanco(String urlBanco) {
        this.urlBanco = urlBanco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(int portaServidor) {
        this.portaServidor = portaServidor;
    }

    public String getIdiomaPadrao() {
        return idiomaPadrao;
    }

    public void setIdiomaPadrao(String idiomaPadrao) {
        this.idiomaPadrao = idiomaPadrao;
    }
}
