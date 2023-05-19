package module;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.Serializable;
import java.util.HashMap;
public class Album implements Serializable {
        private String name ;
        private String popSong;

        private int num;

        public Album(){};

    public Album(String name, String popSong, int num) {
        this.name = name;
        this.popSong = popSong;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopSong() {
        return popSong;
    }

    public void setPopSong(String popSong) {
        this.popSong = popSong;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
