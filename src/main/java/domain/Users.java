package domain;

//본인의 테이블에 맞는 객체를 구성하시면 됩니다.
public class Users {
    protected long id;
    protected String char_server;
    protected String nick_name;
    protected String char_class;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getChar_server() { return char_server; }

    public void setChar_server(String char_server) { this.char_server = char_server; }

    public String getNick_name() { return nick_name; }

    public void setNick_name(String nick_name) { this.nick_name = nick_name; }

    public String getChar_class() {
        return char_class;
    }

    public void setChar_class(String char_class) {
        this.char_class = char_class;
    }
}