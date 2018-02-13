//Udarbejdet af Jackie, David, Malte, Mathias

import java.io.Serializable;

public class Arbejder implements Serializable
{
    private String navn, username, password;
    private Boolean loggedIn;
    Rank rank = Rank.FORMAND;


    public Arbejder(String navn, String username, String password, Rank rank)
    {
        this.navn = navn;
        this.username = username;
        this.password = password;
        this.loggedIn = false;
        this.rank = rank;
    }


    //  Getters
    public String getNavn()
    {
        return navn;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public Boolean getLoggedIn()
    {
        return loggedIn;
    }

    public Rank getRank()
    {
        return rank;
    }

    //  Setter
    public void setLoggedIn(Boolean loggedIn)
    {
        this.loggedIn = loggedIn;
    }
}
