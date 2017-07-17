package sg.edu.rp.c346.movieslist;

/**
 * Created by 16022667 on 17/7/2017.
 */

public class ToDoItem {





    private String title;
    private String desc;

    public ToDoItem(String title, String desc) {
        this.title = title;
        this.desc = desc;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
